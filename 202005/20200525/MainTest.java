package com.peng.multiTest;
/**
 * 测试类
 * @author pfh
 * @date 2020年5月25日
 */
public class MainTest {

	//主程序入口
	public static void main(String[] args) {
		
		//输出当前线程信息
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		
		//输出当前线程名称
		System.out.println(Thread.currentThread().getName());//main
		
		//输出当前线程优先级
		System.out.println(Thread.currentThread().getPriority());//5
		//System.out.println(8/0);//从上到下,依次执行
		System.out.println("执行1...");
		System.out.println("执行2...");
		
		run1();
	}

	private static void run1() {
		System.out.println("run1...");
	}

}
