package com.peng.basics;

import java.util.Scanner;

/**
 * 控制台输入
 * @author pfh
 * @date 2020年5月7日
 */
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println(sc.next());//以空格为界限
		System.out.println(sc.nextLine());//不管空格,全部整行
*/
		if (sc.hasNextLine()) {//判断是否有输入型
			String inString = sc.nextLine(); //将接收到的内容放入String inString 中.
			System.out.println("输入信息为:" + inString);
		}
		sc.close();
	}

}
