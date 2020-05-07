package com.peng.basics;

import java.util.Arrays;

/**
 * String方法测试:
 * 1.equals方法,比较内容
 * 2.length方法,求长度
 * 3.concat方法,进行附加
 * 4.indexOf,字符串第一次出现的索引位置,从零开始数
 * 5.subString();截取
 * 6.split();分割
 * 7.replace();替换
 * @author pfh
 * @date 2020年5月6日
 */
public class StringTest {

	public static void main(String[] args) {
		/*equalsVal();
		getLength();*/
		//getIndexOf();
		//getSubString();
		//runSplit();
		testReplace();
	}
	/*
	 * 7.replace();替换
	 */
	public static void testReplace(){
		String asd = "220级 220十三本";
		System.out.println("1 *********" + asd.replace("220", "230"));
		System.out.println(asd);
		System.out.println("2 *********" + asd.replaceAll("220","210"));
		System.out.println(asd);
		System.out.println("3 *********" + asd.replaceFirst("220","33"));
		System.out.println(asd);
		System.out.println("6 *********" + asd.replace('2', '3'));
		/*
		 * replaceAll和replace有区别
		 */
		System.out.println(asd.replaceAll("\\d","f"));//fff级 fff十三本,\d代指数字字符,在正则表达式里面,\\d表示\d
		System.out.println(asd.replace("\\d", "f"));//220级 220十三本,\\d就是\\d


	}
	
	/*
	 * split();分割
	 */
	public static void runSplit(){
		String aString = "1,2,3,4,5,6,7";
		//aString.split(",")就是一个数组
		System.out.println(Arrays.toString(aString.split(",")));
		String[] bStrings = aString.split(",");
		for(String c : bStrings){
			System.out.print(c);
		}
		
	}
	
	/*
	 * 截取字符串,subString();
	 */
	public static void getSubString(){
		String a = "123456789";
		System.out.println(a.substring(4));//从第5个字符开始,56789
		System.out.println(a.substring(2, a.indexOf('6')));//345
	}
	
	/*
	 * indexOf,字符串第一次出现的索引位置,从零开始数
	 * lastIndexOf,最后一次出现的索引位置
	 */
	public static void getIndexOf(){
		String a = "8898907393903640are053" + '3';
		System.out.println(a.indexOf("90"));//4
		System.out.println(a.lastIndexOf("90"));//10
		System.out.println(a.indexOf(3));//-1,不得其解
	}
	
	
	
	public static void equalsVal(){
		String a = "abc";
		String b = a;
		a = new String("abc");
		System.out.println(a == b);
		System.out.println(a.equals(b));//.equals方法,比较内容
	}
	
	public static void getLength(){
		String a = "今天天气";
		String b = "阴天";
		System.out.println(a.length());//.length方法,求长度
		System.out.println(a.concat(b));//.concat方法,进行附加
		System.out.println(a + b);
	}

}
