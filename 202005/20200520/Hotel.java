package com.peng.xml_work;

import org.dom4j.Element;

public class Hotel {
	private Element hotel;
	private Element address;
	private Element types; 
	private Element prices;
	private Element vipPrices;
	private Element coupons;
	
	public Element getHotel() {
		return hotel;
	}
	public void setHotel(Element hotel) {
		this.hotel = hotel;
	}
	public Element getAddress() {
		return address;
	}
	public void setAddress(Element address) {
		this.address = address;
	}
	public Element getTypes() {
		return types;
	}
	public void setTypes(Element types) {
		this.types = types;
	}
	public Element getPrices() {
		return prices;
	}
	public void setPrices(Element prices) {
		this.prices = prices;
	}
	public Element getVipPrices() {
		return vipPrices;
	}
	public void setVipPrices(Element vipPrices) {
		this.vipPrices = vipPrices;
	}
	public Element getCoupons() {
		return coupons;
	}
	public void setCoupons(Element coupons) {
		this.coupons = coupons;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Element hotel) {
		super();
		this.address = hotel.addElement("address");
		this.types = hotel.addElement("types");
		this.prices = hotel.addElement("prices");
		this.vipPrices = hotel.addElement("vipPrices");
		this.coupons = hotel.addElement("coupons");
	} 
	
	
	

}
