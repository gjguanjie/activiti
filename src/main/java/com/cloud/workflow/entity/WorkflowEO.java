package com.cloud.workflow.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="workflow")
public class WorkflowEO {
	
	@Id
	private Long id;
	@Column(name="processId")
	private String processId;
	@Column(name="name")
	private String name;
	@Column(name="businessKey")
	private String businessKey;
	@Column(name="initator")
	private String initator;
	@Column(name="createDate")
	private Date createDate;
	@Column(name="updateDate")
	private Date updateDate;
	@Column(name="deleteFlag")
	private Boolean deleteFlag;
	@Column(name="status")
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessKey() {
		return businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
	public String getInitator() {
		return initator;
	}
	public void setInitator(String initator) {
		this.initator = initator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Boolean getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	

}
