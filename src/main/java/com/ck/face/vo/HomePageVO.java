/**
 * 
 */
package com.ck.face.vo;

import java.io.Serializable;
import java.util.List;

import com.ck.face.domain.Title;

/**
 * 返回主頁的對象數據
 * @author cuiyanwei
 *
 */
public class HomePageVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 首頁的目錄
	 */
	private List<Title> titles;

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}
	

}
