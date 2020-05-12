package com.peng.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collections工具类(Arrays)
 * 1).shuffle:随机
 * 2).reverse:倒序
 * 3).sort:顺序排序
 * 4).binarySearch:二分查找法(对半查找法)
 * @author pfh
 * @date 2020年5月12日
 */
public class CollectionsTest {

	public static void main(String[] args) {
		//List,Set,Map
		ArrayList<String> al = new ArrayList<>();
		//al.add(e)
		for (int i = 0; i < 5; i++) {
			al.add("java" + i);
		}
		
		System.out.println("没有变动前的输出:");
		for (String a : al) {
			System.out.print(a + "\t");
		}
		System.out.println();
		
		// 1).shuffle:随机
		Collections.shuffle(al);
		System.out.println("*****shuffle之后***********");
		System.out.println(al);
		 
		// 2).reverse:前一个顺序倒过来
		Collections.reverse(al);
		System.out.println("*****reverse之后***********");
		System.out.println(al);
		
		// 3).sort:顺序排序
		Collections.sort(al);
		System.out.println("*****sort之后***********");
		System.out.println(al);
		
		// 4).binarySearch:二分查找法(对半查找法)
		//查找对应位置
		System.out.println("binarySearch:" + Collections.binarySearch(al, "java3"));
	
	}

}
