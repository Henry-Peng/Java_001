package com.peng.crm.pojo;

import java.io.Serializable;

public class SysUser implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long user_id;
	private String user_code;
	private String user_name;
	private String user_password;
	private String user_state;

	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public SysUser() {

	}
	public SysUser(Long user_id, String user_code, String user_name, String user_password, String user_state 
			) {
		this.user_id = user_id;
		this.user_code = user_code;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_state = user_state;
	}

}