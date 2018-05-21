package com.roll.eurekaconsumer.controller;

import java.io.Serializable;

/**
 * Created by haozq
 * Date: 2018/5/21 下午2:11
 */
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;
	private String type;

	private String value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Test{" +
				"type='" + type + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
