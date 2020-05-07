package com.peng.modle;

import java.sql.Date;

import javax.xml.crypto.Data;

/**
 * 商品列表
 * @author pfh
 * @date 2020年4月21日
 */
public class Shop {
	
	//1.成员变量
	String productId;//商品编号
	String goodsName ;
	String productArea;//产地
	double price;//价格
	String dateIssued;//上架时间
	int quantity;//数量
	String productionDate;//生产日期
	int shelfLife;//保质期
	int safetyStock;//安全库存
	
	//2.set&get
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	
	public void setProductArea(String productArea){
		this.productArea = productArea;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	
	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDateIssued() {
		return dateIssued;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getProductionDate() {
		return productionDate;
	}
	
	public int getShelfLife() {
		return shelfLife;
	}
	
	public int getSafetyStock(){
		return safetyStock;
	}
	
	//3.构造方法
	public Shop(){
		
	}
	public Shop(String productId,String goodsName,String productArea,double price,String dateIssued,
			int quantity,String productionDate,int shelfLife,int safetyStock){
		this.goodsName = goodsName;
		this.price = price;
		this.shelfLife = shelfLife;
		this.dateIssued = dateIssued;
		this.productArea = productArea;
		this.productId = productId;
		this.quantity = quantity;
		this.productionDate = productionDate;
		this.safetyStock = safetyStock;
	}

	@Override
	public String toString() {
		return "Shop [productId=" + productId + ", goodsName=" + goodsName + ", productArea=" + productArea + ", price="
				+ price + ", dateIssued=" + dateIssued + ", quantity=" + quantity + ", productionDate=" + productionDate
				+ ", shelfLife=" + shelfLife + ", safetyStock=" + safetyStock + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
