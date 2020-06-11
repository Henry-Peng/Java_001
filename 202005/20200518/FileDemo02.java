package com.peng.file;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件,创建目录(单个,多级目录)
 * 		返回类型(boolean)
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		System.out.println("began...");
		/*//创建删除文件
		File file = new File("fileDir\\file.txt");
		creatFile(file);
		deleteFileOrDir(file);*/
		
		/*//创建删除目录
		File file = new File("E:\\javaTest\\ok\\testOk.txt");//该操作会把testOk.txt也作为一个目录
		creatOneDirs(file);
		//creatOneDir(file);
		deleteFileOrDir(file);//只删除最后一级目录
		*/
		
		//创建多级目录和文件
		File file = new File("E:\\javaTest\\ok");
		creatOneDirs(file);
		File file2 = new File("E:\\javaTest\\ok\\ok.txt");
		creatFile(file2);
		/*//必须先删除目录里面的子文件才能用delete删除目录
		System.out.println(file2.delete());
		System.out.println(file.delete());*/
		
		/*File file3 = new File("E:\\javaTest");
		System.out.println(file3.delete());*/
		
		System.out.println("end...");
	}
	
	/*
	 * 创建多级目录
	 */
	public static void creatOneDirs(File file) throws IOException {
		if (file.mkdirs()) {
			System.out.println("多级目录" + file.getName() + "创建成功");
		}else {
			System.out.println("多级目录" + file.getName() + "创建失败");
		}
	}
	
	public static void creatOneDir(File file) throws IOException {
		if (file.mkdir()) {
			System.out.println("目录" + file.getName() + "创建成功");
		}else {
			System.out.println("目录" + file.getName() + "创建失败");
		}
	}
	
	/*
	 * 删除文件或目录
	 */
	public static void deleteFileOrDir(File file) throws IOException {
		if (file.delete()) {
			System.out.println("文件" + file.getName() + "删除成功");
		}else {
			System.out.println("文件" + file.getName() + "删除失败");
		}
	}
	
	/*
	 * 创建文件
	 */
	public static void creatFile(File file) throws IOException {
		if (file.createNewFile()) {
			System.out.println("文件" + file.getName() + "创建成功");
		}else {
			System.out.println("文件" + file.getName() + "创建失败");
		}
	}

}
