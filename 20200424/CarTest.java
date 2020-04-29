package com.peng.test;

import com.peng.model.Car;

/**
 * 车子测试类:
 * 匿名对象
 * @author pfh
 * @date 2020年4月24日
 */
public class CarTest {

	public static void main(String[] args) {
		// 有名字的对象
		Car car = new Car();
		car.setColor("红色");
		car.setNum(5);
		car.run();
		System.out.println("*****************");
		car.setColor("白色");
		car.run();
		
		//匿名对象
		new Car().setColor("蓝色");//结束
		System.out.println(new Car().getColor());//又是一个对象
		new Car().run();//又在地址内存中生成一个对象
		
	}

}
