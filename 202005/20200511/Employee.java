package com.peng.model;
/**
 * 员工类
 * @author pfh
 * @date 2020年5月9日
 */
public class Employee implements Comparable<Employee>{

	private Integer no;
	private String name;
	private double salary;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer no, String name, double salary) {
		super();
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	@Override
	public int compareTo(Employee o) {
		//从小到大
		if(this.salary>o.salary){
			return 1;//1为右,-1为左;右在前,先输出;
		}else if(this.salary<o.salary){//小于
			return -1;
		}else{//如果salary相等;比较no
			if(this.no > o.no){
				return 1;
			}else if(this.no<o.no){
				return -1;
			}else{
				return 0;
			}
			//return 0;
		}
		
	}
}


