/**
 * 
 */
package com.ck.face.exception;

/**
 * @author cuiyanwei
 *
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String code;
	private String msg;

	public BizException() {
		super();
	}

	public BizException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
