package com.peng.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 测试线程池:
 * 
 * @author pfh
 * @date 2020年5月27日
 */
public class PoolAddData {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ExecutorService executorService = null;
		//第一种操作方式:固定线程池
		/*//1.固定长度的线程池设定,返回执行服务
		executorService = Executors.newFixedThreadPool(5);

		//2.执行动作操作
		for (int i = 0; i < 100; i++) {
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					//做数据添加到仓库地址
					addDataShop();
					
				}			
			});
		}*/
		
		/*//第二个:,不需要写入固定线程数
		executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					//做数据添加到仓库地址
					addDataShop();
					
				}			
			});
		}*/
		
		//第三个:调用方式(每隔几秒再执行)
		ScheduledExecutorService sch = Executors.newScheduledThreadPool(3);//从线程池中随机抽,共计5个线程
		
		for (int i = 0; i < 12; i++) {//每次调用抽一个线程
			sch.schedule((new Runnable() {
				
				@Override
				public void run() {
					//做数据添加到仓库地址
					addDataShop();
				}			
			}), 5, TimeUnit.SECONDS);//只在第一次调度线程的时候延迟五秒
		}
		
		//3.关闭资源
		sch.shutdown();
	}

	protected static void addDataShop() {
		for (int i = 0; i < 20; i++) {//每次线程循环几次
			System.out.println(Thread.currentThread().getName() + "--"+ i + "次--------把当前查询的商品数据存到D:\\");
		}
		
	}

}
