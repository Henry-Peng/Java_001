package com.peng.list;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashTable:底层实现方式与HashMap一样(位桶数组,单向链表),比HashMap效率要慢
 * 		默认长度为11
 * @author pfh
 * @date 2020年5月11日
 */
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> s = new Hashtable<>();
		for(int i = 0; i < 5;i ++){
			s.put(1000+i, (char)(97+i)+"");
		}
		//HashTable,K和V都不可以为null
		Hashtable<String, String> sTable = new Hashtable<>();
		/*//下列报错:NullPointerException
		sTable.put("", null);
		sTable.put(null, "null");
		sTable.put("null", null);
		sTable.put("nu","ll");*/
		System.out.println(sTable);
		
		//HashMap,K和V都可以为null
		System.out.println("=========");
		HashMap<String, String> sMap = new HashMap<>();
		sMap.put("", null);
		sMap.put(null, "null");
		sMap.put("null", null);
		sMap.put("nu","ll");
		System.out.println(sMap);
		System.out.println("************");

	}

}
