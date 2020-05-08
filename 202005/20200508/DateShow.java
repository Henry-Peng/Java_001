package com.peng.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间类
 * @author pfh
 * @date 2020年5月7日
 */
public class DateShow {

	public static void main(String[] args) {
		/*showNowDate();
		showNowTime();*///过时方法
		showDate("yyyy-MM-dd");//2020-05-08
		showDate("hh:mm:ss");//09:18:42,12小时制
		showDate("H:m:s");//H表示24小时制,21:31:10
		showDate("F");//2,本月中的第2个星期五
		showDate("E");//星期五
		
		String date = formatDate("d");
		System.out.println(date);//8
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
	
	/*
	 * 方法3.根据格式输出当前date
	 * "yyyy-MM-dd":2020-5-8
	 * "hh:mm:ss":  09:18:42
	 * "H:m:s": (省略写法)  21:31:10
	 * "F":2,本月中的第2个星期五
	 * "E":星期五
	 */
	public static void showDate(String format){
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat(format);
		System.out.println(sd.format(date));
	}
	
	/*
	 * 返回设定格式的日期
	 */
	public static String formatDate(String format){
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat(format);
		return sd.format(date);
	}
	
}
