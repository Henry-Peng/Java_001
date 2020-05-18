package com.peng.test;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 复制文件:(按个读与写)
 * 		从源文件地址复制文件到目的地(C盘桌面)
 * @author pfh
 * @date 2020年5月13日
 */
public class ReaderWriterCopy {
	

	public static void main(String[] args)  {
	
		System.out.println("开始复制...");
		FileReader fr = null;
		FileWriter fw = null;
		
		//源文件的对象
		try {
			 fr = new FileReader("fr.java");
			//目的地的对象
			 fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt");
			//循环读取并写入
			for (int c = 0; (c = fr.read()) != -1; ) {
				fw.write((char) c);
			}
			//关闭资源,2个
			fw.close();
			fr.close();
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
