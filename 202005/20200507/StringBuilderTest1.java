package com.peng.basics;

/**
 * 可变字符串:StringBuilder类
 *    1).可变源码原因:父类AbstractStringBuilder源码里有此char[] value;
 *    2).StringBuilder 和 StringBuffer类最大的区别是:StringBuffer里面有很多关键字synchronized[同步](效率不高,但是安全)
 * @author pfh
 * @date 2020年5月7日
 */
public class StringBuilderTest1 {

	public static void main(String[] args) {
		String str1 = "q";
		String str2 = "a";
		String str3 = "z";
		//double a = 22.5;
		System.out.println(str1.hashCode());//113三个hashCode内存地址不同
		System.out.println(str2.hashCode());//97
		System.out.println(str3.hashCode());//122///不能(byte)str3,会报错
		//System.out.println((int) a);//22
		
		/*
		 * StringBuilder
		 */
		StringBuilder sb = new StringBuilder("qaz");//默认长度是16,如果超过,会扩容
		System.out.println(sb.hashCode());//366712642
		System.out.println(sb);
		
		/*
		 * 替换,setCharAt();
		 */
		sb.setCharAt(1, 'b');//替换了第二个字符
		System.out.println(sb.hashCode());//366712642相同的地址
		System.out.println(sb);//qbz
		
		/*
		 * 追加方法
		 */
		sb.append("qqqqqqqqqqqqqqqqqq");
		sb.append("wwwww");
		System.out.println(sb);
		
		/*
		 * 倒序
		 */
		sb.reverse();//将本身倒序
		System.out.println(sb);

	}

}
