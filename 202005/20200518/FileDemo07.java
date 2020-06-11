package com.peng.file;

import java.io.File;

/**
 * 目录内容的获取
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo07 {

	public static void main(String[] args) {
		 File file = new File("D:\\eclipse\\安装\\seDemo08I&O\\fileDir");
		 File file2 = new File("fileDir\\file.txt");
		 
		 System.out.println(file.length());//0,如果file名是目录,则未指定返回值;
		 System.out.println(file2.length());//22,如果file名不是目录,则返回该文件的长度
		 
		 String files[] = file.list();
		 System.out.println(files.length);//4
		 
		 for (String string : files) {
			System.out.println(string);
		}

	}

}
