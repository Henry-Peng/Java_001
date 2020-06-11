package com.peng.multiTest;
/**
 * 设置优先级别的类
 * @author pfh
 * @date 2020年5月26日
 */
public class AddPriority implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + 
				"--Priority:" + Thread.currentThread().getPriority()
				);
	}

}
