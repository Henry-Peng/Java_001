package com.peng.work;

import com.peng.modle.CarInfo;

/**
 * 汽车剩余油量计算
 * @author pfh
 * @date 2020年5月5日
 */
public class CarFuelCount {

	public static void main(String[] args) {
		CarInfo carInfo = new CarInfo("雪佛兰", "435T RS 9AT悍锐版", 179900, 6.7, 100, 50);
		fuelCount(carInfo);//根据油耗和里程计算剩余油量的方法
		System.out.println(carInfo.toString());//显示车类信息的方法,已重写

	}
	/*
	 * 根据油耗和里程计算剩余油量的方法
	 */
	public static void fuelCount(CarInfo carInfo){
		double fuelConsum = carInfo.getMileage()/100 * carInfo.getFuelConsumption();//计算该段路程汽油消耗量
		if (fuelConsum > carInfo.getTankCapacity()) {//比较油箱容量和汽油消耗量
			System.out.println("油量不足,不足以驶过该段路程,请中途加油");
		}else{
			double remainFuel = carInfo.getTankCapacity() - fuelConsum;
			carInfo.setRemainFuel(remainFuel);
		}
	
	}

}
