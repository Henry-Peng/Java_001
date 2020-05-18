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
public class CopyByteFile3 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始");

		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\3D8B8CFFBA65B01AF181D3CF222170B5.jpg");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\copy .jpg");
 		
		//按数组方式读取:边读边写
		byte[] buf = new byte[ContextUtil.CONTEXTCOUNT];
		int count = 0;
		while((count = fis.read(buf)) != -1){
			fos.write(buf,0,count);//最后一次拿写进去,按实际大小输入
			fos.write(buf);//最后一次补全空格,会变大
		}
 		
		fis.close();
		fos.close();
		System.out.println("结束");
	}

}
