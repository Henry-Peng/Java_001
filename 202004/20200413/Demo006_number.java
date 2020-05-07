package com.peng.demo;
/**
 *  +,-,*,/,% 运算符的算术运算
 * @author pfh
 * @date 2020年4月13日
 */
public class Demo006_number {

	public static void main(String[] args) {
		int num1 = 20 ;
		int num2 = 81 ;//定义两个数
		int num = num1 + num2;
		System.out.println(num);
		System.out.println("和："+(num1+num2));
		System.out.println("差："+(num1-num2));
		System.out.println("乘："+num1*12);
		System.out.println("除："+num2/num1);
		double c = num2/num1 ;
		System.out.println("除："+c);
		System.out.println("取余："+num2%num1);

	}

}
