package com.peng.test;

import com.peng.modelNew.Daughter;
import com.peng.modelNew.Son;
import com.peng.modelNew.Father;

/**
 * 测试继承关系的类
 * @author pfh
 * @date 2020年4月23日
 */
public class ExtendsClassTest {

	public static void main(String[] args) {
		Father father = new Father("胡莱莱",33);
		father.coding();
		father.sleeping();
		System.out.println("************");
		//Son儿子类
		Son son = new Son("ii",33);//子类只能调用父类public修饰的方法
		son.setAge(15);
		son.setName("蹦.沙卡");
		son.coding();//子类重写代码
		son.eating();//子类自身代码
		son.sleeping();//子类调用父类方法
		System.out.println("===========");
		//Daughter女儿类
		Daughter daughter = new Daughter();
		daughter.setName("蹦.拉卡");
		daughter.coding();//调用父类方法
		daughter.setAddress("家里");//子类自身属性
		daughter.playing();//子类自身代码
		
	}

}
