package com.peng.test;

import java.util.List;

import com.peng.model.User;

import java.util.ArrayList;

/**
 * 自动装箱(基本类型转换成包装类型),自动拆箱(包装类转换成基本类型)
 * 语法糖:编译器自动添加上调用代码,减少开发人员编写错误
 * 缓存范围[?-?]:有些数字存放在此缓存,缓存内可用==和equals,缓存范围外equals准确(查看源码)
 * @author pfh
 * @date 2020年4月29日
 */
public class Demo02 {

	public static void main(String[] args) {
		//1.自动装箱
		Boolean boolean1 = Boolean.valueOf(true);
		Boolean boolean2 = true;//编译器自动添加:Boolean.valueOf(true)
		
		//2.自动拆箱
		boolean b = boolean1;//编译器自动添加boolean1.booleanValue();
		boolean b1 = boolean2.booleanValue(); 
		
		//3.空指针异常避免
		int i = 0;//不能直接赋null给int类型
		Integer integer = null;
		//i = integer;//当integer为null值的时候,去拆箱转换出现NullPointerException
		if (integer != null) {
			i = integer;
		}
		// "" & null;  
		String loginName = "";//空值,空字符串,有内存空间
		String loginName1 = null;//没有内存空间
		/*System.out.println(loginName.equals(loginName1));//false,null和""不相等
		System.out.println(loginName == loginName1);//false
*/		/*name == null ;      null是判断name有没有内存空间。
		"".equals(name) ;   ""是判断name的内存空间中的值是不是空字符串。
		没有内存空间的话是不能对变量或对象进行操作的。会出异常。*/
		/*System.out.println(loginName == "");//true
		System.out.println(loginName.equals(""));//true,结果为真,==和.equals都可以用
*/		if (!loginName.equals("") && loginName != null) {
			System.out.println("已经登录成功..");
			System.out.println("登录名:"+loginName);
		}else {
			System.out.println("登录名为空或是null");
		}

		//4.包装类构造方法(new方式)
		Boolean boolean3 = new Boolean(false);
		Boolean boolean4 = new Boolean("tru");//结果false,//只有"true",boolean4才为true
		System.out.println(boolean3+","+boolean4);//false,false
		
		//5.集合自动查找
		//List<int> User;//第一个<>不能放置基本类型,可以引用类型
		List<Integer> integers = new ArrayList<>();//第二个<>会以第一个<>的类型为准,自动查找
		List<User> users = new ArrayList<>();//列表,可以放置多条数据,这应该是数组类型,放在堆中
		User u1 = new User(1, "风清扬");
		users.add(u1);
		User u2 = new User(2, "岳不群");
		users.add(u2);
		System.out.println(users.toString());
		
		//6.缓存数字判定(==比较)
		//127是在缓存范围内,缓存范围[-128至127]
		Integer integer2 = Integer.valueOf(1274);
		Integer integer3 = 1274;//Integer.valueOf(1274),一样
		System.out.println(integer2 == integer3);//127为true,1274为false
		//只要数字在缓存范围内,就把值存放在缓存数组中,比较时从这个缓存数组中取出来做比较
		System.out.println(integer2.equals(integer3));//比较内容,结果true
		
	}

}
