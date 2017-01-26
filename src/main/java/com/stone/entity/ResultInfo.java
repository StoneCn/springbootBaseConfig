package com.stone.entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter@Setter
public class ResultInfo {

	/**
	 * code:默认是10000表示成功
	 * 10002:表示出错了,未查询到信息
	 */
	private Integer code =10000;
	private String msg ="";
	private Object data = "";
}
