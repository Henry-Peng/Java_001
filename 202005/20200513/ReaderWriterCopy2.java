package com.peng.test;
import java.io.FileReader;
import java.io.FileWriter;

import com.peng.enu.ContextUtil;

/**
 * 复制文件:(按数组读与写)
 * 		从源文件地址复制文件到目的地(C盘桌面)
 * @author pfh
 * @date 2020年5月13日
 */
public class ReaderWriterCopy2 {

	public static void main(String[] args)  {
		System.out.println("开始复制...");
		FileReader fr = null;
		FileWriter fw = null;
		
		//源文件的对象
		try {
			fr = new FileReader("fr.java");
			//目的地的对象
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt",true);
			//定义一个临时存放区
			char[] buf = new char[ContextUtil.CONTEXTCOUNT];
			//按照数组长度循环读取并写入
			for (int len = 0; (len = fr.read(buf)) != -1; ) {
				fw.write(buf,0,len);
			}
			/*//关闭资源,2个
			fw.close();
			fr.close();*/
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}

		System.out.println("复制结束...");

	}

}
