package com.peng.test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流:
 * 		把数据写入文件中
 * @author pfh
 * @date 2020年5月15日
 */
public class FileOutPutStreamTest {

	public static void main(String[] args) throws IOException {
		System.out.println("开始");
		
		//创建与文件相关联的对象
		FileOutputStream fos = new FileOutputStream("out.txt",true);
		
		//fos.write(97);
		fos.write("string".getBytes());//传递出去的是字节
		fos.write(13);
		fos.write("That's OK.".getBytes());
		fos.close();
		System.out.println("结束");
	}

}
