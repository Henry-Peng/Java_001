package com.peng.work;
/**
 * 用户登录类
 * @author pfh
 * @date 2020年5月14日
 */
public class UserRegister {
	//成员变量
	private String userName;//登录名
	private String passWord;//登录密码
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegister(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "UserRegister [userName=" + userName + ", passWord=" + passWord + "]";
	}
	

}
