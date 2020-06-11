package com.peng.file;

import java.io.UnsupportedEncodingException;

/**
 * 编码:GBK(英文不乱码)
 * 		解码:utf-8
 * 		编码:iso8859-1
 * 解码:GBK
 * @author pfh
 * @date 2020年5月19日
 */
public class ByteStringTest14 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = "Hello".getBytes("gbk");
		for (byte b : bytes) {
			System.out.print(b + "\t");
		}
		String string = new String(bytes, "utf-8");
		System.out.println("\n" + string);
		//byte[] byteNew = string.getBytes("GBK");//不可以是GBK
		byte[] byteNew = string.getBytes("iso8859-1");
		for (byte b : byteNew) {
			System.out.print(b + "\t");
		}
		System.out.println();
		String stringNew = new String(byteNew,"GBK");
		
		System.out.println(stringNew);

	}

}
