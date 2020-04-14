package com.peng.demo;
/**
 * 多条件：
 * Switch case 
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo015_switch {

	public static void main(String[] args) {
		int day = 22;
		showDayWeek(day);
	}
	/**
	 * 输入一个数字，执行输出对应的工作日
	 */
	public static void showDayWeek(int day) {
		String today = "**;输入数字有错误...";
		switch (day){//表达式
		case 1:
			//执行语句
			today = "周一";
			break;
		case 2:
			today = "周二";
			break;
		case 3:
			today = "周三";
			break;
		case 4:
			today = "周四";
			break;
		case 5:
			today = "周五";
			break;
		case 6:
			today = "周六";
			break;
		case 7:
			today = "周日";
			break;	
		}
		System.out.println("今天是"+today);
	}
}
