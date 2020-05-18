package com.peng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 复制文件:
 * 		源文件:FileReader,缓冲区BufferedReader
 * 		目的地:FileWriter,缓冲区BufferedWriter
 * @author pfh
 * @date 2020年5月15日
 */
public class CopyBufReadToBufWrit {
	
	public static void main(String[] args) throws IOException {
	
		System.out.println("开始");
		//创建对象
		FileReader fr = new FileReader("fr.java");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("fw.txt");//,true
		BufferedWriter bw = new BufferedWriter(fw);
		
		//循环读与写(按个读,按个写入)
		int len = 0;
		while ((len = br.read()) != -1) {
			bw.write(len);
			//bw.newLine();
		}
		
		/*char[] cbuf = new char[5];
		while ((len = br.read(cbuf)) != -1) {
			bw.write(cbuf, 0 , len );
		}*/

		/*String lineContext = null;
		while((lineContext = br.readLine()) != null){
			bw.write(lineContext);
			bw.newLine();
			bw.flush();
		}
		*/
 		bw.close();
 		br.close();
 		System.out.println("结束");
		
	}
}
