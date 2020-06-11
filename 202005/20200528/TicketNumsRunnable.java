package com.peng.implrunnable;
/**
 * 抢票:
 * 		针对同一份资源,资源共享(后期存在同时间发生并发),并发问题
 * @author pfh
 * @date 2020年5月25日
 */
public class TicketNumsRunnable implements Runnable{
	
	//共享资源票数
	private int ticketNums = 20;
	
	
	public  void run() {
		System.out.println("开始抢票");
		//循环抢票,当票数低于或者等于0,跳转循环,每次调用之后把当前票数及时减一
		while(ticketNums > 0){//true
			/*if (ticketNums <= 0) {
				break;
			}*/
			try {//增加此行,间隔1s;会在临界值[0]处出现数据不准确
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("网络出现延迟...");
			}
			System.out.println(Thread.currentThread().getName() + "抢到第" + (ticketNums--) + "张票");
		}
		
		
	}

	public static void main(String[] args) {
		//多线程[多人进行同时抢票]
		TicketNumsRunnable tnr = new TicketNumsRunnable();
		String[] names = {"a","b","c","d","e","f","g"};
		for (String name : names) {
			Thread thread = new Thread(tnr, name);//
			thread.start();
			System.out.println(System.currentTimeMillis());
		}
		
	}

}
