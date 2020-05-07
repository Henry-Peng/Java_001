package com.peng.test;
/**
 * 
 * @author pfh
 * @date 2020年4月21日
 */
public class NewObjectValue {
	
	//成员变量
	String name;
	//构造方法
	public NewObjectValue(){}
	public NewObjectValue(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		NewObjectValue newObjectValue = new NewObjectValue("花花");
		System.out.println("没有调用runGetName前的值:"+newObjectValue.name);
		System.out.println("没有调用runGetName方法前的对象地址:"+newObjectValue);
		runGetName(newObjectValue);
		System.out.println("调用runGetName后的值:"+newObjectValue.name);
		
		System.out.println("*******************");
		System.out.println("没有调用runGetName2前的值:"+newObjectValue.name);
		System.out.println("没有调用runGetName2方法前的对象地址:"+newObjectValue);
		runGetName2(newObjectValue);
		System.out.println("调用runGetName2后的值:"+newObjectValue.name);
	}
	
	//同一个对象赋值(值会覆盖)
	public static void runGetName(NewObjectValue newObjectValue){//这种方式是传递一个对象
		newObjectValue.name = "奇瑞";
		System.out.println("调用runGetName方法后的对象地址:"+newObjectValue);
	}
	
	//不同对象,值传递(值不会覆盖)
	public static void runGetName2(NewObjectValue newObjectValue) {
		//再次创建对象
		NewObjectValue newObjectVal = new NewObjectValue("fu");//new一个新对象
		newObjectValue.name = "福特6666";//问题,
		System.out.println("调用runGetName2方法之后的对象地址:"+newObjectVal);//新对象新地址
		
	}
	

}
