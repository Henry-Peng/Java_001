package com.peng.modelNew;

import com.peng.model.Users;

public class Father {
	private String name ;
	private int age;

	// 构造方法
	public Father() {
		
	}

	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Father father = new Father("ll",22);
		Father father2 = new Father("ll",22);
		Users users = new Users("","ll");
		System.out.println(father.name == users.getName());;
	}

	public String  getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//普通方法
	
	public void coding(){
		System.out.println(name+"正在写代码...");
	}
	public void sleeping(){
		System.out.println(name+"正在睡觉...");
	}

}
