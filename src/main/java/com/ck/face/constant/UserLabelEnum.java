/**
 * 
 */
package com.ck.face.constant;

/**
 * @author cuiyanwei
 * 
 */
public enum UserLabelEnum {

	KAEAI(1, "可爱美眉"), QIZHI(2, "气质美女");

	private Integer code;
	private String desc;

	UserLabelEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
