package com.ck.face.dao;

import java.util.List;

import com.ck.face.domain.Title;

public interface TitleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Title record);

    int insertSelective(Title record);

    Title selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
    
    List<Title> getTitles();
}