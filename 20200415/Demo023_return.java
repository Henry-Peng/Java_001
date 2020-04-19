package com.peng.demo;

/**
 * return返回值
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo023_return {

	public static void main(String[] args) {
		int n = getNum();
		System.out.println(n);

	}
	
	public static int getNum() {//1到100的累加,返回
		int n = 0;
		for(int i=0;i<=100;i++){
			n +=i;
		}
		return n;
	}

}
