package com.org.api.springRESTFullWebService.Get.first;

public class Data {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private int id;
	private String value;
	
	public Data(Integer id ,String value){
		this.id=id;
		this.value=value;
	}
}
