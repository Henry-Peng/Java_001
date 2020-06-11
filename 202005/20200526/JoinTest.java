package com.peng.multiTest;
/**
 * join方法:
 * 		插入线程(每一次都会成功)
 * @author pfh
 * @date 2020年5月26日
 */
public class JoinTest implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		JoinTest jt = new JoinTest();
		Thread thread = new Thread(jt);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				thread.join(200);//在此时插入thread线程
			}
			System.out.println("黑色车子在跑");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "-红色车子在跑" );
		}
		
	}

}
