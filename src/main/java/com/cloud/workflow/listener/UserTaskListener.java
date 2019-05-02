package com.cloud.workflow.listener;

import java.util.Map;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloud.workflow.common.WorkflowStatusType;

/**
 * @creator ice
 * @createTime 2019/4/30
 * @description
 */
public class UserTaskListener implements TaskListener {
	
	private static final long serialVersionUID = -7001321347045239043L;
	private static final Logger LOGGER = LoggerFactory.getLogger(UserTaskListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
    	LOGGER.error("初审监听开始");
        Map<String,Object> params = delegateTask.getVariables();
        params.put("status",WorkflowStatusType.FIRST.getValue());
        delegateTask.setVariables(params);
        LOGGER.error("初审监听结束");
    }
}
