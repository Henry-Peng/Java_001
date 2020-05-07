package com.peng.demo2;

import java.util.Arrays;

/**
 * 一个新的数组输出方式
 * @author pfh
 * @date 2020年4月20日
 */
public class Demo012_bubblesort {
	public static int[] nums = {84,234,54,76,57};

	public static void main(String[] args) {
		bubbleSortArrays();

	}
	
	public static int[] bubbleSortArrays() {
		int[] newNums = nums;
		int in = 0;
		int wn = 0;
		for(int i = 0;i<newNums.length;i++){
			for(int j=0;j<newNums.length-1-i;j++){
				if(newNums[j]>newNums[j+1]){
					int temp = newNums[j];
					newNums[j] = newNums[j+1];
					newNums[j+1] = temp;
				}
				in++;
				System.out.println(Arrays.toString(newNums));//一个新的数组输出方式
			}
			wn++;
		}
		System.out.println("内层循环输出次数:"+in);
		System.out.println("外层:"+wn);
		return newNums;
	}

}
