package com.cloud.workflow.common;

public enum ProcessInstanceType {

	
	LEAVE("请假","myProcess");
	
	private String desc;
	
	private String value;

	private ProcessInstanceType(String desc, String value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public String getValue() {
		return value;
	}

}
