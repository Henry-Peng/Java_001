package com.peng.multiTest;
/**
 * 把其中一个用户线程设置为守护线程:
 * 	JVM不需要等待守护线程执行完再结束
 * @author pfh
 * @date 2020年5月26日
 */
public class DaemonTest {

	public static void main(String[] args) {
		Father father = new Father();
		Son son = new Son();
		//new Thread(father).start();
		
		Thread f = new Thread(father);
		f.setDaemon(true);//设置父类线程为守护线程,f.setDaemon(true);
		f.start();
		new Thread(son).start();

	}

}

//两个外部类
class Father implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 365; i++) {
			System.out.println("父类守护..." + i);
		}
		
	}
	
}

class Son implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 365; i++) {
			System.out.println("子类继承..." + i);
		}
	}
	
}
