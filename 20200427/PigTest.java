package com.peng.test;

import com.peng.abstractmodel.Animal;
import com.peng.abstractmodel.Pig;

/**
 * Pig类测试
 * @author pfh
 * @date 2020年4月27日
 */
public class PigTest {

	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.eat();//父类普通
		pig.sleep();//子类实现父类抽象方法
		pig.run("小猪");//子类实现父类抽象方法
		
		//多态
		System.out.println("**************");
		Animal animal = new Pig("河马");
		animal.eat();
		animal.sleep();
		animal.run("大猪");
		animal.drink();
				
	}

}
