package com.peng.implrunnable;
/**
 * 多线程:接口创建多线程方式
 * 		1.当前类ExtendsThread接口runnable类
 * 		2.重写run方法(执行的一个动作,循环输出执行动作)
 * 		3.实例化Thread类,调用.start()方法
 * @author pfh
 * @date 2020年5月22日
 */
public class ImplRunnable implements Runnable{
	
	@Override
	public void run(){//多线程执行
		for (int i = 0; i < 3; i++) {
			System.out.println("边走路..." + i);
		}
	}

	public static void main(String[] args) {
		//创建对象
		ImplRunnable implRunnable = new ImplRunnable();
		Thread thread = new Thread(implRunnable);//使用线程,将runnable放入thread中
		thread.start();
		thread.setPriority(8);
		//循环输出另外的多个动作
		for (int i = 0; i < 5; i++) {
			System.out.println("边听歌..." + i);
		}
		

	}

}
