package com.peng.demo;
/**
 * 随手测试+1
 * @author pfh
 * @date 2020年4月22日
 */
public class Test {
	String name;

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test);
		test.name = "yx";
		System.out.println(test.name);
		Test test0 = test;
		test = new Test();//
		System.out.println(test.name);
		System.out.println(test);
		Test test2 = new Test();
		System.out.println(test2);
		test.show(test);
		System.out.println(test0.name);
	}
	
	public Test() {
	}
	public void show(Test test) {
		test = new Test();
		test.name = "ll";
		System.out.println(test);
	} 

}


