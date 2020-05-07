package com.peng.demo;

import java.util.Scanner;

/**
 * 练习使用外界输入
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo024_input {

	public static void main(String[] args) {
		System.out.println("求1~n的和");
		System.out.print("请输入n:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("结果为:"+add(m));
		sc.close();
	}
	
	
	public static int add(int m){
		int sum = 0;
		for(int i=0;i<=m;i++){
			sum +=i;
		}
		return sum;
	}

}
