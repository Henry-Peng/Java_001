package com.peng.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * File类的测试方法:
 *  1).文件名称
 *  2).文件路径
 *  3).文件大小
 *  4).文件最后一次修改时间
 * @author pfh
 * @date 2020年5月15日
 */
public class FileDemo01 {

	public static void main(String[] args) throws IOException {
		//创建File类(针对文件或是目录文件)
		File file = new File("newFile.log");
		
		//1.文件名称
		System.out.println("文件名称:" + file.getName());
		
		//2.文件路径
		System.out.println("绝对的路径地址----:  " + file.getAbsolutePath());
		System.out.println("文件的地址(相对的)----:  " + file.getPath());
		System.out.println("标准的路径地址----:  " + file.getCanonicalPath());
		//3.文件的大小
		System.out.println("文件大小:" + file.length());//UTF-8,一个汉字长度为3;GBK,一个汉字长度为2;
		
		//System.out.println(file.getTotalSpace());
		
		//4.文件最后一次修改的时间
		System.out.println("文件最后一次修改的时间:" + file.lastModified());
		System.out.println("文件最后一次修改的时间:" + (new SimpleDateFormat("y/M/d H:mm:s").format(file.lastModified())));
		//文件最后一次修改的时间:2020/5/17 23:08:19
		System.out.println("lastModified:  " + (DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(file.lastModified())));
		
		
	}

}
