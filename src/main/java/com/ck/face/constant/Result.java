package com.ck.face.constant;

import java.io.Serializable;

public class Result<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 错误码
	 */
	private Integer code;
	/**
	 * 错误信息
	 */
	private String msg;
	/**
	 * 数据
	 */
	private T data;

	public Result() {
		super();
	}

	public Result(Integer code, String msg) {
		super();
		this.code = code;
		if (code != null && ResultConstant.ERROR_CODE.equals(code)) {
			this.msg = ResultConstant.ERROR_MSG;
		} else {
			this.msg = msg;
		}
	}

	public Result(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
