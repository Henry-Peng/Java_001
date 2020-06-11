package com.peng.json;
/**
 * 用户类,用于json测试方法
 * @author pfh
 * @date 2020年5月21日
 */

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

public class User implements Serializable{//序列化
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int age;
	private String name;
	private String address;
	private String[] hobbys;
	private Map<String, String> homes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	public Map<String, String> getHomes() {
		return homes;
	}
	public void setHomes(Map<String, String> homes) {
		this.homes = homes;
	}
	@SuppressWarnings("unused")
	private void testMethod(){
		System.out.println("这是一个测试的方法");
	}
	
	public User(int id, int age, String name, String address, String[] hobbys, Map<String, String> homes) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.hobbys = hobbys;
		this.homes = homes;
	}
	
	public User(int id, int age, String name, String address) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, int age, String name, String address, String[] hobbys) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.hobbys = hobbys;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + ", hobbys="
				+ Arrays.toString(hobbys) + ", homes=" + homes + "]";
	}

}
