package com.peng.modelNew;
/**
 * 儿子类
 *  extends 产生继承关系
 * @author pfh
 * @date 2020年4月23日
 */
public class Son extends Father{
	
	private String address;
	private int num;
	
	//set,get
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//构造方法
	public Son(){
		
	}
	public Son(String name,int age){//拿到父类的属性名称,super
		super(name, age);//得到父类带参数的构造方法
	}
	public Son(String name,int age,String address){//拿到父类的属性名称,加上自己的属性名称,构造方法
		super(name, age);//得到父类带参数的构造方法
		this.address = address;
	}
	
	//普通方法
	
	public void eating(){
		System.out.println(super.getName()+"正在吃大米饭...");
	}
	//子类自己编写,不会影响父类的方法,父类方法的重写
	public void coding(){
		System.out.println(super.getName()+"重写代码...*************");
	}

	
}
