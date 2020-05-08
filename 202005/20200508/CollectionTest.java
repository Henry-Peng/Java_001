package com.peng.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 测试Collection类的方法:
 *  1).size:数据长度
 *  2).isEmpty:集合是否为空
 *  3).add:赋值
 *  4).打印输出值与size
 *  5).contains:是否包含元素
 *  6).toArray:转换成数组对象
 *  7).remove:移除（删除）
 *  8).clear:集合清空（相当于new方式，无数据）
 * @author pfh
 * @date 2020年5月8日
 */
public class CollectionTest {

	public static void main(String[] args) {
		Collection<String> arrayList = new ArrayList<String>();//<包装类,引用类型,class类>
		// 1).size:数据长度
		System.out.println("集合大小:" + arrayList.size());
		
		// 2).isEmpty:集合是否为空
		System.out.println("集合是否为空:" + arrayList.isEmpty());
		
		// 3).add:赋值
		arrayList.add("ab");
		arrayList.add("cd");
		arrayList.add("ef");
		System.out.println("集合是否为空:" + arrayList.isEmpty());
		
		// 4).打印输出值与size
		System.out.println(arrayList);//[ab, cd, ef]
		System.out.println("集合大小:" + arrayList.size());//3
		
		// 5).contains:是否包含某元素
		System.out.println("判定是否有cd这个值:" + arrayList.contains("cd"));//true,单纯其中一个字符拆分不可以,false
		
		// 6).toArray:转换成数组对象
		Object[] object = arrayList.toArray();
		System.out.println(object[1]);//cd
		System.out.println(object);//[Ljava.lang.Object;@15db9742
		System.out.println(arrayList);//[ab, cd, ef]
		System.out.println(Arrays.toString(object));//[ab, cd, ef]
		
		// 7).remove:删除.移除
		arrayList.remove("cd");
		System.out.println(arrayList);//[ab, ef]

		// 8).clear:集合清空(相当于new方式,无数据)
		//arrayList.clear();
		arrayList = new ArrayList<>();
		System.out.println(arrayList.size());//0
		
		
	}

}
