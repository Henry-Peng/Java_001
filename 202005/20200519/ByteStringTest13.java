package com.peng.file;

import java.io.UnsupportedEncodingException;

/**
 * 编码,解码:
 * 		1.编码:字符串转化为字节数组(输出的是纯数字)
 * 		2.解码:字节数组转化为字符串
 * 		3.设置编码(UTF-8, GBK)
 * @author pfh
 * @date 2020年5月19日
 */
public class ByteStringTest13 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String  string = "天气晴";
		byte[] bytes = string.getBytes();//自动查找默认的开发工具
		System.out.println("UTF-8字节长度: " + bytes.length);//9
		for (byte b : bytes) {
			System.out.print(b + "\t");
		}
		
		byte[] byteGbk = string.getBytes("gbk");
		System.out.println("\nGBK字节长度: " + byteGbk.length);//6
		for (byte b : byteGbk) {
			System.out.print(b + "\t");
		}
		
		//解码utf-8(字节数组转化为字符串)
		//String utf = new String(bytes);//utf-8
		String utf = new String(bytes, "utf-8");//utf-8,任意字母大小写均可以,建议统一
		//String utf = new String(bytes, "gbk");//编码解码不一致会乱码
		System.out.println("\n" + utf);
		
		//解码GBk:编码与解码尽可能一致
		String gbk = new String(byteGbk,"GBK");
		//String gbk = new String(byteGbk,"GB2312");也可以用同一系列的编码
		System.out.println(gbk);
		
		
		
	}

}
