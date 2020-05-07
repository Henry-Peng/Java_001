package com.peng.demo2;

import java.util.Arrays;

/**
 * Arrays类使用:
 * 3).比较数组:通过equals方法比较数组中元素值是否相等
 * 4).遍历数组
 * 5).数组中是否包含某一个值
 * @author pfh
 * @date 2020年4月17日
 */
public class Demo010_compare {

	public static void main(String[] args) {
		String loginName = " pfh ";
		boolean f=runCompare(loginName);
		System.out.println(f?"有此人":"无此人");
		
		System.out.println(runArraysCompare());

	}
	/**
	 * 判断两个数组是否相等
	 * @return
	 */
	public static boolean runArraysCompare() {
		String[] names = {"kky","pfh","gqc","hww"};
		String[] namesTwo = {"kky","pfh","gqc","hww"};
		boolean flag = Arrays.equals(names,namesTwo);
		return flag;
		//return Arrays.equals(names, namesTwo);
	}
	/**
	 * 数组是否存在某一个值
	 */
	public static boolean runCompare(String loginName){
		String[] names = {"kky","pfh","gqc","hww"};
		boolean flag = false;
		for (String n:names){
			if(n.equals(loginName.replaceAll(" ",""))){//trim()方法,前后去空格;replaceAll(,)全部替换.
				flag = true;
			}
		}
		return flag;
	}

}
