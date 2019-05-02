package com.cloud.workflow.listener;

import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cloud.workflow.common.WorkflowStatusType;

@Component("commonListener")
public class CommonListener {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonListener.class);
	
	public void executeProcess(DelegateExecution execution) {
		LOGGER.error("复审监听开始");
		Map<String,Object> params = execution.getVariables();
		String status = (String) params.get("status");
		if (status.equals(WorkflowStatusType.FIRST.getValue())) {
			execution.setVariable("status", WorkflowStatusType.SECOND.getValue());
		}
		LOGGER.error("CurrentActivityId:"+execution.getCurrentActivityId());
		LOGGER.error("ProcessInstanceBusinessKey:"+execution.getProcessInstanceBusinessKey());
		LOGGER.error("复审监听结束");
		
	}

}
