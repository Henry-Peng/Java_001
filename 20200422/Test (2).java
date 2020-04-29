package com.peng.test;

import com.peng.modle.Person;
/**
 * 随手测试
 * @author pfh
 * @date 2020年4月20日
 */
public class Test {

	public static void main(String[] args) {
		//实例化一个对象new person()
		Person person = new Person();//创建对象,无参数调用
		person.coding();//调用类中的方法,方法公共(public)
		person.sleep();
		person.hungry();
		Person per = new Person();
		Person per1 = new Person(); 
		Person per2 = new Person("张三");
		System.out.println(per2);
		System.out.println("***************");
	}

}
