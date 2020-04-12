package com.peng.demo;
/**
 * railway ticket information define and putput
 * @author pfh
 * @date 2020年4月12日
 */
public class TrainTicketInfo {

	public static void main(String[] args) {
		// 20200412 pfh add train ticket information
		String number = "H079256";
		String departureStation = "枣庄西";
		int trainNumber = 1467 ;
		String destination = "苏州";
		String time = "2020年02月02日21:39开";
		String seatNumber = "  15车066号";
		double prize = 75.0 ;
		String seat = "新空调硬座";
		String comment = "限乘当日当次车";
		String ID = "371324****6666";
		String name = "小方";
		String advertising = "买票请到12306 发货请到95306";
		String eventual = "中国铁路祝您旅途愉快";
		/**
		 * below is the output information of train ticket  
		 */
		System.out.println(number);
		System.out.print(departureStation+"站                ");
		System.out.print(trainNumber+"      ");
		System.out.println(destination+'站');
		System.out.print(time);
		System.out.println(seatNumber);
		System.out.print("￥"+prize+"元                                  ");
		System.out.println(seat);
		System.out.println(comment);
		System.out.println();
		System.out.print(ID);
		System.out.println(name);
		System.out.println(advertising);
		System.out.println(eventual);
		//end pfh 20200412

	}

}
