package com.cloud.workflow.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cloud.workflow.entity.WorkflowEO;
import com.cloud.workflow.repository.WorkflowRepo;

@Service
public class WorkflowService {
	
	@Resource
	private WorkflowRepo workflowRepo;
	
	public WorkflowEO findWorkflowEOById(Long id) {
		return workflowRepo.getOne(id);
	}

}
