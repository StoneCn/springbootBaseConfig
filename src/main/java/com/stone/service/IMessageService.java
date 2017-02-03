package com.stone.service;

import com.stone.entity.SystemMsg;

public interface IMessageService {

	
	SystemMsg getSystemMsg(String systemMsgId);
	
	void saveSystemMsg(SystemMsg systemMsg);
	
}
