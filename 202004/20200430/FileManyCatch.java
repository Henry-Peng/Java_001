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
public class FileManyCatch {

	public static void main(String[] args) {
		
		//记事本的文件读取,读取文件类
		try {
			FileReader fr = new FileReader("c:\\Users\\Administrator\\Desktop\\abc.txt");
			/*System.out.println(fr.read());//读取文件内容,每次读取一个字符,-1表示空.
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());*/
			
			for(int i ;(i = fr.read()) != -1; ) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {//捕获先从子类异常,再到父类异常
			e.printStackTrace();//也可以直接catch父类的异常,子类的异常不用
		} catch (RuntimeException e) {//父类
			e.printStackTrace();
		}catch (Exception e) {//祖宗类
			e.printStackTrace();
		}
	}

}
