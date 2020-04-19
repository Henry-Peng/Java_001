package com.peng.demo;
/**
 * 双重for循环,直角三角形
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo025_doublefor {

	public static void main(String[] args) {
		rightTriangle();

	}
	
	public static void rightTriangle() {
		for(int i=0;i<10;i++){//外层循环(行数)
			//System.out.println("第"+i+"*");
			for(int j=0;j<=i;j++){//内层循环(输出*)
				//System.out.print("第"+j+"#");
				System.out.print("@");
			}
			System.out.println();
		}
		
	}

}
