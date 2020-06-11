package com.peng.multiTest;
/**
 * 外部强制去停止此线程:
 * 		设置一个标识符flag为false,让其停止
 * @author pfh
 * @date 2020年5月26日
 */
public class StopThread implements Runnable {
	private static boolean flag = true;

	@Override
	public void run() {
		int i = 0;
		while (flag) {
			System.out.println("执行第" + (++i) + "次");
			if (i == 6) {
				flag = false;
				System.out.println(Thread.currentThread().getName() + "结束循环");
			}
		}
	}
	
	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread thread = new Thread(st, "花花");
		thread.start();
		//外部的for循环体中,当设置flag的值为false时,让其终止
		
		for (int i = 0; i < 10; i++) {	
			new Thread(st, "花花").start();
			/*if (i == 6) {
				flag = false;
				System.out.println("结束循环");
			}*/
		}
	}



}
