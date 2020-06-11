package com.peng.multiTest;
/**
 * yield:礼让
 * 		当前线程暂停,进入可运行就绪状态(不是每一次都礼让成功)
 * @author pfh
 * @date 2020年5月26日
 */
public class DemoYield implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "======开始" );
		//增加礼让
		Thread.yield();
		System.out.println(Thread.currentThread().getName() + "======结束" );
	}

}
