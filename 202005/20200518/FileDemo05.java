package com.peng.file;

import java.io.File;

/**
 * 获取系统的根目录
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo05 {

	public static void main(String[] args) {
		System.out.println("began..");
		File[] roots = File.listRoots();//静态方法,可以直接点引用,返回一个File类的数组
		for(File file: roots){
			System.out.println(file);
		}
		
		System.out.println("end");
	}

}
