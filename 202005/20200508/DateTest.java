package com.peng.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间类
 * @author pfh
 * @date 2020年5月7日
 */
public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getTime());//当前时间的毫秒数
		System.out.println(System.currentTimeMillis());//当前时间的毫秒数
		System.out.println(date.toString());//Thu May 07 19:33:06 CST 2020
		//有横线表示这是一个过时的方法,都已经被Calendar取代
		System.out.println(date.toLocaleString());//2020-5-7 19:33:06
		System.out.println(date.toLocaleString().substring(9, 17));//19:38:33;左闭右开,保留17-9位数
		System.out.println(date.toInstant());//2020-05-07T11:34:44.529Z
		System.out.println(date.toGMTString());//7 May 2020 11:34:44 GMT//这是中央时区时间,比北京早八个小时
		
		System.out.println("年月日:" + 
					(date.getYear() + 1900) + "-"
					+ (date.getMonth() + 1) + "-" +
					date.getDate());
		System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		
		date.setDate(22);
		date.setHours(22);
		System.out.println(date.toLocaleString());//2020-5-22 22:40:06
		System.out.println("年月日:" + 
				(date.getYear() + 1900) + "-"
				+ (date.getMonth() + 1) + "-" +
				date.getDate());//前面setDate(22);
		//结果:年月日:2020-5-22

	}

}
