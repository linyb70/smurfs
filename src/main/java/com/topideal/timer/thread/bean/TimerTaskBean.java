package com.topideal.timer.thread.bean;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.topideal.mybatis.entity.TimerTaskModel;
import com.topideal.tools.CalculateNextTimer;
import com.topideal.tools.MQProductFactory;
import com.topideal.mybatis.entity.TimerTaskVo;
import com.topideal.timer.service.TimerTaskService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * Created by weixiaolei on 2019/1/24.
 */
public class TimerTaskBean implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(TimerTaskBean.class);


    //数据实体类
    private TimerTaskVo timerTaskVo;
    //service
    private TimerTaskService timerTaskService;

    public TimerTaskBean(TimerTaskService timerTaskService,
                         TimerTaskVo timerTaskVo){
        this.timerTaskService=timerTaskService;
        this.timerTaskVo=timerTaskVo;
    }


    @Override
    public void run() {
        try {
            //一、获取参数
            String namesrvAddr=timerTaskVo.getServerIp()+":"+timerTaskVo.getServerPost();
            String producerGroup=timerTaskVo.getProducerGroup();
            String topic=timerTaskVo.getTopic();
            String tags=timerTaskVo.getTags();
            Timestamp nextTriggerDate=timerTaskVo.getNextTriggerDate();
            String periodType=timerTaskVo.getPeriodType();
            Integer intervalTime=timerTaskVo.getIntervalTime();
            //二、空值校验
            if(StringUtils.isBlank(namesrvAddr)||
                    StringUtils.isBlank(producerGroup)||
                    StringUtils.isBlank(topic)||
                    StringUtils.isBlank(tags)||
                    nextTriggerDate==null||
                    StringUtils.isBlank(periodType)||
                    intervalTime==null){
                timerTaskService.saveTaskRecord(timerTaskVo,"0","必填字段为空");
            }
            //发送任务
            DefaultMQProducer defaultMQProducer = MQProductFactory.getProducer(namesrvAddr, producerGroup);
            Message message = new Message(topic, tags,String.valueOf(System.currentTimeMillis()),"{}".getBytes("utf-8"));
            //发送信息
            SendResult sendResult = defaultMQProducer.send(message);
            if(sendResult.getSendStatus() == SendStatus.SEND_OK){
                //下一个时点
                Timestamp nextTimer= CalculateNextTimer.getInstance().calculate(nextTriggerDate,periodType,intervalTime);
                TimerTaskModel model=new TimerTaskModel();
                model.setId(timerTaskVo.getTaskId());
                model.setNextTriggerDate(nextTimer);
                //修改下次触发时点
                timerTaskService.modifyNextTime(model);
                //保存执行记录
                timerTaskService.saveTaskRecord(timerTaskVo,"1",null);
            }else{
                timerTaskService.saveTaskRecord(timerTaskVo,"0","推送MQ失败");
            }

        } catch (InterruptedException e) {
            logger.error("MQ发送消息："  + e.getMessage(), e);
        } catch (RemotingException e) {
            logger.error("MQ发送消息："  + e.getMessage(), e);
        } catch (MQClientException e) {
            logger.error("MQ发送消息："  + e.getMessage(), e);
        } catch (MQBrokerException e) {
            logger.error("MQ发送消息："  + e.getMessage(), e);
        }catch(Exception e){
            logger.error("MQ发送消息："  + e.getMessage(), e);
        }
        finally {

        }

    }
}
