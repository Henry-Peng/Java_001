package com.peng.random;

import java.util.Random;
import java.util.UUID;

import javax.naming.ldap.Rdn;

/**
 * 随机数生成:
 * 	1).random
 * 	2).Math
 * 	3).UUID
 * @author pfh
 * @date 2020年5月8日
 */
public class RandomTest {

	public static void main(String[] args) {
		//UUID中的随机生成数
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		System.out.println( UUID.randomUUID());
		System.out.println( UUID.randomUUID());

	}

	public static void mathMethod() {
		// 2.Math调用随机方法
		System.out.println(Math.PI);// 3.141592653589793,输出π值
		System.out.println("随机生成的小数点:" + Math.random());
		System.out.println("随机生成的整数:" + (int) (Math.random() * 10));
		System.out.println("随机生成的整数:" + Math.ceil(Math.random() * 10));
		System.out.println("(int)8.5结果:" + (int) 8.5);// 向下取整,结果8
		System.out.println("向上取整ceil:" + Math.ceil(5.1));// 向上取整,结果为6.0
		System.out.println("向下取整floor:" + Math.floor(5.9));// 向下取整,结果5.0
		System.out.println("四舍五入round:" + Math.round(5.5));// 四舍五入,结果6
	}
	
	public static void randomRun() {
		// 1.随机数
		Random random = new Random();
		int num = random.nextInt();
		System.out.println(num);
		System.out.println(num * 10);
	}

}
