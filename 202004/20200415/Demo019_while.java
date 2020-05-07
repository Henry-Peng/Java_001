package com.peng.demo;
/**
 * 谁跑步4圈,while
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo019_while {

	public static void main(String[] args) {
		runNum("pfh", 22);

	}
	
	public static void runNum(String name,int maxNum) {//传递两个参数,超过三个参数,使用对象类
		int i = 1;
		while(i<=maxNum){
			System.out.println(name+"跑第"+i+"圈");
			i++;
		}
		
	}

}
