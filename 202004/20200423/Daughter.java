package com.peng.model;
/**
 * 女儿类
 * @author pfh
 * @date 2020年4月23日
 */
public class Daughter {
	private String name;
	private int age;
	
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
	
	//构造方法
	public Daughter(){
		
	}
	public Daughter(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//普通方法
	
	public void coding(){
		System.out.println(name+"正在写代码...");
	}
	public void sleeping(){
		System.out.println(name+"正在睡觉...");
	}

	public static void main(String[] args) {
		
	}

}
