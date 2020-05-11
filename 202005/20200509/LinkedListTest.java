package com.peng.list;

import java.util.LinkedList;
/**
 * LinkedList测试类:
 * @author pfh
 * @date 2020年5月9日
 */
public class LinkedListTest {

	public static void main(String[] args) {
		//List<String> list = new LinkedList<>();
		LinkedList<String> list = new LinkedList<>();		
		for (int i = 97; i < 120; i++) {
			String c = (char) i + "";
			list.add(c);
		}
		/*System.out.println(list);
		list.add(1, "bb");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		list.remove();//移除了0位置的a
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		list.remove(0);
		list.add(0,"a");//把0位置的bb更改为a
		list.set(0, "a");*/
		list.addLast("x");
		System.out.println("\n" + list);
		
		//poll修剪,抓取一个数据,并返回这个值
		System.out.println(list.poll());//a
		System.out.println(list.pollFirst());//b
		System.out.println(list.pollLast());//x
		System.out.println(list);//链表里没有上述三个
		
		//push
		list.push("b");//从head头部添加数据,并不返回值
		list.push("a");
		System.out.println(list);
		
		//pop,类似于poll,从头部移走一个数据
		list.pop();//移走a
		System.out.println(list.pop());//移走b,并输出b
		System.out.println(list);
		
		
		
	}

}
