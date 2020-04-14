package com.peng.demo;
/**
 * 逻辑运算符&,|,!,^,||,&&
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo010_logic {

	public static void main(String[] args) {
		boolean flag1 = 33 > 55;
		boolean flag2 = 25 < 77;
		
		System.out.println(flag1);//0
		System.out.println(flag2);//1
		//&&、||、！、^
		System.out.println(flag1 || flag2);//1 或
		System.out.println(flag1 && flag2);//0and，并且
		System.out.println(!flag1);//1
		System.out.println(flag1 ^ flag2);//1
		
		String name = "mark";
		System.out.println(name.toString());
		System.out.println(name);

	}

}
