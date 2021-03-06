package com.qin.dcesp.jobs;

import com.qin.dcesp.controller.WorkingController;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TimeoutCountStutJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(TimeoutCountStutJob.class);

    @Autowired
    WorkingController workingController;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException{

        logger.info("Time out Count job is Running");
    }
}
