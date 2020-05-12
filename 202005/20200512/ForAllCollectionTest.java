package com.peng.list;

import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * 所有的循环输出方式:
 * List,Set,Map
 * 1).普通方法for
 * 2).增强版for
 * 3).iterator迭代器
 * ...
 * @author pfh
 * @date 2020年5月12日
 */
public class ForAllCollectionTest {

	public static void main(String[] args) {
		//List
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(102);
		list.add(105);
		
		System.out.println("==========1.Arraylist普通for方法==============");
		//集合数据如果特别多,最好使用分页
		for(int i = 0;i < list.size();i ++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		System.out.println("==========2.Arraylist增强版for方法==============");
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
		System.out.println();
		System.out.println("==========3.Arraylist,Iterator迭代器==============");
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			//Integer integer = iterator.next();
			System.out.print(iterator.next() + "\t");
		}
		System.out.println("\n00000000000000000000");
		
		//Set
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(200);
		hashSet.add(201);
		hashSet.add(203);
		
		System.out.println("==========1.HashSet加强版for方法==============");
		for (Integer integer : hashSet) {
			System.out.print(integer + "\t");
		}
		
		System.out.println();
		System.out.println("==========2.HashSet,iterator迭代器==============");
		for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext();) {
			//Integer integer = (Integer) iterator.next();
			Integer integer = iterator.next();
			System.out.print(integer+ "\t");
		}
		System.out.println();
		
		//Map
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "上海");
		hashMap.put(2, "北京");
		hashMap.put(3, "广州");
		
		System.out.println("==========1.Map,iterator迭代器==============");
		for (Iterator<Entry<Integer, String>> entyr = hashMap.entrySet().iterator();entyr.hasNext();) {
			Entry<Integer, String> entry = entyr.next();
			System.out.print(entry.getKey() + ":" + entry.getValue() + "\t" );
		}
		Set<Integer> keys = hashMap.keySet();
		for(Iterator<Integer> iterator = keys.iterator();iterator.hasNext();){
			Integer integer = iterator.next();
			System.out.print(integer + ":" + hashMap.get(integer) + "\t");
		}
			
		System.out.println();
		System.out.println("==========2.Map增强版for方法==============");
		for (Integer key : hashMap.keySet()) {
			System.out.print(key + "==" + hashMap.get(key));
		}
		System.out.println();
		
		//Map组合到List
		HashMap<Integer,String> hashMap2 = new HashMap<>();
		hashMap2.put(5, "上海");
		hashMap2.put(4, "北京");
		hashMap2.put(3, "广州");
		
		List<HashMap<Integer,String>> maps = new ArrayList<>();
		maps.add(hashMap2);
		maps.add(hashMap);
		maps.add(hashMap2);//List里重复的保留
		
		System.out.println("********Map组合到List,双重增强版for循环***************");
		System.out.println(maps);
		for (HashMap<Integer, String> hashMap3 : maps) {
			for (Integer integer : hashMap3.keySet()) {
				System.out.print(integer + ":" + hashMap3.get(integer) + "\t");
			}
		}
		System.out.println();
		System.out.println("********Map组合到List,普通 + 增强for循环***************");
		for (int i = 0; i < maps.size(); i++) {
			HashMap<Integer, String> hashMap3 = maps.get(i);
			for (Integer integer : hashMap3.keySet()) {
				System.out.print(integer + ":" + hashMap3.get(integer) + "\t");
			}
		}
		System.out.println();
		System.out.println("********Map组合到Set,双重增强版for循环***************");
		HashSet<HashMap<Integer,String>> hashMaps = new HashSet<>();
		hashMaps.add(hashMap2);
		hashMaps.add(hashMap);
		hashMaps.add(hashMap2);//Set里面重复的删除掉了
		System.out.println(hashMaps);
		
		for (HashMap<Integer, String> hashMap3 : hashMaps) {
			for(Integer key : hashMap3.keySet()){
				System.out.print(key + "==" + hashMap3.get(key) + "\t");
			}
		}	
	}

}
