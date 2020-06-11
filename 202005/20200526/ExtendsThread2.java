package com.peng.thread;
/**
 * 多线程:继承创建多线程方式
 * 		1.当前类ExtendsThread继承Thread类
 * 		2.重写run方法(执行的一个动作,循环输出执行动作)
 * 		3.实例化ExtendsThread类,调用.start()方法
 * @author pfh
 * @date 2020年5月22日
 */
public class ExtendsThread2 extends Thread{
	//线程入口点
	@Override
	public void run(){//多线程执行
		for (int i = 0; i < 3; i++) {
			System.out.println("边走路..." + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("开始.." + i);
		}
		//创建对象
		ExtendsThread2 extendsThread = new ExtendsThread2();
		System.out.println(extendsThread.getPriority());//5
		
		extendsThread.setPriority(9);
		//extendsThread.start();
		extendsThread.run();//线程类调用方法,则变成普通方法
		System.out.println(extendsThread.getPriority());//9
		//循环输出另外的多个动作
		for (int i = 0; i < 5; i++) {
			System.out.println("边听歌...");
		}
		
		
	}

}
