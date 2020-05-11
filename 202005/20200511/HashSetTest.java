package com.peng.list;

import java.util.HashSet;
import java.util.TreeSet;
/**
 * HashSet<E>::过滤重复的值
 * Set不可以存放重复的值
 * @author pfh
 * @date 2020年5月11日
 */
public class HashSetTest {

	public static void main(String[] args) {
		//HashSet<E>,底层相当于一个简易版的TreeMap
		//TreeSet<E>,相当于一个简易版的HashMap
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("a");
		
		System.out.println(hashSet);
		
		hashSet.remove("b");
		
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("e");
		hashSet2.add("f");
		hashSet2.add("g");
		hashSet2.add("a");//重复不放入
		
		hashSet.addAll(hashSet2);
		System.out.println(hashSet);
		
		
		
		

	}

}
