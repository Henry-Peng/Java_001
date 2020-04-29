package com.peng.model;

public class Car {
	private String color ;
	private int num;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Car(String color, int num) {
		super();
		this.color = color;
		this.num = num;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println(color+"车子"+num+"个轮胎在路上跑...");
	}

}
