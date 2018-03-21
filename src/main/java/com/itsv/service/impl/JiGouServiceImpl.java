package com.itsv.service.impl;

import com.itsv.dao.JiGouDao;
import com.itsv.domain.JiGou;
import com.itsv.service.JiGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiGouServiceImpl implements JiGouService{

	@Autowired
	private JiGouDao jiGouDao;
	
	public void addJiGou(JiGou jiGou) {
		// TODO Auto-generated method stub
		jiGouDao.addJiGou(jiGou);
	}

	public List<JiGou> getJiGouList(JiGou jiGou) {
		// TODO Auto-generated method stub
		return jiGouDao.getJiGouList(jiGou);
	}

	public void updateJiGouById(Integer id) {
		// TODO Auto-generated method stub
		jiGouDao.updateJiGouById(id);
	}

	public void deleteJiGouById(Integer id) {
		// TODO Auto-generated method stub
		jiGouDao.deleteJiGouById(id);
	}

}
