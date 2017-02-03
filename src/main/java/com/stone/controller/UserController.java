package com.stone.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.Blob;
import com.stone.entity.ResultInfo;
import com.stone.entity.SystemMsg;
import com.stone.entity.User;
import com.stone.service.IMessageService;
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
	
	@RequestMapping(value="/user/testList",method=RequestMethod.POST)
	@ResponseBody
	public Object getList(){
		
		List<String> list1 = new ArrayList<>();
		list1.add("afda");
		list1.add("fbie");
		List<Integer> list2 = new ArrayList<>();
		list2.add(1122);
		list2.add(4054);
		List<Object> listAll=new ArrayList<>();
		listAll.add(list1);
		listAll.add(list2);
		resultInfo = new ResultInfo();
		resultInfo.setData(listAll);
		return resultInfo;
	}
	
	/*@RequestMapping(value="/user/testUeditor",method=RequestMethod.GET)
	@ResponseBody
	public void testUeditor(@RequestParam(value="editorValue") byte[] blob){
		
		System.out.println(blob);
		
	}*/
	
	
	@Autowired
	private IMessageService messageServiceImpl;
	/**
	 * ueditor后台接受数据测试
	 * @author stone
	 * @param request
	 */
	@RequestMapping(value="/user/testUeditor",method=RequestMethod.POST)
	@ResponseBody
	public String testUeditor(HttpServletRequest request){
		
		String blob = request.getParameter("myValue");
		if(blob!=null || blob.length()>0){
			SystemMsg systemMsg = new SystemMsg();
			systemMsg.setSystemMsgId("3434dsfa");
			systemMsg.setAlls(blob);
			System.out.println(blob);
			//将数据把保存到数据库中
			messageServiceImpl.saveSystemMsg(systemMsg);
			return "上传成功";
		}else{
			return "上传失败";
		}
	}
}





