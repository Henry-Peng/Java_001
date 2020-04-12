package com.peng.demo;
/**
 * air ticket information define and output
 * @author pfh
 * @date 2020年4月12日
 */
public class AirTicketInfo {

	public static void main(String[] args) {
		// 20200412 pfh add airline ticket information 
		String flight = "U7850";
		String name = "黄鹤";
		String date = "08AUG";
		String destination = "CTU成都";
		String seat = "25C";
		int No = 110;
		char shippingSpace = 'Q';
		String gate = "C96";
		int boardingTime = 1630;
		String remark = "ETKT 999962775136471";
		/**
		 * below is the output information of airline ticket
		 */
		System.out.print("航班 "+flight);
		System.out.print("    到达站 "+destination);
		System.out.println("    舱位 "+shippingSpace);
		System.out.print("日期 "+date);
		System.out.print("    登机口 "+gate);
		System.out.println("  登机时间 "+boardingTime);
		System.out.print("座位 "+seat);
		System.out.print("      姓名 "+name);
		System.out.println("        序号 "+No);
		System.out.println("备注 "+remark);
		//end pfh 20200412

	}

}
