package com.peng.abstractmodel;
/**
 * 抽象类:关键字abstract
 * @author pfh
 * @date 2020年4月27日
 */
public abstract class Animal {//抽象方法必须要求是抽象类
	//抽象类:1.可以写成员变量2.写普通方法3.抽象方法
	
	//抽象方法,添加上关键字
	public abstract void run(String name);
	
	public abstract void sleep();
	
	public abstract void drink();
	//成员变量
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//普通方法
	public void eat(){
		System.out.println("进入此Animal类," + name + "吃东西...");
	}
	
	public Animal(){}
	public Animal(String name){
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
	}

}
