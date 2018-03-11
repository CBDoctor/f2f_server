/**
 * 
 */
package com.ck.face.constant;

/**
 * @author cuiyanwei
 *
 */
public enum CategoryEnnum {

	NIANLING(1, "年龄"), BIAOQIAN(2, "标签"), DIQU(3, "地区");

	private Integer code;
	private String desc;

	CategoryEnnum(Integer code, String desc) {
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
