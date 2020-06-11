package com.peng.multiTest;
/**
 * 测试优先级别的类输出:1-10;normal 5;
 * 		只是概率上的优先级别,设置后高的优先级别高的概率高
 * @author pfh
 * @date 2020年5月26日
 */
public class PriorityTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main方法的priority:" + Thread.currentThread().getPriority());
		//线程调用
		String[] names = {"a","b","c","d","e","f"};
		Thread[] threads = new Thread[names.length];
		AddPriority addPriority = new AddPriority();
		
		
		for (int i = 0;i < names.length ; i++) {
			threads[i] = new Thread(addPriority, names[i]);
			System.out.println("========"+ names[i] + "=======");
			threads[i].setPriority(i+1);
			threads[i].start();
			System.out.println(names[i] + "=" + threads[i].getPriority() + ",");
			
		}
		
		System.out.println("+======输出结束========+");
		
		
	
	}

}
