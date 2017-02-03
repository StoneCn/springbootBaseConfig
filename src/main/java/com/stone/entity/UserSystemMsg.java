package com.stone.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
* @author 作者 stone: 
* @version 创建时间：2016年12月28日 上午9:27:12 
* 
*/
@Getter
@Setter
@ToString
@Entity
@Table(name="usersystemmsg")
public class UserSystemMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uid")
	private String uid;//id
	
	private Integer type = 0;//消息的类型  0:系统通知，1开门记录,2报警记录,3普通推送
	
	private String title="";//消息标头
	
	@Column(name="typename")
	private String typeName="系统消息";//
	
	@Column(name="contenttype")
	private Integer contentType=0;//0：文字消息，1：超链接
	
	private String content="";//文字内容
	
	private String link="";//链接
	
	@Column(name="coverurl")
	private String coverUrl="";//封面链接
	
	@Column(name="userid")
	private String userId="";//接收消息的用户ID，备用栏位
	
	@Column(name="createtime")
	private Date createTime;//创建日期
	
	private Boolean status= false;
	
	private String alls;//该条系统消息的所有的信息(文字加图片等等)
	
}
