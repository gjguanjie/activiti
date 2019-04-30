package com.cloud.workflow.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @creator ice
 * @createTime 2019/4/30
 * @description
 */
public class UserTaskListener implements TaskListener {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(UserTaskListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
    	LOGGER.error("用户手动执行开始");
        Map<String,Object> params = delegateTask.getVariables();
        params.put("status","FIRST");
        delegateTask.setVariables(params);
        LOGGER.error("用户手动执行结束");
    }
}
