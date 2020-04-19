package com.peng.demo;
/**
 * while:输出1到10的自然数
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo017_while {

	public static void main(String[] args) {
		showOneToTen();
		showOneToNine();
	}
	//while 方式
	public static void showOneToTen() {
		int num = 1;
		while (num<=10){
			System.out.print(num);
			num++;
		}
		System.out.println();
		System.out.println("**************");
		
	}
	//for 方式
	public static void showOneToNine() {
		int num = 1;
		for(;num<10;num++){
			System.out.print(num);
		}
		
	}

}
