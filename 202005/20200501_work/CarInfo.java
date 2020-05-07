package com.peng.modle;
/**
 * 车子信息类
 * @author pfh
 * @date 2020年5月5日
 */
public class CarInfo {
	//成员变量:品牌,车型,价格,油耗,里程数,油箱容积,剩余油量
	private String brand;//品牌
	private String model;//车型
	private double price;//价格,元
	private double fuelConsumption;//油耗,单位(L/100km)
	private int mileage;//里程数
	private double tankCapacity;//油箱容积,L
	private double remainFuel;//剩余油量,L
	//set&get
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public double getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public double getRemainFuel() {
		return remainFuel;
	}
	public void setRemainFuel(double remainFuel) {
		this.remainFuel = remainFuel;
	}
	//构造方法
	public CarInfo(String brand, String model, double price, double fuelConsumption, int mileage,
			double tankCapacity) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.mileage = mileage;
		this.tankCapacity = tankCapacity;
	}
	public CarInfo() {
	}
	public CarInfo(String brand, String model, double price, double fuelConsumption, int mileage,
			double tankCapacity, double remainFuel) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.mileage = mileage;
		this.tankCapacity = tankCapacity;
		this.remainFuel = remainFuel;
	}
	@Override
	public String toString() {
		return "汽车品牌:" + brand + "\n型号:" + model + "\n价格:" + price + "元\n油耗:"
				+ fuelConsumption + "(L/100km)\n里程数:" + mileage + "km\n油箱容积:" + tankCapacity + "L\n剩余油量:"
				+ remainFuel + "L";
	}
	
	
	
}
