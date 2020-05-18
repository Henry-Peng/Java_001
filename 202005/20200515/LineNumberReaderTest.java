package com.peng.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * 显示行号与操作行号
 * @author pfh
 * @date 2020年5月15日
 */
public class LineNumberReaderTest {

	public static void main(String[] args) throws IOException {
		System.out.println("开始");
		//创建对象
		FileReader fr = new FileReader("abc.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		//lnr.setLineNumber(20);
		/*//设置当前行号
		lnr.setLineNumber(0);
		System.out.println(lnr.getLineNumber());//0
		System.out.println(lnr.getLineNumber());//0
		System.out.println(lnr.getLineNumber());//0
*/		
		//System.out.println(lnr.getLineNumber());
		String lineContxt = null;
		//System.out.println(lnr.getLineNumber());
		//readLine,读一行文字
		while ((lineContxt = lnr.readLine()) != null) {
			//System.out.println(lnr.getLineNumber());
			System.out.println(lnr.getLineNumber() + ":" + lineContxt);
		}
		
	/*	lnr.mark(5000);//进行标记,通过reset()可以返回,读取5000个字符之后可能会失效
*/			
		lnr.close();
		System.out.println("结束");
		

	}

}
