package com.peng.multiTest;


/**
 * 避开死锁问题的存在:
 * 		synchronized锁中有锁(synchronized代码块)
 * 		过多synchronized造成相互不释放资源,相互等待
 * 解决方式:把锁中的锁移到外部
 * @author pfh
 * @date 2020年5月26日
 */
public class DeadLock {

	public static void main(String[] args) {
		ChoiceObj c0 = new ChoiceObj(0, "公交车");
		ChoiceObj c1 = new ChoiceObj(1, "小汽车");
		
		
		new Thread(c1).start();
		new Thread(c0).start();
	}

}

//Bus
class Bus {

}

//Car
class Car{

}

//Choice
class ChoiceObj  implements Runnable{
	//两份资源
	static Bus bus = new Bus();
	static Car car = new Car();//加上static会形成死锁,不加不会
	
	Integer ticketNums = 50;//加不加static都会形成死锁,定义了,有内存,有地址,占有资源
	Boolean flag = true;//加入static之后,别的类无法调用
	
	//这两个不会形成死锁,加不加static都不会,估计是没有定义,还没有分配地址,就是什么都没有
	Integer choice;//选择方式的类别: 0或1;
	String CarName;
	
	@Override
	public void run() {
		//普通方法,增加死锁
		deadMethod();
	}
	
	private void deadMethod() {
		if (choice == 0) {//choice==0,则锁定Bus类
			synchronized (bus) {//锁定Bus的对象类//synchronized()括号里面的也可以是其他包装类型变量
				System.out.println(CarName + "正在开...");
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				synchronized (ticketNums) {//锁定Car的对象类
					System.out.println(CarName + "正在后面追...");
				}
			}
			
		}else {
			synchronized (ticketNums) {//锁定Car的对象类
				System.out.println(CarName + "正在开...");
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				synchronized (bus) {//锁定Bus的对象类
					System.out.println(CarName + "正在前面跑...");
				}
			}
			
			
		}
	}

	
	
	public ChoiceObj(int choice, String carName) {
		this.choice = choice;
		this.CarName = carName;
	}

	public ChoiceObj() {
	}
	
	
	
}
