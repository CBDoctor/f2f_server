/**
 * 
 */
package com.ck.face.constant;

/**
 * @author cuiyanwei
 *
 */
public enum CompanyLabelEnum {

	KEJI(1, "科技公司"), IT(2, "互联网巨头"), JIAOYU(3, "教育");

	private Integer code;
	private String desc;

	CompanyLabelEnum(Integer code, String desc) {
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
