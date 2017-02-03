package com.stone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter@Setter@ToString
@Table(name="systemmsg")
public class SystemMsg {

	@Id
	@Column(name="systemmsgid")
	private String systemMsgId;
	
	private String alls;
}
