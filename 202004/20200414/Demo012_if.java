package com.peng.demo;
/**
 * 1)if判定使用
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo012_if {

	public static void main(String[] args) {
		runIf1();

	}
	public static void runIf1() {
		System.out.println("进入runIf1");
		double startTime = 12.00;
		double personTime = 11.45;
		//if 判定
		if (personTime<startTime) {
			System.out.println("到上海去玩...");
			
		}else{
			System.out.println("改签...");
		}
		
	}

}
