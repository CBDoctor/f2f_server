package com.ck.face.domain;

import java.io.Serializable;

/**
 * 
 * 目錄頁面
 * 
 * @author cuiyanwei
 *
 */
public class Title implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Long id;

	/**
	 * 編碼
	 */
	private String code;

	/**
	 * 名稱
	 */
	private String name;

	/**
	 * 父親類id
	 */
	private Long parentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Title [id=");
		builder.append(id);
		builder.append(", code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append("]");
		return builder.toString();
	}
}