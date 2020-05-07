package com.peng.demo;
/**
 * bus information define & output
 * @author pfh
 * @date 2020年4月12日
 */
public class BusInfo {

	public static void main(String[] args) {
		// 20200412 pfh add bus information
		String path = "19";//因为有的公交是K开头的，所以采用string
		String licensePlateNo = "苏L.U4366";
		String destination = "火车站南广场";
		String nowStation = "大市口西站";
		int intervalSite = 3;
		double nowPrice = 1.0;
		int nowNumber = 12;//当前乘客人数
		double intervalTime = 5.0;//间隔时间5.0 Minutes
		String summerTime = "5:30am-10:00pm";
		String winterTime = "6:00am-9:30pm";
		/**
		 * below is output information of bus
		 */
		System.out.println(path+"路");
		System.out.println("车牌号："+licensePlateNo);
		System.out.println("终点站"+destination);
		System.out.println("当前位于"+nowStation);
		System.out.println("距离此地还有"+intervalSite+"站");
		System.out.println("当前票价"+nowPrice+'元');
		System.out.println("车上乘客人数"+nowNumber);
		System.out.println("每班车间隔时间"+intervalTime+"分钟");
		System.out.println("夏季运营时间"+summerTime);
		System.out.println("冬季运营时间"+winterTime);
		//end pfh 20200412
		
	}

}
