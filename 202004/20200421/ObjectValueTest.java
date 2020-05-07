package com.peng.test;
/**
 * 值传递
 * @author pfh
 * @date 2020年4月21日
 */
public class ObjectValueTest {
	
	static String name88 ;
	public static void name(String name88) {
		System.out.println(name88);
	}

	public static void main(String[] args) {
		String address = "上海浦东";
		address = "宝安新区";//直接赋值
		System.out.println(address);
		System.out.println("*****************");
		
		//new了两个对象,地址不同,分别存储
		String addre = new String();
		addre = "湖北十堰";
		String addr = new String();
		addr = "嘉兴";
		System.out.println(addre);
		System.out.println(addr);
		/**
		 * 成员变量可以不设定值,此时为空,null
		 * 局部变量必须要初始化
		 */
		String name99 = "ii";
		System.out.println(name99);
		name(name88);//name88必须为静态值
	
		
	}
	
	public void runStringValue() {
		
	}

}
