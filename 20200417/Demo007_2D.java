package com.peng.demo2;
/**
 * 第一种.定义二维数组[2][3]
 * @author pfh
 * @date 2020年4月17日
 */
public class Demo007_2D {

	public static void main(String[] args) {
		// 1.创建二维数组
		String[][] citys = new String[2][3];
		
		//2.赋值
		citys[0][0]="苏州";
		citys[0][1]="无锡";
		citys[0][2]="常州";
		
		//赋值
		citys[1][0]="临沂";
		citys[1][2]="菏泽";
		citys[1][1]="济南";
		//输出
		for(String[] oneDate:citys){
			for(String twoDate:oneDate){
				System.out.println(twoDate);
			}
		}
	}

}
