package com.peng.demo2;

import java.util.Arrays;

/**
 * Arrays类使用:
 * 1).查看数组长度
 * 2).对数组排序:通过sort方法,按升序
 * @author pfh
 * @date 2020年4月17日
 */
public class Demo009_sort {

	public static void main(String[] args) {
		//int[] ints = new int[3];
		int[] ints = {39,34,1,255,52,23};
		//1.长度
		System.out.println(ints.length);
		
		System.out.println("*******原来的数据************");
		for(int i:ints){
			System.out.print(i+"\t");
		}
		//2.排序
		Arrays.sort(ints);
		
		System.out.println("\n*******排序之后的输出**********");
		//3.输出
		for(int i : ints){
			System.out.print(i+"\t");
		}
		System.out.println("\n********降序输出**************");
		for(int j=ints.length-1;j>=0;j--){
			System.out.print(ints[j]+"\t");
		}

	}

}
