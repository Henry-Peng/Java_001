package com.peng.work;
/**
 * 数组转为字符串,再次输出
 * @author pfh
 * @date 2020年5月14日
 */
public class StringArray {

	public static void main(String[] args) {
		String[] strs={"阿里","腾讯","京东","百度"};
		StringBuffer sb = new StringBuffer();
		
		for (String s : strs) {
			sb.append(s + ",");
		}
		System.out.println(sb.substring(0, sb.length()-1));

	}

}
