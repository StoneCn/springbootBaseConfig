package com.stone.service;

import com.stone.entity.SystemMsg;
import com.stone.entity.UserSystemMsg;

public interface IMessageService {

	UserSystemMsg getUserSystemMsg(String uid);
	
	void saveUserSystemMsg(UserSystemMsg userSystemMsg);
	
	System getSystemMsg(String systemMsgId);
	
	void saveSystemMsg(SystemMsg systemMsg);
}
