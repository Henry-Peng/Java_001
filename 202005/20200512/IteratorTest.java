package com.peng.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 针对List,Map,Set的Iterator,遍历
 * @author pfh
 * @date 2020年5月11日
 */
public class IteratorTest {

	public static void main(String[] args) {
		getListIterator();
		System.out.println("**********");
		getSetIterator();
		System.out.println("==========");
		getMapIterator();
	}
	
	/*
	 * Map类的迭代器:(for)
	 */
	public static void getMapIterator(){
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "火车");
		map.put(2, "轮船");
		map.put(3, "汽车");
		//Iterator<Map<Integer, String>> iterator = map.get(Integer).
		//第一种循环:(entrySet)
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Iterator<Entry<Integer, String>> iteratorMap = set.iterator();iteratorMap.hasNext();){
			Entry<Integer, String> entry = iteratorMap.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//第二种循环:(keySet)
		Set<Integer> keys = map.keySet();
		for(Iterator<Integer> iterator = keys.iterator();iterator.hasNext();){
			//System.out.println(iterator.next());//遍历Keys
			//System.out.println(iterator.next() + ":" + map.get(iterator.next()));//报错
			int key =  iterator.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		//获取所有的Values值
		System.out.println(map.values());
		Collection<String> value = map.values();
		for (String v : value) {
			System.out.println(v);
		}
		System.out.println("--------------");
		
		//第三种循环:(增强版for,使用频率最多)
		for (Integer integer : map.keySet()) {
			System.out.println(integer + ":" + map.get(integer));
		}
	}
	
	/*
	 * Set类的迭代器:(for)
	 */
	public static void getSetIterator(){
		//创建对象
		Set<String> set = new HashSet<>();
		set.add("CPU");
		set.add("主板");
		set.add("硬盘");
		set.add("内存条");
		
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
	}
	
	/*
	 * List迭代器:遍历(while,for)
	 */
	public static  void getListIterator() {
		//集合
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		
		/*Iterator<String> itr = list.iterator();
		//itr.hasNext();//是否有下一个
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		for(Iterator<String> itr = list.iterator();itr.hasNext();){
			System.out.println(itr.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
