package com.peng.test;

import com.peng.modle.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person per = new Person();//创建对象,无参数调用
		per.coding();//无参的输出
		
		Person per4 = new Person("kk",22,"上海");//构造器的重载
		per4.setName("花花");//set可以修改当前对象的值,kk改为花花
		System.out.println("++++++++++++++++++++三种输出+++++++++++++++++++++");
		//使用get输出,可以单独调用
		System.out.println("姓名:"+per4.getName()+",年龄:"+per4.getAge()+",地址:"+per4.getAddress());
		System.out.println(per4);//可能输出为地址
		System.out.println(per4.toString());//标准输出
		System.out.println("******************************");
		
		per4.coding();//有参调用输出
		per4.coding("黎明");//该方法特殊,进行测试,与下两行作对照
		System.out.println(per4);//输出当前对象值,发现per4.name未作改变
		per4.coding("yh", 23, "ehy");//与上两行做对比
		System.out.println(per4.toString());//输出当前对象值,per4.name改变
		
		
		//三个:个数不同,参数类型不同,参数不同,名称必须一致
	}

}
