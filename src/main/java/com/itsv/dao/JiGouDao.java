package com.itsv.dao;

import com.itsv.domain.JiGou;

import java.util.List;

public interface JiGouDao {
	void addJiGou(JiGou jigou);
	List<JiGou> getJiGouList(JiGou jiGou);
	void updateJiGouById(Integer id);
	void deleteJiGouById(Integer id);
}
