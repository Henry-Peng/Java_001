package com.peng.demo2;
/**
 * 数组越界处理,进行扩容
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo005_arraysadd {

	public static void main(String[] args) {
		int[] oldNums = new int[2];
		oldNums[0] = 100;
		oldNums[1] = 33;
		System.out.println("第一次old长度:"+oldNums.length);
		
		int[] newNums = new int[oldNums.length*2];
		
		System.arraycopy(oldNums, 0, newNums, 0, 2);
		System.out.println(oldNums.length);
		oldNums = newNums;
		oldNums[2] = -11;
		System.out.println("第二次old长度:"+oldNums.length);
		for(int n:oldNums){
			System.out.println(n);
		}

	}

}
