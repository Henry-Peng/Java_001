package com.peng.test;
/**
 * 查看构造方法的执行顺序:
 *   父子关系
 * @author pfh
 * @date 2020年4月24日
 */
public class ConstrotOutTest {

	public static void main(String[] args) {
		//Father father = new Father();
		Son son = new Son();		
	}
}

class Father{
	public Father(){
		super();
		System.out.println("进入执行Father类的构造方法");
	}
}

class Son extends Father{
	public Son(){
		super();
		System.out.println("进入执行Son类的构造方法");
	}
}
