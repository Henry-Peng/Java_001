package com.peng.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 针对List,Map,Set的Iterator,遍历
 * @author pfh
 * @date 2020年5月11日
 */
public class IteratorTest {

	public static void main(String[] args) {
		getListIterator();

	}
	/*
	 * 迭代器:遍历
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
		
	}

}
