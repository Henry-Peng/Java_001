package com.peng.abstractmodel;

import java.util.jar.Attributes.Name;

/**
 * 子类:抽象类
 * @author pfh
 * @date 2020年4月27日
 */
public class Pig extends Animal {
	
	public Pig(){
		
	}
	
	public Pig(String name){
		super(name);
	}
	
	
	public void run(String name) {
		System.out.println(name + "子类run...");
	}
	
	public void sleep() {
		System.out.println("子类sleep...");
		
	}

	@Override
	public void drink() {
		System.out.println(super.getName() + "子类想要喝口水");
	}

}
