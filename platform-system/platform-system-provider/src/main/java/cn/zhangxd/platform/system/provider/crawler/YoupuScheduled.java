package cn.zhangxd.platform.system.provider.crawler;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * Created by zhangxd on 2016/12/12.
 */
@Component
public class YoupuScheduled {

    @Autowired
    private YoupuPipeline ratePipeline;

    @Scheduled(cron = "0 0/5 * * * ? ")
    public void BankOfChinaScheduled() {
    	System.out.println("定时任务：" + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS"));
		//Spider.create(new YoupuProcessor()).addUrl("http://www.youpu.cn/Destination").addPipeline(ratePipeline).thread(5).run();
    }

}
