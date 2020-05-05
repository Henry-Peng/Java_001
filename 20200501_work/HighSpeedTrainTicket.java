package com.peng.modle;
/**
 * 高铁票信息类
 * @author pfh
 * @date 2020年5月5日
 */
public class HighSpeedTrainTicket {
	//成员变量
	private String trainNumber;//车次
	private String startStation;//出发站
	private String destination ;//终点站
	private String seat;//座位:一等座/二等座
	private double price;//火车票价格
	
	//set&get
	public void setStartStation(String startStation){
		this.startStation = startStation;
	}
	
	public String getStartStation(){
		return startStation;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//构造方法
	public HighSpeedTrainTicket(){}
	
	public HighSpeedTrainTicket(String trainNumber,String startStation,String destination,String seat){
		this.seat = seat;
		this.trainNumber = trainNumber;
		this.destination = destination;
		this.startStation = startStation;
	}

	@Override
	public String toString() {
		return  trainNumber + "次列车,由" + startStation + "站出发至"
				+ destination + "站(" + seat + ")价格:" + price + "元";
	}

	
	
	
}
