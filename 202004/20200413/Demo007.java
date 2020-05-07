package com.peng.demo;
/**
 * ++,--运算
 * @author pfh
 * @date 2020年4月13日
 */
public class Demo007 {
	public static void main(String[] args){
		runNum1();
		runNum2();
		runNum3();
		runNum4();
	}
	public static void runNum1() {
		int x = 9 ;
		int y = 33 ;
		x++;
		x++;
		System.out.println("*********runNum1************");
		System.out.println(x);
		System.out.println("--y:"+--y);
		++y;
		System.out.println("++y:"+y);
	}
	public static void runNum2() {
		int a = 7 ;
		int b = 7 ;
		System.out.println("*********runNum2*****************");
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(a);
		System.out.println(b);
	}
	public static void runNum3() {
		System.out.println("************runNum3*******************");
		int i = 10 ;
		int j = 10 ;
		int c = ++i + i;
		System.out.println(c);
		System.out.println(i);
		c = ++i + j-- + j;
		System.out.println(c);
		System.out.println(j);
		
	}
	public static void runNum4() {
		int a = 8;
		System.out.println("*********runNum4************");
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a++ + a--);
		System.out.println(a++ - --a);
		
	}

}
