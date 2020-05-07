package com.peng.basics;

import com.peng.others.Compare;

/**
 * StringBuffer:源码方法名前有synchronized关键字[同步](安全性高,效率低)
 * @author pfh
 * @date 2020年5月7日
 */
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("sss").append(" ssr");
		System.out.println(sb);
		
		/*
		 * 比较String,StringBuilder,StringBuffer类性能
		 * 0表示String类;1表示StringBuilder类;2表示StringBuffer类
		 */
		Compare compare = new Compare();
		compare.compareMethod(0);
		compare.compareMethod(1);
		compare.compareMethod(2);
		/*compare.getString();
		compare.getStringBuilder();
		compare.getStringBuffer();*/

	}

}
