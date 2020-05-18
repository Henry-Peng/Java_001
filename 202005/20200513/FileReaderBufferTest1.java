package com.peng.test;

import java.io.FileReader;
import java.io.IOException;

/**
 * 将文件中的数据读到控制台:(读取的动作)
 *  使用这个fileReader类与文件做关联关系,产生一个对象
 *  使用方法.read()一个
 *  使用方式.read(以组方式抓取,数组),(效率)
 * @author pfh
 * @date 2020年5月13日
 */
public class FileReaderBufferTest1 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始...");
		FileReader fr = new FileReader("fr.java");
		
		/*//缓存区(临时存放区)
		char[] bufchar = new char[3];
		int count = 0;
		while((count = fr.read(bufchar)) != -1) {
			System.out.print(new String(bufchar, 0, count));
		}*/
		
		
		char[] buf = new char[5]; //建立缓存区
		/*//System.out.println(fr.read());//112
		int nums = fr.read(buf);//5,.read(buf)将读取的数据放入数组中,并返回数组存放数据的数量
		System.out.println(new String(buf));//packa
		System.out.println(new String(buf));//packa
*/		
		int num = 0;
		for (int i = 1;(num =  fr.read(buf) ) != -1; i++) {
			System.out.println("第" + i + "次读取,读取" + num + "个字符:" + new String(buf));
		}//最后一次读取了两个数据,所以把倒数第二次的buf覆盖了前两个,后三个不变
		//char类型占两个字节
		fr.close();
		System.out.println("结束...");

	}

}
