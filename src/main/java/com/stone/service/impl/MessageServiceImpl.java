package com.stone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.entity.SystemMsg;
import com.stone.repository.SystemMsgRepository;
//import com.stone.repository.SystemMsgRepository;
import com.stone.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {


	@Autowired
	private SystemMsgRepository systemMsgRepository;
	
	/**
	 * 获取系统消息
	 */
	@Override
	public SystemMsg getSystemMsg(String systemMsgId) {
		SystemMsg systemMsg = systemMsgRepository.findOne(systemMsgId);
		return systemMsg;
	}

	/**
	 * 保存系统信息
	 */
	@Override
	public void saveSystemMsg(SystemMsg systemMsg) {
		systemMsgRepository.save(systemMsg);
	}


}
