package com.peng.model;

/**
 * 子类:男孩类
 * @author pfh
 * @date 2020年4月26日
 */
public class Son extends Father{
	
	
	@Override
	public void eat() {
		System.out.println(super.getName()+"儿子正在吃饭...");
	}
	
	public void coding() {
		System.out.println(super.getName()+"编写代码...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
