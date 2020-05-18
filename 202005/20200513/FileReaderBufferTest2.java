package com.peng.test;

import java.io.FileReader;
import java.io.IOException;

import com.peng.enu.ContextUtil;

/**
 * 将文件中的数据读到控制台:(读取的动作)
 *  使用这个fileReader类与文件做关联关系,产生一个对象
 *  使用方法.read()一个
 *  使用方式.read(以组方式抓取,数组),(效率)
 * @author pfh
 * @date 2020年5月13日
 */
public class FileReaderBufferTest2 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始...");
		FileReader fr = new FileReader("fr.java");
		
		/*//缓存区(临时存放区)
		char[] bufchar = new char[3];
		int count = 0;
		while((count = fr.read(bufchar)) != -1) {
			System.out.print(new String(bufchar, 0, count));
		}*/
		
		
		char[] buf = new char[ContextUtil.CONTEXTCOUNT]; //建立缓存区	
		int num = 0;
		for (int i = 0;(num =  fr.read(buf) ) != -1; i++) {//虽然buf设置可以放1024个,但是只存放了22个,长度也是22
			System.out.println("第" + (i + 1) + "次读取,读取" + num + "个字符:" + new String(buf, 0, num));
			//new String(buf, 0, num),String方式读取buf的数据,从索引位置0开始读取num个数据
		}//所以最后一次只输出最后2个字符
		//char类型占两个字节
		fr.close();
		System.out.println("结束...");

	}

}
