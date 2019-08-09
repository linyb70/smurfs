package com.topideal.tools;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by weixiaolei on 2019/1/24.
 */
public class MQProductFactory {

    private static Map<String,DefaultMQProducer> pool=new HashMap<String,DefaultMQProducer>();


    public static DefaultMQProducer getProducer(String namesrvAddr,String producerGroup)throws MQClientException{
        //找到直接返回
        if(pool.containsKey(namesrvAddr)){
           return pool.get(namesrvAddr);
       }
        DefaultMQProducer defaultMQProducer =createProducer(namesrvAddr,producerGroup);
        pool.put(namesrvAddr,defaultMQProducer);
       return defaultMQProducer;
    }


    private  static  DefaultMQProducer createProducer(String namesrvAddr,String producerGroup)throws MQClientException {
        // 初始化
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer(producerGroup);
        defaultMQProducer.setNamesrvAddr(namesrvAddr);
        defaultMQProducer.setInstanceName(String.valueOf(System.currentTimeMillis()));
        defaultMQProducer.start();
        return defaultMQProducer;
    }






}
