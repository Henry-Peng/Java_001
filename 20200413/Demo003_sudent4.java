package com.peng.demo;
/**
 * 方法编写：
 * 1).吃饭
 * 2).编写代码
 * 3).看电视
 * 4).休息
 * @author pfh
 * @date 2020年4月13日
 */
public class Demo003_sudent4 {
/**
 * 主程序入口
 * @param args
 */
	public static void main(String[] args) {
		String name = "pfh";
		eating(name);
		System.out.println("**********eating************");
		coding(name);
		System.out.println("**********coding************");
		watchTv(name);
		System.out.println("**********watchTv************");
		sleeping(name);
		System.out.println("**********sleeping************");

	}
	public static void eating(String name) {
		System.out.println(name+"正在吃饭...");
	}
	public static void coding(String name){
		System.out.println(name+"正在编写代码...");
	}
	public static void watchTv(String name) {
		System.out.println(name+"正在看电视...");
	}
	public static void sleeping(String name) {
		System.out.println(name+"正在睡觉...");
		
	}

}
