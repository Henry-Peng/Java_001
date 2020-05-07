package com.peng.modle;

/**
 * 用户类
 * @author pfh
 * @date 2020年4月21日
 */
public class User {
	//基础变量
	int id;//id号或标识号
	String name;
	int age;
	String address;
	double salary;//薪资
	
	/**
	 * 引用set设置输入,get返回输出
	 * @param id
	 */
	public void setId(int id){
		this.id = id ;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	
	//构造器,无参
	public User() {
		
	}
	//构造器,有参
	public User(int id,String name) {
		//System.out.println(name);
		//System.out.println(this.name);未定义this.name之前数值为空
		this.id = id;
		this.name = name;
		System.out.println("序号:"+id+",姓名:"+name);
	}
	//构造器,多参
	public User(int id,String name,int age,String address,double salary) {
		this(id, name);
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		
	}
	
	public void coding() {
		System.out.println(this.name+"正在写代码...");//
		sleep(name);
	}
	public void coding(String name2) {
		System.out.println(name);
		System.out.println(name2);
		System.out.println(this.name);
		System.out.println(name+"正在编写代码...");
		
	}
	public void sleep(String name ){
		System.out.println(name+"正在睡觉...");//this不可用在static方法中
		//coding();静态不可调用普通
	}
	
	//toString 的重写,多加[]
	@Override
	public String toString() {
		return "User [[id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", salary=" + salary
				+ "]]";
	}
	

}
