package com.peng.test;
/**
 * 追踪父类的关系
 * 父类与子类
 * @author pfh
 * @date 2020年4月23日
 */

import com.peng.modelNew.Son;
import com.peng.modelNew.Father;

public class ExtendsInstanceOfTest {

	public static void main(String[] args) {
		Father father = new Father();
		father.coding();
		Son son = new Son("花花",20);
		son.coding();//子类方法重写,调用方法,先从子类中查找,如果子类有,直接引用出来
		son.eating();//子类自己的方法
		runa();
		
	}
	
	public static void runa() {
		// 父类
		Father father = new Father();

		// 子类
		Son son = new Son();

		/*
		 * String name = "李青云"; String name2 = "李青云2";
		 */
		System.out.println(father instanceof Son);//false为不一致,追踪father的父类是不是son
		System.out.println(father instanceof Object);//true,father默认父类为Object

		if (son instanceof Father) {//结果为true
			System.out.println("((((((((");
		}

		//Father father2 = new Object();//错误,子类不可以自动new父类
		Father father3 = new Son();//父类可以从子类创建新对象,向下查找,自动查找
		Father father4 = new Father();//与上一行效果一致,创建相同类型的对象
		//Son son2 = (Son)new Father();//强制执行,创建一个son类型对象,好像没什么用

	}

}
