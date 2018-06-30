package com.xx.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

	@JsonIgnore
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	private String username;  //用户名
	private String password;  //密码
	
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh",timezone="GMT+8")
	private Date birthday;    //出生日期
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
