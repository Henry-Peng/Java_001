package com.peng.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 * @author pfh
 * @date 2020年5月8日
 */
public class DateFormateTest {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		// 1.[Date日期,转换成字符串]以当前的时间进行格式化(yyyy-MM-dd hh:mm:ss)
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sd.format(date);
		System.out.println(time);
	
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
		
		//2.字符串转换成Date方式,输入的是字符串时间
		
		Date date2 = sd.parse("2020-05-07 21:33:08");
		System.out.println("date2: " + date2);
		
		//3.其他方法方式
		SimpleDateFormat yd = new SimpleDateFormat("D");//一年中第几天
		System.out.println(yd.format(date2));//128
		
		SimpleDateFormat md = new SimpleDateFormat("d");//月中第几天
		System.out.println(md.format(date2));//7
		
		SimpleDateFormat mw = new SimpleDateFormat("W");//月中第几个星期
		System.out.println(mw.format(date2));//2
		
		DateShow dateShow = new DateShow();
		System.out.println(dateShow.formatDate("M"));//5,输出当前几月份
		
		System.out.println(dateShow.formatDate("w"));//19,现在是今年第19周
		
		//时间（字母）格式化的含义了解参考：http://www.blogjava.net/tokyo2006/archive/2010/04/01/317123.html

	}

}
