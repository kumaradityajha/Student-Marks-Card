package com.smc.helper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.smc.DTO.Students;
@Component
public class Response_Structure <T>
{
	String msg;
	
	int status_code;
	
	T data;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
