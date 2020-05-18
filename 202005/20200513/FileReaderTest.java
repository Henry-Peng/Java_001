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
public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		String aTest = "开始...";
		System.out.println(aTest);
		FileReader fr = new FileReader("fr.java");//读取文件,源文件必须存在,如不存在则报异常
		FileReader fr2 = new FileReader("abc.txt");
		//.read()返回-1,表示没有读取到数据
		//System.out.println(fr.read());
		/*System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());*/
		/*if (fr.read() != -1) {
			System.out.println("有数据");
		}else {
			System.out.println("文件没有数据");
		}*/
		int read = 0;
		while ((read = fr.read()) != 98) {
			System.out.print( (char) read);//+ "\t"
		}
		System.out.println();
		while ((read = fr2.read()) != -1) {
			System.out.print(read+ "\t");//+ "\t"
		}
		System.out.println("\n说明\\r是13,也说明虽然\\r在文本中没有显示出来,但是其实还是存在的");
		fr.close();
		fr2.close();
		System.out.println("结束...");
	}

}
