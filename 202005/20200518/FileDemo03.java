package com.peng.file;

import java.io.File;
import java.io.IOException;

/**
 * 判定:
 * 		1.目录或文件
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo03 {

	public static void main(String[] args) throws IOException {
		System.out.println("began...");
		
	    File file = new File("fileDir");
	    System.out.println(file.mkdirs());//创建目录
	    
	    File file2 = new File("fileDir\\file.txt");
	    System.out.println(file2.createNewFile());//创建文件
	    
	    if (file2.exists()) {//判定文件是否存在
			System.out.println(file2.getName() + "  存在");
		}else {
			System.out.println(file2.getName() + "  不存在");
		}
	    System.out.println("isAbsolute:  " + file2.isAbsolute());
	    System.out.println("isDirectory:  " + file2.isDirectory());
	    System.out.println("isFile:  " + file2.isFile());
	    System.out.println("isHidden:  " + file2.isHidden());
	   System.out.println("******************");
	    System.out.println("isAbsolute:  " + file.isAbsolute());
	    System.out.println("isDirectory:  " + file.isDirectory());
	    System.out.println("isFile:  " + file.isFile());
	    System.out.println("isHidden:  " + file.isHidden());
	    
		System.out.println("end...");
	}
	
}
