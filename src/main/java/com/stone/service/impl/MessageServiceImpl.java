package com.stone.service.impl;

import org.springframework.stereotype.Service;

import com.stone.entity.SystemMsg;
import com.stone.entity.UserSystemMsg;
import com.stone.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {

	/**
	 * 获取
	 */
	@Override
	public UserSystemMsg getUserSystemMsg(String uid) {
		return null;
	}

	@Override
	public void saveUserSystemMsg(UserSystemMsg userSystemMsg) {
		
	}

	@Override
	public System getSystemMsg(String systemMsgId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSystemMsg(SystemMsg systemMsg) {
		// TODO Auto-generated method stub
		
	}

}
