package com.peng.test;

import com.peng.abstractmodel.Animal;

public class AnimalTest {

	public static void main(String[] args) {
		//抽象类实例化要重写抽象方法
		Animal animal = new Animal("恐龙") {
			
			@Override
			public void run(String name) {
				System.out.println(name + "进入AnimalTest..run()");
			}
			
			public void sleep() {
				System.out.println(super.getName() + "sleep...");
				
			}

			@Override
			public void drink() {
				// TODO Auto-generated method stub
				
			}
			
		};
		animal.run("大象");
		animal.sleep();
		
	}

}
