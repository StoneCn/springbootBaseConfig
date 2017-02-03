package com.stone.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="systemmsg")
public class SystemMsg {

	@Column(name="systemmsgid")
	private String systemMsgId;
	
	private String alls;
}
