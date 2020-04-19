package com.peng.modle;
/**
 * 对象类:人(模板,图纸)
 * @author pfh
 * @date 2020年4月17日
 */
public class Person {
	
	/*//属性,成员变量,字段
	String name = "张三";//姓名
	int age = 18;
	String address = "上海";*/
	public String name;//姓名
	int age;
	String address;
	
	public static String idCard;
	/**
	 * 编写代码方法
	 */
	public void coding(){
		System.out.println(name+"正在编写代码...");
	}
	public void hungry(){
		//food:局部变量
		String food = "米饭";
		System.out.println(name+"吃"+food);
	}
	/**
	 * 人的休息的方法
	 */
	public void sleep(){
		System.out.println(name+"正在睡觉...");
	}
	/**
	 * 无参数构造方法
	 * @param args
	 */
	public Person(){
		
	}
	//带一个参数的构造方法//带参数的构造方法要带上无参的构造,见上方;
	public Person(String name){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
