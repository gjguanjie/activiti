package com.cloud.workflow.common;

public enum WorkflowStatusType {
	
	INIT("初始","0"),
	FIRST("初审","1"),
	SECOND("复审","2"),
	FINISH("完成","9");
	
	private String desc;
	
	private String value;

	private WorkflowStatusType(String desc, String value) {
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
