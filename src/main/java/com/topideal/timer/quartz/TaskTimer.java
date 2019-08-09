package com.topideal.timer.quartz;

import com.topideal.timer.thread.TaskThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *  校验批次库存明细商品效期是否已过期
 * @author baols
 *
 */
@Component
public class TaskTimer {

	@Autowired
	private TaskThread taskThread;

    /**
     * 每天凌晨00点01分校验批次庫存的商品效期是否已过期
     */
	@Scheduled(cron = "0 0/1 * * * ? ")
    public void CheckProductValidityInfo(){
		taskThread.execute();

    }
    
}
