package com.peng.demo;
/**
 * 条件判定 if .... else ...
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo014 {

	public static void main(String[] args) {
		// 引用方法
		runIf();

	}
	public static void runIf() {
		int season = 1;//季节数字，1为春天，2为夏天，3为秋天，4为冬天;
		if (season == 1) {
			System.out.println("春天到了...");
		} else {
			System.out.println("夏天到了...");
		}
		System.out.println(season == 1);
		System.out.println((season == 1)? "春天到了...":"夏天到了...");
		
	}

}
