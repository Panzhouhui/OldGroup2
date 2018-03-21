package com.itsv.controller;

import com.itsv.domain.JiGou;
import com.itsv.service.JiGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("jigou.html")
public class JiGouController {
	@Autowired
	private JiGouService jiGouService;
	
	@RequestMapping(params = "act=add")
    @ResponseBody
    public Map<String, Object> add(JiGou jiGou) {
        jiGouService.addJiGou(jiGou);
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("status", true);
        result.put("message", "添加成功");
        return result;
    }
    
    @RequestMapping(params = "act=get")
    @ResponseBody
    public List<JiGou> getList(JiGou jiGou){
    	List<JiGou> jiGous = jiGouService.getJiGouList(jiGou);
    	return jiGous;
    }
    
    @RequestMapping(params = "act=update")
    @ResponseBody
    public Map<String, Object> update(Integer id){
    	jiGouService.updateJiGouById(id);
    	Map<String, Object> result = new HashMap<String,Object>();
        result.put("status", true);
        result.put("message", "修改成功");
        return result;
    }
    
    @RequestMapping(params = "act=delete")
    @ResponseBody
    public Map<String, Object> delete(Integer id){
    	jiGouService.deleteJiGouById(id);
    	Map<String, Object> result = new HashMap<String,Object>();
        result.put("status", true);
        result.put("message", "删除成功");
        return result;
    }
    
}
