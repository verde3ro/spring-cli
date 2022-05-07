package com.appstracta.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3640161320930182906L;
	private long id;
	private String name;

	public Employee() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
