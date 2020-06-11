package com.peng.file;

import java.io.File;

/**
 * 测试过滤器类:
 *		以什么后缀名进行过滤(.txt,.java)
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo08_Filter {

	public static void main(String[] args) {
		 File file = new File("fileDir");
		 //把会变动的代码抽取出来,写在外部
		 String[] files = file.list(new FileFilterlist(".java"));//
		 System.out.println(files.length);
		 for(String f : files){
			System.out.println(f); 
		 }
		
	}

}
