package com.peng.list;

import java.util.TreeMap;

/**
 * 红黑二叉树测试类
 * @author pfh
 * @date 2020年5月11日
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "a");
		for(int i = 2;i < 6; i ++){
			treeMap.put(i, (char)(i + 96) + "");		
		}
		
		System.out.println(treeMap.get(2));
		//循环读取数据,通过key方式
		for(Integer k : treeMap.keySet() ){//keySet();是一个数组
			//System.out.println(treeMap.keySet());
			System.out.println(k + ": " + treeMap.get(k));
		}
	}

}
