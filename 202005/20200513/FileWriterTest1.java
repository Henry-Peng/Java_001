package com.peng.test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * java代码操作:写数据到某个盘符记事本
 * 1.new FileWriter(与文件产生关联关系)
 * 2.write操作
 * 3.flush:刷新流(把前面写的数据保存)
 * 4.close:关闭流
 * @author pfh
 * @date 2020年5月13日
 */
public class FileWriterTest1 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始");

		//runWrite();FileWriter fw = new FileWriter("abc.txt");//新建连接之后会清零
		
		FileWriter fw2 = new FileWriter("abc.txt",true);//第二个参数,true,新建连接之后,会把以前的保存,在这基础之上操作
		
		fw2.write("abcdefg\r");
		fw2.append('c');//写入一个'c'字符,并返回一个Writer对象
		
		fw2.close();//关闭流,先刷新后关闭
		System.out.println("结束..");

	}
	
	public static void runWrite() throws IOException{
		
		//如果不写盘符,则自动创建存放在当前项目下(project)
		//如果有此文件(该项目文件夹下),则把数据写入此文件中
		FileWriter fw = new FileWriter("abc.txt");//第二个参数,true
		//\r回到行首,\n换行, "\r\n"为enter键功能
		fw.write("asss\r\tll\nkk\rop\nsl\r\nopq\n\rssr");//  "\r\n"才是回车换行
		fw.write("\n\rk\n\r\rll\r\nkk");
		
		//flush:刷新流(把前面写的数据保存)
		fw.flush();
		fw.write("  edd");
		fw.write("\taa\n\"\\all\r999ll\nlik");
		fw.close();
	}

}
