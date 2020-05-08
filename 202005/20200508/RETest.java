package com.peng.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试类:
 * 	1).登录名称:任意大小写的字母或数字,最小长度为4,最大长度为8
 *  2).油箱地址校验规则
 * @author pfh
 * @date 2020年5月8日
 */
public class RETest {

	public static void main(String[] args) {
		regexLoginName();
		String email = "163@163.com";
		String regEmail = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$" ;
		regexEmail(email,regEmail);
	}
	
	/*
	 * Matcher类和Pattern类
	 * compare和matcher方法和match.find()方法
	 * regex和string
	 */
	public static void regexEmail(String email,String regEmail) {
		Matcher matcher = Pattern.compile(regEmail).matcher(email);
		if (matcher.find()) {
			System.out.println("邮箱有效");
		}else {
			System.out.println("无效的邮箱,请重新输入...");
		}
	}

	public static void regexLoginName() {
		//一个输入名称,一个针对登录名称的正则表达式,两个类
		String reg = "^[a-zA-Z0-9]{4,8}$";//正则表达式
		String loginName = "rrtt";

		// 创建正则编译器,compile,编译
		Pattern pn = Pattern.compile(reg);
		//matcher匹配器
		Matcher mc = pn.matcher(loginName);

		// 判定是否校验返回为真
		if (mc.find()) {
			System.out.println("登录名称有效");
		} else {
			System.out.println("登录名称无效");
		}

	}

}
