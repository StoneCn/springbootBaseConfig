package com.stone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stone.entity.ResultInfo;
import com.stone.entity.User;
import com.stone.service.IUserService;

@RestController
public class UserController {
	private final Logger log =  LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userServiceImpl;
	@Autowired
	private ResultInfo resultInfo;
	
	@ResponseBody
	@RequestMapping(value="/user/get",method=RequestMethod.POST)
	public Object getUser(@RequestParam(value="id")Long id){
		log.info("into getUser...");
		 resultInfo =new ResultInfo();
		log.info("id: "+id);
		//通过id获取对应的用户信息
		try {
			User user = userServiceImpl.getUserById(id);
			log.info("user: "+user);
			resultInfo.setData(user);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo.setCode(10002);
			resultInfo.setMsg("获取某个用户信息失败!");
		}
		
		log.info("end getUser...");
//		log.info("resultInfo: "+resultInfo);
		return resultInfo;
	}

}
