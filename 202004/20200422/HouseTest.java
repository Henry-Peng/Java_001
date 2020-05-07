package com.peng.test;

import com.peng.control.House;

/**
 * 房子测试类
 * @author pfh
 * @date 2020年4月22日
 */
public class HouseTest {

	public static void main(String[] args) {
		House house = new House(1, "二环里", 2, 10000000, 100);
		System.out.println("编号:"+house.getId()+
				",地址:"+house.getAddress()+
				",类型:"+house.getType()+
				",面积:"+house.getArea()+"平方米"+
				",价格:"+house.getPrice());
		
	}

}
