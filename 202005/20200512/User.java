package com.peng.model;
/**
 * 封装类:用户
 * @author pfh
 * @date 2020年5月12日
 */
public class User {
	private Integer id;
	private String userName;
	private String password;
	private String address;
	private char sex;
	private String birthday;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public char getSex() {
		return sex;
	}



	public void setSex(char sex) {
		this.sex = sex;
	}



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String password, String address, char sex, String birthday) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.sex = sex;
		this.birthday = birthday;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", address=" + address
				+ ", sex=" + sex + ", birthday=" + birthday + "]";
	}
	
	
	

}
