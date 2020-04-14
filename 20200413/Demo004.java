package com.peng.demo;

import javax.annotation.processing.ProcessingEnvironment;

/**
 * 类型转换:
 * 1).自动类型转换
 * 2).强制类型转换(需要我们手动去设置)
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo004 {

	public static void main(String[] args) {
		// 1).自动类型转换[大类型可以装下小类型]
		int i = 20 ;
		System.out.println(i);
		double b = i;
		System.out.println(b);
		//2).强制类型转换[大类型转换为小类型]
		double c = 39.5;
		int d = (int)c;
		long e = (long)c;
		System.out.println(d);
		System.out.println(e);
		
		String f = String.valueOf(c);
		System.out.println(f);
		
		//创建对象:new(新)
		Demo003_sudent4 dem = new Demo003_sudent4();
		String name = "peng";
		dem.coding(name);
		dem.sleeping(name);
				

	}

}
