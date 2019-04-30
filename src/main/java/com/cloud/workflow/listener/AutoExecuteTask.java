package com.cloud.workflow.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoExecuteTask implements JavaDelegate{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AutoExecuteTask.class);

	@Override
	public void execute(DelegateExecution execution) {
		LOGGER.error("自动执行开始");
		String status =  execution.getVariable("status").toString();
		if ("FIRST".equals(status)) {
			execution.setVariable("status","FINISH");
		}
		LOGGER.error("自动执行结束");
	}

}
