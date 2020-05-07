package com.peng.model;
/**
 * 类:车
 * @author pfh
 * @date 2020年4月29日
 */
public class Car {
	private Integer id;
	private String name;
	private String color;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
