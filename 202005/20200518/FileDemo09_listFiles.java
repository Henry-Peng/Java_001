package com.peng.file;

import java.io.File;

/**
 * 深度遍历:
 * 		1.与目录相关的File
 * 		2.通过对象调用.listFiles(file),返回File[]数组
 * 		3.通过前面得到的数组进行循环的读取文件(或是目录)
 * 		4.以当前读到的文件或是目录进行判定方法,如果是目录则进行递归查找(递归,自身调用自身的方法)
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo09_listFiles {

	public static void main(String[] args) {
		File file = new File("fileDir");
		getDirAll(file);
	}
	
	public static void getDirAll(File file){
		System.out.println("目录:" + file.getName());
		File[] files = file.listFiles();//只能获得第一级的文件与目录
		for (File f : files) {
			if (f.isDirectory()) {
				getDirAll(f);//调用自身,查找
			} else {
				//System.out.println(f.getName());
				System.out.println(f.getAbsolutePath());
			}
			
		}

	}

}
