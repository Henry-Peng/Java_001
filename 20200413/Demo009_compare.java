package com.peng.demo;
/**
 * ==,!=,>,<,>=,<=,比较运算符
 * @author pfh
 * @date 2020年4月13日
 */
public class Demo009_compare {

	public static void main(String[] args) {
		int a = 0;
		int b = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		
		String name1 = "张三";
		String name2 = "李四";
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		String name3 = new String("李四");
		String name4 = new String("李四");
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
		
		String num1 = "111";
		int num2 = 111;
		System.out.println(num1.equals(num2));
		
	}

}
