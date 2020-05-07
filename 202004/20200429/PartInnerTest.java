package com.peng.unInner;

public class PartInnerTest {

	public static void main(String[] args) {
		run1();

	}
	
	public static void run1(){
		System.out.println("进入方法run1...");
		class Inner{//局部内部类,只能在本方法中运行
			public void showInner(){
				System.out.println("进入局部内部类的方法showInner...");
			}
		}
		Inner inner = new Inner();//在本方法内运行
		inner.showInner();
	}

}
