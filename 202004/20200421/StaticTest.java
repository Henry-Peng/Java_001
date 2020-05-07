package com.peng.test;
/**
 * 静态代码块
 * @author pfh
 * @date 2020年4月21日
 */
public class StaticTest {
	
	/*String name = "root";*/
	
	//账号名
	static String dbName = "root";//修饰符为Static必须为静态才可以被静态方法调用
	//密码
	static String dbPwd = "root";
	/**
	 * static 输出,一种特殊格式
	 */
	static{
		System.out.println("账号名:"+dbName+",密码:"+dbPwd);
		System.out.println();
	}
	/**
	 * 静态代码块(堆,在方法区)
	 * @param args
	 */
	public static void main(String[] args) {
		
		//不创建对象(static静态代码块已经先执行)
		System.out.println("进入mian方法...");
		StaticTest staticTest = new StaticTest();
		staticTest.run();
	}
	
	public void run() {
		System.out.println("由此进入run...");
	}

}
