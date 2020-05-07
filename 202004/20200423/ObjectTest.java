package com.peng.test;

import com.peng.modelNew.Son;

/**
 * object类:会查看源码,方法引用
 * @author pfh
 * @date 2020年4月23日
 */
public class ObjectTest {

	public static void main(String[] args) {
		Son son = new Son();
		//全限定路径名称
		System.out.println("getclass:" + son.getClass());
		System.out.println("son.class:" + Son.class);
		System.out.println("哈希码:" + son.hashCode());
		//类的地址
		System.out.println(son);
		System.out.println(son.toString());
		
	}

}
