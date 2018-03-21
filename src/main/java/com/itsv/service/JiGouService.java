package com.itsv.service;

import com.itsv.domain.JiGou;

import java.util.List;

public interface JiGouService {
	void addJiGou(JiGou jiGou);
	List<JiGou> getJiGouList(JiGou jiGou);
	void updateJiGouById(Integer id);
	void deleteJiGouById(Integer id);
}
