package com.peng.test;

import com.peng.modle.Person;

public class Test {

	public static void main(String[] args) {
		//实例化一个对象new person()
		Person person = new Person();//创建对象,无参数调用
		person.name = "张三";
		person.coding();//调用类中的方法,方法公共(public)
		person.sleep();
		
		person.hungry();

	}

}
