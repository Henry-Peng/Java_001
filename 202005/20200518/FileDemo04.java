package com.peng.file;

import java.io.File;
import java.io.IOException;

/**
 * 重命名:
 * 		1.同一个盘符下
 * 		2.不同的盘符之下
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo04 {

	public static void main(String[] args) throws IOException {
	/*	同一个盘符之下
	 * File file = new File("fileDir\\file.txt");
		file.createNewFile();
		File file2 = new File("fileDir\\file2.txt");
		System.out.println(file.renameTo(file2));//file必须是存在且正确的
*/
		
		//不同盘符之下的重命名,相当于剪切
		File dir = new File("E:\\javaTest\\ok");
		dir.mkdirs();
		File file = new File("E:\\javaTest\\ok\\ok.txt");
		file.createNewFile();
		File file2 = new File("fileDir\\ok.txt");
		System.out.println(file.renameTo(file2));
		
		
		
	}

}
