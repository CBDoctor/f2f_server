package com.ck.face.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ck.face.dao.TitleMapper;
import com.ck.face.domain.Title;
import com.ck.face.service.TitleService;

@Service(value="titleService")
public class TitleServiceImpl implements TitleService {

	@Resource
	private TitleMapper titleMapper;

	@Override
	public Title getTitle(Long id) {
		return titleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Title> getTitles() {
		List<Title> data = titleMapper.getTitles();
		return data;
	}

}
