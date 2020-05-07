package com.peng.demo;
/**
 * 多条件判定 if .... else ...else if...
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo013 {

	public static void main(String[] args) {
		// 引用方法
		runIf();
	}
	public static void runIf() {
		int season = 1;//季节数字，1为春天，2为夏天，3为秋天，4为冬天;
		String msg ;
		/*if (season == 1) {
			System.out.println("春天到了...");
		} else if (season == 2){
			System.out.println("夏天到了...");
		} else if (season == 3){
			System.out.println("秋天到了...");
		} else if (season == 4){
			System.out.println("冬天到了...");
		} else {
			System.out.println("输入的不是合法数字...");
		}*/
		if (season == 1) {
			msg = "春天到了...";
			showMessage(msg);
		} else if (season == 2){
			System.out.println("夏天到了...");
		} else if (season == 3){
			System.out.println("秋天到了...");
		} else if (season == 4){
			System.out.println("冬天到了...");
		} else {
			System.out.println("输入的不是合法数字...");
		}	
	}
	public static void showMessage(String msg) {
		System.out.println(msg);
	}

}
