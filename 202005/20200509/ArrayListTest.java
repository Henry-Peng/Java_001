package com.peng.list;
import java.util.ArrayList;
import java.util.List;
/**
 * ArrayList测试类
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//Collection<E>;
		//List<E>();
		//Map<K, V>   //键,值
		List<String> list1 = new ArrayList<>();//默认初始化长度为10;
		list1.add("a");
		list1.add("b");
		list1.add(2, "c");
		list1.add(2, "d");//在2位置添加,类似于插入
		System.out.println(list1);//[a, b, d, c]
		//list1.add(5, "h");//插入4位置可以,5位置不可以,越界,因为4位置是空的
		
		List<String> list2 = new ArrayList<>();
		list2.add("e");
		list2.add("f");
		list2.add("g");
		
		
		
		//1).两个集合合并,addAll
		list1.addAll(list2);
		System.out.println(list1);//[a, b, d, c, e, f, g]
		list1.addAll(3, list2);//在3位置之前额外插入一个list2
		System.out.println(list1);//[a, b, d, e, f, g, c, e, f, g]
		
		//取值
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			if (i%5 == 0) {
				System.out.print("\t");
			}
			System.out.print(list1.get(i));
		}
		System.out.println("\n********list1.removeAll(list2)*************");
		//2).removeAll:list1里面与list2一致的移除
		list1.removeAll(list2);
		for (int i = 0; i < list1.size(); i++) {
			if (i%5 == 0) {
				System.out.print("\t");
			}
			System.out.print(list1.get(i));
		}
		System.out.println("\n*****list2有efg,list1把efg移除之后还剩abdc******");
		
		//3).retainAll:取两边共有的元素值
		list1.retainAll(list1);
		list2.retainAll(list1);
		System.out.println(list1);//[a, b, d, c]
		list2.retainAll(list1);
		System.out.println(list2);//[],没有重复,空集合
		
		
		//4).containsAll,完全包含则为true
		System.out.println(list1.containsAll(list2));//true
		list2.add("e");
		System.out.println(list1.containsAll(list2));//false
		System.out.println(list1.containsAll(list1));//true
		printArrayList(list1);
		printArrayList(list2);
	}
	
	public static void printArrayList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i%5 == 0) {
				System.out.print("\t");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	
	
	

}
