package com.peng.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 时间取值
 * @author pfh
 * @date 2020年5月8日
 */
public class CalendarTest {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();//实例化:获得所有的时间属性和值
		System.out.println(ca);
		System.out.println(ca.getTime());//Fri May 08 22:05:19 CST 2020
		
		//获取年月日
		//System.out.println(ca.get(ca.YEAR));
		System.out.println(ca.get(Calendar.YEAR) + "-" + (ca.get(Calendar.MONTH ) + 1) + "-" + ca.get(Calendar.DATE)
				 //+ " " + ca.get(Calendar.HOUR)//12小时制
				 + " " + ca.get(Calendar.HOUR_OF_DAY)//24小时制
				 + ":" + ca.get(Calendar.MINUTE) + ":" + ca.get(Calendar.SECOND)
				);
		
		/*
		 * 比较下面三行输出
		 */
		System.out.println(ca.YEAR + "年" + ca.MONTH + "月" + ca.DAY_OF_MONTH + "日");
		System.out.println(Calendar.YEAR + "年" + Calendar.MONTH + "月" + Calendar.DAY_OF_MONTH + "日");
		System.out.println(ca.get(1) + "年" + (1 + ca.get(Calendar.MONTH)) + "月" + ca.get(Calendar.DAY_OF_MONTH) + "日");
		//             看正上方,1和Calendar.Year一样的效果
		//System.out.println(1 == Calendar.YEAR);//true
		
		//new 子类
		Calendar gr = new GregorianCalendar();
		System.out.println(gr);
		//System.out.println(gr.get(1) + "-" + (gr.get(2) + 1) + "-" + gr.get(5));//虽然结果没问题,但是感觉不正规
		System.out.println(gr.get(Calendar.YEAR) + "-" + (gr.get(Calendar.MONTH) + 1) + "-" + gr.get(Calendar.DATE));
		//1:Calendar.YEAR     2:Calendar.MONTH    5:Calendar.DATE
		System.out.println("周" + (gr.get(Calendar.DAY_OF_WEEK)-1));//周几
		System.out.println((gr.get(Calendar.MONTH) + 1) + "月" + gr.get(Calendar.DAY_OF_MONTH) + "日");
		
		System.out.println("努力啊!" + (gr.get(Calendar.MONTH) + 1) + "月");
		//设置时间
		System.out.println("************设置时间**************");
		
		Calendar c3 = new GregorianCalendar();
		c3.set(Calendar.YEAR, 2030);//设置多少是多少
		System.out.println(c3.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.YEAR));
		
		Calendar c4 = new GregorianCalendar();
		c4.add(Calendar.YEAR, -200);//加减年份
		System.out.println(c4.get(Calendar.YEAR));//1820
		
		Calendar c5 = new GregorianCalendar();
		System.out.println(c5.get(Calendar.DAY_OF_MONTH));
		c5.add(Calendar.DAY_OF_MONTH, -38);//安照正常月份日期计算
		System.out.println(c5.get(Calendar.DAY_OF_MONTH));//31
		System.out.println(c5.get(Calendar.MONTH) + 1);//3
		
		//计算2020.5.28 与2020.6.8相差几天
		Calendar c1 = new GregorianCalendar();
		Calendar c2 = new GregorianCalendar();
		c1.set(2020, 4, 28);//Month值从0开始记,4,代表5月份
		c2.set(2020, 5, 8);
		System.out.println(c2.get(Calendar.MONTH));//输出为5,表示6月
		long time = c2.getTimeInMillis() - c1.getTimeInMillis();
		int day = (int)time/(1000*60*60*24);
		System.out.println(day);
		
		
	}

}
