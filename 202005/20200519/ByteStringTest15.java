package com.peng.file;

import java.io.UnsupportedEncodingException;

/**
 * 编码:GBK
 * 		解码:iso8859-1
 * 		编码:iso8859-1
 * 解码:GBK
 * @author pfh
 * @date 2020年5月19日
 */
public class ByteStringTest15 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = "好天气".getBytes("gbk");
		for (byte b : bytes) {
			System.out.print(b + "\t");
		}
		String string = new String(bytes, "iso8859-1");
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
