package com.peng.test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读文件:
 * 		1).按个读
 * 		2).按数组的方式读
 * @author pfh
 * @date 2020年5月15日
 */
public class FileInPutStreamTest {

	public static void main(String[] args) throws IOException{
		System.out.println("开始");
		// 创建对象
		FileInputStream fis = new FileInputStream("out.txt");
		//按个读取
		fileRead(fis);
		//按数组读取
		fileReadByteArray(fis);
		
		fis.close();
		System.out.println("结束");
	}
	
	public static void fileReadByteArray(FileInputStream fis) throws IOException{
		//byte[] buf = new byte[ContextUtil.CONTEXTCOUNT];
		byte[] buf = new byte[fis.available()];//available:获取整个文件的大小,如果文件过大,会造成内存溢出
		int len = 0;
		while((len = fis.read(buf)) != -1){
			System.out.print(new String(buf, 0, len));
		}
	}

	public static void fileRead(FileInputStream fis) throws IOException{
		for (int i = 0; ( i = fis.read() ) != -1; ) {
			//System.out.print(i + "\t");
			System.out.print((char)i);
		}
	}
	

}
