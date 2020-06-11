package com.peng.multiTest;
/**
 * 网络延时,网络中断:
 * 		设置多少毫秒数
 * @author pfh
 * @date 2020年5月26日
 */
public class SleepTest {

	public static void main(String[] args) {
		System.out.println("执行输出...");
		
		try {
			Thread.sleep(3000);//暂停3秒
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("暂停多少秒之后执行...");

	}

}
