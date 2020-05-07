package com.peng.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 多重捕捉块: (强制抛出)
 * 	try{
 * 		有可能发生异常的代码块
 * 	}catch(异常类1 别名1){
 * 		输出异常信息
 * 	}catch(异常类2 别名2){
 *		 输出异常信息
 * 	}
 * @author pfh
 * @date 2020年4月30日
 */
public class FileManyCatch2 {

	public static void main (String[] args) throws IOException{
		methodRead();//记事本的文件读取,读取文件类
	}
	public static void methodRead() throws IOException{
		FileReader fr = null;
		//记事本的文件读取,读取文件类
		//可以用try..catch块
	
			fr = new FileReader("c:\\Users\\Administrator\\Desktop\\abc.txt");
			
			for(int i ;(i = fr.read()) != -1; ) {
				System.out.print((char)i);
			}
			fr.close();
	}

}
