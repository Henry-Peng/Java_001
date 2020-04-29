package com.peng.test;

import com.peng.model.Car;
import com.peng.utils.Color;
import com.peng.utils.HoleNum;

/**
 * 测试颜色的枚举类
 * @author pfh
 * @date 2020年4月29日
 */
public class ColorEnumTest {

	public static void main(String[] args) {
		runColor();
		int holeNum = HoleNum.FIFTY.toString() == "FIFTY" ? 50:20;
		System.out.println(holeNum);
		Car car = new Car(1, "红旗", Color.RED.toString());
		System.out.println(car.getColor() + "的" + car.getName());
		System.out.println(returnColorVal(car.getColor()) + "的" + car.getName());
	}

	public static void runColor(){
		Color c = Color.BLUE;//选择哪一个颜色要输出
		//switch
		switch(c){
		case RED:
			System.out.println("红色");
			break;
		case 
			BLUE:
				System.out.println("蓝色");
			break;
		case 
			BLACK:
				System.out.println("黑色");
			break;
		case 
			WHITE:
				System.out.println("白色");
			break;
		case 
			YELLOW:
				System.out.println("黄色");
			break;
		case 
			GREEN:
				System.out.println("绿色");
		default :
				System.out.println("颜色输入错误");
		}
		
	}
	
	public static String returnColorVal(String color){
		Color c = Color.valueOf(color);//选择哪一个颜色要输出
		String colorVal = null;
		//switch
		switch(c){
		case RED:
			colorVal = "红色";
			break;
		case BLUE:
			colorVal = "蓝色";
			break;
		case BLACK:
			colorVal = "黑色";
			break;
		case WHITE:
			colorVal = "白色";
			break;
		case YELLOW:
			colorVal = "黄色";
			break;
		case GREEN:
			colorVal = "绿色";
		default :
			System.out.println("颜色输入错误");
		}
		return colorVal;
	}
}
