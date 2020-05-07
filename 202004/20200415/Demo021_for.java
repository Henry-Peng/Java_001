package com.peng.demo;
/**
 * for循环,数字的和
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo021_for {

	public static void main(String[] args) {
		getSum();

	}
	
	public static void getSum() {
		int sum = 0;
		for(int i=0;i<=10;i++){
			sum += i;
		}
		System.out.println(sum);
	}

}
