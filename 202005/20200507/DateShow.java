package com.peng.model;

import java.util.Date;

/**
 * 时间类
 * @author pfh
 * @date 2020年5月7日
 */
public class DateShow {

	public static void main(String[] args) {
		showNowDate();
		showNowTime();
	}
	
	/*
	 * 方法1.输出当前日期:2020-5-7
	 */
	public static void showNowDate() {
		Date date = new Date();
		System.out.println((date.getYear() + 1900) + "-" + (date.getMonth() + 1) + "-" + date.getDate());
	}
	
	/*
	 * 方法2:输出当前时间:19:43:10
	 */
	public static void showNowTime() {
		Date date = new Date();
		System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
	}
}
