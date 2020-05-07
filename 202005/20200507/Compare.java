package com.peng.others;

import com.peng.basics.StringBuilderTest3;

/**
 * 比较String,StringBuilder,StringBuffer类性能
 * @author pfh
 * @date 2020年5月7日
 */
public class Compare extends StringBuilderTest3{

	public static void main(String[] args) {
		
	}
	
	/*
	 * 性能比较方法:0表示String类;1表示StringBuilder类;2表示StringBuffer类
	 */
	public static void compareMethod(int method){
		switch (method) {
		case 0:
			getString();
			break;
		case 1:
			getStringBuilder();
			break;
		case 2:
			getStringBuffer();
			break;
		default:
			System.out.println("信息输入错误(0表示String类;1表示StringBuilder类;2表示StringBuffer类)");
			break;
		}
	}

}
