package com.peng.demo;
/**
 * do..while(..)//相比while无条件多执行一次
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo020_doWhile {

	public static void main(String[] args) {
		runNum("pfh", 22);

	}
	
	public static void  runNum(String name,int maxNum) {
		int i=1;
		do{
			System.out.println(name+"跑第"+i+"圈");
			i++;
		}while(i<=maxNum);//条件不成立,至少执行一次                                    
	}

}
