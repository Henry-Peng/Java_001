package com.peng.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList常用方法:
 * 
 * @author pfh
 * @date 2020年5月9日
 */
public class ArrayListMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(0, "aa");//设置,不是添加,类似替换
		System.out.println(list);//[aa, b, c, d]
		list.add(1, "a");//添加,类似插入
		System.out.println(list);//[aa, a, b, c, d]
		
		System.out.println(list.indexOf("c"));//3,从前往后索引第一个,传回索引位置
		System.out.println(list.lastIndexOf("c"));//3,从后往前索引第一个,传回索引位置
		
		
		for (int i = 0; i < list.size(); ) {
			list.remove(0);//移除
			System.out.print(list);
			if (list.size() == 0) {
				break;
			}
			System.out.println(list.get(0));
		}
		
		
		
		
	}

}
