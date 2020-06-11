package com.peng.sync;
/**
 * 抢票:
 * 		针对同一份资源,资源共享(主要针对后期存在同时间发生并发),并发问题
 * 		增加boolean标识符
 * 
 * synchronized:(锁定对象资源)
 * 		1.锁定添加在方法上面
 * 		2.添加在代码块上
 * @author pfh
 * @date 2020年5月25日
 */
public class TicketSync implements Runnable{
	
	//共享资源票数
	private int ticketNums = 50;
	private boolean flag = true;
	
	
	public  void run() {
		System.out.println("开始抢票");
		while(flag){
			//countTicket();
			//countTicket2();//两种都行
			synchronized (this) {//把成员变量ticketNums,flag锁住
				if (ticketNums <= 0) {
					flag = false;
				}else {
					try {
						// Thread.sleep((long) Math.random() * 100);
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("网络出现延迟...");
					}
					System.out.println(Thread.currentThread().getName() + "抢到第" + (ticketNums--) + "张票");
			
				}
			}
		}
	}

	public void countTicket2() {
		synchronized (this) {//把成员变量ticketNums,flag锁住
			if (ticketNums <= 0) {
				flag = false;
				return;
			}
			try {
				// Thread.sleep((long) Math.random() * 100);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("网络出现延迟...");
			}
			System.out.println(Thread.currentThread().getName() + "抢到第" + (ticketNums--) + "张票");
		}
	}

	public synchronized void countTicket() {
		
		if (ticketNums <= 0) {
			flag = false;
			return;
		}
		try {
			// Thread.sleep((long) Math.random() * 100);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("网络出现延迟...");
		}
		System.out.println(Thread.currentThread().getName() + "抢到第" + (ticketNums--) + "张票");

	}

	public static void main(String[] args) {
		//多线程[多人进行同时抢票]
		TicketSync tnr = new TicketSync();
		String[] names = {"a","b","c","d","e","f","g"};
		//int i = 1;
		for (String name : names) {
			Thread thread = new Thread(tnr, name);
			//thread.setPriority(i++);
			thread.start();
			//System.out.println(System.currentTimeMillis());
		}
		
	}
	
	

}
