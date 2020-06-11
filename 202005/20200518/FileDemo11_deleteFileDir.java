package com.peng.file;

import java.io.File;

/**
 * 深度遍历删除操作:(最终达到删除该目录文件的目的)(delete每次只能删除一个文件)
 * 		1.file与要删除的目录相关类
 * 		2.调用.listFiles()
 * 		3.循环返回的数组对象
 * 		4.当如果是目录,则使用递归方式查找,如果是文件则直接删除操作
 * 		5.最后一个目录进行删除操作
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo11_deleteFileDir {

	public static void main(String[] args) {
		File file = new File("fileDir");
		
		dropFileAndDirAll(file);

	}

	public static void dropFileAndDirAll(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				dropFileAndDirAll(f);
			} else if (f.isFile()) {
				System.out.println(f.getName() + "删除" + f.delete());//此处删除所有不是目录的文件
			}
		}
		//最后一级目录删除
		System.out.println(file.getAbsolutePath() + "删除" + file.delete());//此处删除该目录
	}

}
