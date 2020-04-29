package com.peng.demo;
/**
 * 没有加上封装:安全性问题样例(姓名,年龄,手机号,身份证号)
 * @author pfh
 * @date 2020年4月22日
 */
public class Demo001 {
	
	//成员变量,属性,字段名称
	int age;
	protected String tel;
	protected int call;
	public int num;
	

	public static void main(String[] args) {
		
		
		//创建对象
		Demo001 demo001 = new Demo001();
		demo001.age = 20;
		demo001.tel = "18888888888";

		showAge(demo001);
		showTel(demo001);

	}
	
	public static void showTel(Demo001 demo001) {
		if(demo001.tel.length()<11){
			System.out.println("手机号的长度小于11位,手机号码必须为11位");
		}else if (demo001.tel.length()>11) {
			System.out.println("手机号的长度大于1位,手机号码必须为11位");
		}else if (demo001.tel.length()==11) {
			System.out.println("电话号码是:"+demo001.tel);
		}
	}
	
	public static void showAge(Demo001 demo001) {
		if (demo001.age<0) {
			System.out.println("输入的年龄:"+demo001.age+"是不合法的");
		}else if (demo001.age>130) {
			System.out.println("输入的年龄:"+demo001.age+"是不合法的");
		}else  {
			System.out.println("年龄为:"+demo001.age+"岁");
		}
		
	}
	protected void syo() {
		System.out.println("******************");
	}

}
