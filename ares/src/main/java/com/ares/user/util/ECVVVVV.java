package com.ares.user.util;

public enum ECVVVVV {
	INIT("INIT","待评价"),
	USED("USED","已评价"),
	END("END","评价完毕");
	
	private final String code;
	private final String name;
	
	ECVVVVV(String code,String name){
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
