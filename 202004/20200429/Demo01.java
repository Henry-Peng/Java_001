package com.peng.test;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试:
 * 	基本类型
 * 	包装类型
 * @author pfh
 * @date 2020年4月28日
 */
public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 包装类型可以new方式,也可以直接赋值
		 * 1.基本类型转换成包装类.valueOf()    装箱
		 */
		Integer integer1 = new Integer(99);//99基本类型,new方式
		Integer integer2 = 100;//实际为Integer.valueOf(100);编译器自动调用.valueOf此方法
		Double double1 = new Double(20.3);
		Double double2 = Double.valueOf(28.5);
		Double double3 = 89.3;//实际为Double.valueOf(89.3)
		
		/*
		 * 2.包装类型转换成基本类型.intValue()     拆箱
		 */
		int i = integer1;//编译器自动调用integer1.intValue()
		double d = double1;//编译器自动默认调用double1.doubleValue()
		double d2 = double2.doubleValue();
		
		/*
		 * 3.字符串转换成包装类型
		 */
		Integer integer = new Integer("111");//中间有别的字符会报错
		
		/*
		 * 4.包装类型转换成字符串
		 */
		String string1 = integer.toString();
		//""为空,null;加""会形成字符串
		String string2 = integer + "";//""中间什么都没有,如果加上空格,会形成一个新的字符串
		System.out.println(string1 + "," + string2);
		System.out.println(string1.equals(string2));//""结果为true,如果加上空格" "结果为false
		
		/*
		 * 5.基本类型转换成字符串
		 */
		String string3 = i + "";//与包装类不一样,注意区分
		System.out.println(string2.equals(string3));//结果false
		
		/*
		 * 6.(单纯的数字)字符串转换成int,double类型,两个字符及以上的字符串不可以是char类型
		 */
		String name = "123";
		Double double4 = Double.valueOf(name);
		Integer integer3 = Integer.valueOf(name);
	}
	
	public void run() {
		int i = 0;
		
		//<>不可以放置基本类型int,List<int>会报错
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<Integer>();
	}

}