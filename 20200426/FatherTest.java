package com.peng.test;

import com.peng.model.Daughter;
import com.peng.model.Father;
import com.peng.model.Person;
import com.peng.model.Son;

/**
 * 测试类:
 *    多态三个条件:继承,子类对父类方法的重写,父类的引用指向子类的对象
 *    
 * @author pfh
 * @date 2020年4月26日
 */
public class FatherTest {
	
	public static void main(String[] args) {
		//多态只是方法的多态
		//run1();
		Son son = new Son();
		son.setName("李世民");
		getSon(son);
		//getSon(new Son());//匿名
		System.out.println("++++++++++++++++");
		//getDaughter(new Daughter());//匿名方式调用方法,name = null;
		Daughter daughter = new Daughter();
		daughter.setName("李秀宁");
		getDaughter(daughter);
		//子类如果有很多,传递方法就得写多个
		System.out.println("***************");
		
		//希望多态方式调用,getSuperClass();
		//getSupperClass(new Father());//传入的是父类,只执行一次
		Father father = new Father();
		father.setName("李渊");
		getSupperClass(father);
		//father.sleep(null);//输出两行,name和this.name
		System.out.println("------------------");
		//多态的优点,重载方法只要父类就可以
		getSupperClass(son);//调用的是父类,传入的是子类,执行的也是子类
		getSupperClass(daughter);
		
		
		//getDaughter(father);报错,子类的引用无法指向父类的引用

	}
	
	public static void getSupperClass(Person person) {//多态方式
		person.eat();//子类可以重写方法
	}
	
	
	public static void getSon(Son son) {//传入的是一个对象类,强制要求传入的是Son类,非多态
		son.eat();
	}
	
	public static void getDaughter(Daughter daughter) {
		daughter.eat();
	}
	
	public static void run1() {
		Father father = new Father();
		father.eat();
		
		Son son = new Son();
		son.eat();
		
		Daughter daughter = new Daughter();
		daughter.eat();
		
	}

}
