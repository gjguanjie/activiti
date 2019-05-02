package com.cloud.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.workflow.entity.WorkflowEO;

public interface WorkflowRepo extends JpaRepository<WorkflowEO, Long> {

}
