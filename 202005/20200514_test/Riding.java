package com.peng.work;
/**
 * 乘车类
 * @author pfh
 * @date 2020年5月14日
 */
public class Riding {
	//成员变量
	private String busNumber;//公交车次
	private String startStation;//乘车站
	private String destination ;//下车站
	private double price;//乘车价格
	
	
	public Riding(String busNumber, String startStation, String destination) {
		super();
		this.busNumber = busNumber;
		this.startStation = startStation;
		this.destination = destination;
	}
	public Riding(String busNumber, String startStation, String destination, double price) {
		super();
		this.busNumber = busNumber;
		this.startStation = startStation;
		this.destination = destination;
		this.price = price;
	}
	public Riding() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "您当前乘坐公交车次为:" + busNumber + ", 乘车站:(" + startStation + "),下车站:(" + destination
				+ "), 需要花费:" + price + "元";
	}
	
}
