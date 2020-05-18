package com.peng.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.peng.enu.ContextUtil;

/**
 * 复制字节文件:(记事本,图片,MP3,视频)
 * 		与源文件相关的类(FileInputStream)
 * 		与目的地文件相关的类(FileOutPutStream)
 * @author pfh
 * @date 2020年5月15日
 */
public class CopyByteFile2 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始");

		FileInputStream fis = new FileInputStream("D:\\360用户文件\\手机文件转存\\My music\\CET-4 词汇卡片音频\\CET4 209—224.mp3");
		
		FileOutputStream fos = new FileOutputStream("D:\\360用户文件\\手机文件转存\\My music\\CET-4 词汇卡片音频\\CET4 209—224 copy2.mp3");
 		
		//按数组方式读取:边读边写
		byte[] buf = new byte[ContextUtil.CONTEXTCOUNT];
		int count = 0;
		while((count = fis.read(buf)) != -1){
			fos.write(buf,0,count);
		}
 		
		fis.close();
		fos.close();
		System.out.println("结束");
	}

}
