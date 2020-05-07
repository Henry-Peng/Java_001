package com.peng.basics;
/**
 * StringBuilder类的链式调用
 * @author pfh
 * @date 2020年5月7日
 */
public class StringBuilderTest2 {

	public static void main(String[] args) {
		//创建对象
		StringBuilder sb = new StringBuilder();
		sb.append("eee").append("aaa");//源码此方法:return this;返回自身对象
		System.out.println(sb);
		
		/*
		 * reverse倒序,位置倒序并传回本身
		 */
		sb.reverse();
		System.out.println("倒序:" + sb);
		
		/*
		 * insert,插入
		 */
		sb.insert(3, "bbb");//从第四个位置之前开始插入,即a[3]之前插入
		System.out.println(sb);//aaabbbeee
		sb.insert(sb.indexOf("eee"), "ccc");//在eee的位置之前插入
		System.out.println(sb);
		
		/*
		 * delete 删除
		 */
		StringBuilder ab = new StringBuilder("123456789");
		ab.delete(2, 6);//删除a[2]到a[5],删除范围[a[2],a[6]);左闭右开
		System.out.println(ab);//12789
		
		sb.delete(sb.indexOf("b"), sb.lastIndexOf("c"));//删除第一个b到最后一个c,保留最后一个c
		System.out.println(sb);//aaaceee
		
		

	}

}
