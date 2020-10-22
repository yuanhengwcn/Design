package com.yuanheng.spring.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.job
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 15:52
 */
public class SendMailJob implements Job {

    private Logger logger = LoggerFactory.getLogger(SendMailJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("管理员同志");
    }
}
