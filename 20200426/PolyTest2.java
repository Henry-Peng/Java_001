package com.peng.test;

import com.peng.model.Daughter;
import com.peng.model.Father;
import com.peng.model.Person;
import com.peng.model.Son;

/**
 * 验证测试new多态的方式
 * @author pfh
 * @date 2020年4月26日
 */
public class PolyTest2 {

	public static void main(String[] args) {
		// new Father,
		Father father = new Father();
		father.setName("李渊");
		father.eat();
		
		System.out.println("**************");
		father = new Son();//自动找到父类下是否有此子类,父类接收 = new 子类
		father.eat();
		//father.coding();//报错,使用父类接收,只能调用父类的方法
		//Son son = new Son();自己类
		
		//Son son = (Son)new Father();//报错,强制转换
		Son son = (Son)father;
		son.setName("李世民");
		son.eat();
		son.coding();
		
		/*Daughter daughter = (Daughter)father;//此时的father与前面的不同,已经是Son类
		daughter.eat();*/
		
		//多态方式:new的是子类,自动查找,看是否是它的父类的接收,如果是,编译通过
		Father father2 = new Daughter();//父类接收 = new 子类
		father2.eat();
		Person person = new Daughter();//父类接收 = new 子类
		person.eat();
		//这里一个多态的优点是new很多种子类的对象可以用同一个父类定义的变量来接收
		//也就是一个父类变量可以调用很多种子类的方法
		
		
	}

}
