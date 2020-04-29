package com.peng.model;

public class Person {
	
private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//方法
	public void eat() {
		System.out.println(name + "正在吃饭...");
	}
	
	public void sleep(String name) {
		System.out.println(this.name + "正在睡觉...");
		System.out.println(name + "正在睡觉...");
	}
	

	public static void main(String[] args) {
		
	}

}
