package com.peng.basics;

import java.util.Scanner;

/**
 * 测试System类
 * @author pfh
 * @date 2020年5月6日
 */
public class SystemTest {

	public static void main(String[] args) {
		//1.out方式
		char c = 'A';
		System.out.append(c);
		System.out.append("B");
		System.out.println();
		
		//2.err方式
		System.err.println("信息错误...");
		
		//3.in方式  导包: Alt+/
		//System.in.toString();
		
		Scanner sc = new Scanner(System.in);//控制台的输入字符方式
		sc.next();
		sc.next();
		System.out.println(sc.next());//以空格为界限
		sc.next();

	}

}
