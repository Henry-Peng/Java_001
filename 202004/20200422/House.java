package com.peng.control;
/**
 * 封装类:房子
 * @author pfh
 * @date 2020年4月22日
 */
public class House {
	
	//id,地址,类别, 价格, 面积
	private int id;
	private String address;
	private int type;//0:别墅;1:楼房
	private double price;
	private double area;//面积
	
	//set,get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	//构造方法
	public House() {
		
	}
	public House(int id, String address, int type, double price, double area) {
		this.id = id;
		this.address = address;
		this.type = type;
		this.price = price;
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "House 序号:" + id + ",地址:" + address + ",类型:" + type + ",价格" + price + ",面积" + area+ "]";
	}
	
	
	
}
