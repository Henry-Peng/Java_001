package com.peng.demo;

import javax.xml.stream.events.EndDocument;

/**
 * 练习使用直接输出
 * @author pfh
 * @date 2020年4月10日
 */
public class Java_Demo001 {
/*
 * 这是直接输出个人信息
 */
	//20200410 pfh add his some information 
	public static void main(String[] args) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("Hello,");
		System.out.println("There is my some information:");//说明内容
		System.out.println("Henry.Peng");//输出姓名；字符串String
		System.out.println("男");//性别；Char类型
		System.out.println("100");//年龄；int类型，整数
		System.out.println("18888888888");//电话号码；int类型
		System.out.println("6000.5");//月薪；double类型，小数点
		System.out.println("苏州");//住址；字符串String
		System.out.println("唱、跳、rap");//爱好；字符串String
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		//end pfh

	}

}
