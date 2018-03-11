package com.ck.face.service;

import java.util.List;

import com.ck.face.domain.Title;

public interface TitleService {

	/**
	 * 根据id获得用户信息
	 * @param id
	 */
	public Title getTitle(Long id);
	
	
	/**
	 * 返回所有的目錄頁
	 * @return
	 */
	public List<Title> getTitles();
	

}
