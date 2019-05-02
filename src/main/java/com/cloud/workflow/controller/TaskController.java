package com.cloud.workflow.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.workflow.common.ProcessInstanceType;
import com.cloud.workflow.common.WorkflowStatusType;


@RestController
@RequestMapping("/task")
public class TaskController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
	
	@Resource
    private RuntimeService runtimeService;

	@Resource
    private TaskService taskService;
	
	@Resource
    private RepositoryService repositoryService;
	
    
	@GetMapping("/start")
	public String start(String businessKey) {
		LOGGER.error("流程开始");
        String busniessKey = "leave";
        Map<String, Object> startParam = new HashMap<>();
        startParam.put("orderNo", "orderNo000001");
        startParam.put("status", WorkflowStatusType.INIT.getValue());
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(ProcessInstanceType.LEAVE.getValue(), busniessKey, startParam);
        LOGGER.error("流程ID：" + processInstance.getId());
        return processInstance.getId();
        
	}
	
	@GetMapping("/queryTaskByProcessId")
	public String queryTask(String processId) {
		LOGGER.error("查询任务并执行开始");
		Task task = taskService.createTaskQuery().processInstanceId(processId).processInstanceBusinessKey("leave").singleResult();
    	LOGGER.error("任务数：" + task);
    	LOGGER.error("查询任务并执行结束");
    	return task.getId();
	}
	
	@GetMapping("/queryTaskByName")
	public String queryTask(String processId,String name) {
		LOGGER.error("查询任务并执行开始");
		Task task = taskService.createTaskQuery().processInstanceId(processId).taskName(name).singleResult();
    	LOGGER.error("任务数：" + task);
    	LOGGER.error("查询任务并执行结束");
    	return task.getId();
	}
	
	@GetMapping("/queryAssigneedTask")
	public String queryAssigneedTask(String userId) {
		LOGGER.error("查询初分派的任务执行开始");
		Task task = taskService.createTaskQuery().taskAssignee(userId).singleResult();
		LOGGER.error("任务数：" + task);
    	LOGGER.error("查询初分派的任务执行结束");
    	return task.getId();
	}
	
	
	
	@GetMapping("/claim")
	public String claim(String taskId,String userName) {
		taskService.claim(taskId, userName);
		Task task = taskService.createTaskQuery().taskAssignee(userName).singleResult();
		return task.getAssignee();
	}
	
	@GetMapping("/finish")
	public void finish(String taskId) {
		taskService.complete(taskId);
	}
	

}
