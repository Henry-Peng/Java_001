package com.peng.work;

import com.peng.modle.HighSpeedTrainTicket;
/**
 * 输出对应价格
 * @author pfh
 * @date 2020年5月5日
 */
public class TicketPrice {

	static String[] station = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
	static double[][] ticketPrice  = {{0,44.5,64.5,99.5,129.5,159.5,219.5},{0,29.5,39.5,64.5,79.5,99.5,139.5}};//对应站点的火车票价格,double[0][]表示一等座价格,double[1][]表示二等座价格
	
	public static void main(String[] args) {
		HighSpeedTrainTicket highSpeedTrainTicket = new HighSpeedTrainTicket("G7029","镇江","苏州","一等座");//G7029次列车,由镇江站出发至苏州站(一等座)
		
		if (highSpeedTrainTicket.getSeat().equals("一等座")) {
			showPriceOne(highSpeedTrainTicket);//一等座价格方法
		}else if(highSpeedTrainTicket.getSeat().equals("二等座")){
			showPriceTwo(highSpeedTrainTicket);//二等座价格方法
		}else {
			System.out.println("仅有\"一等座\"和\"二等座\"可供选择");
		}
		System.out.println(highSpeedTrainTicket.toString());//输出信息:G7029次列车,由镇江站出发至苏州站(一等座)价格:115.0元
	}
	
	public static void showPriceOne(HighSpeedTrainTicket highSpeedTrainTicket){//一等座输出价格
		double startPrice = 0;//初始站价格
		double destPrice = 0;//终点站价格
		for(int i = 0; i < station.length;i++){
			if (highSpeedTrainTicket.getStartStation() == station[i]) {
				startPrice = ticketPrice[0][i];
			}
			if (highSpeedTrainTicket.getDestination() == station[i]) {
				destPrice = ticketPrice[0][i];
			}
		}
		if (destPrice <= startPrice) {//终点站价格必须要大于初始站价格
			System.out.println("站点的信息输入错误");
		}
		highSpeedTrainTicket.setPrice(destPrice - startPrice);//车票价格等于终点站价格减去初始站价格,数值传回该对象
	}
	
	public static void showPriceTwo(HighSpeedTrainTicket highSpeedTrainTicket){//二等座输出价格
		double startPrice = 0;//初始站价格
		double destPrice = 0;//终点站价格
		for(int i = 0; i < station.length;i++){
			if (highSpeedTrainTicket.getStartStation() == station[i]) {
				startPrice = ticketPrice[1][i];
			}
			if (highSpeedTrainTicket.getDestination() == station[i]) {
				destPrice = ticketPrice[1][i];
			}
		}
		if (destPrice <= startPrice) {//终点站价格必须要大于初始站价格
			System.out.println("站点的信息输入错误");
		}
		highSpeedTrainTicket.setPrice(destPrice - startPrice);//车票价格等于终点站价格减去初始站价格,数值传回该对象
	}
	
}
