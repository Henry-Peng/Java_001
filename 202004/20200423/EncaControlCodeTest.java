package com.peng.control;

import com.peng.demo.Demo001;


/**
 * 控制符测试:从上往下,由小到大范围
 *  1).private私有
 *  2).default默认
 *  3).protected受保护
 *  4).public公共,权限范围最大
 * @author pfh
 * @date 2020年4月22日
 */
public class EncaControlCodeTest {
	String name;
	/*private String name;*///私有只能在本类中使用,别的类不可以
	
	

	public static void main(String[] args) {
		//类中的变量名称,就得定义一个对象
		EncaControlCodeTest ecct = new EncaControlCodeTest();
		ecct.name = "henry";
		
		Test son0 = new Test();
		son0.nummm();
	}

}
/* 1).private私有,只能在本类中使用
*  2).default默认,本包中使用
*  3).protected受保护,本包可以,子类也可以
*  4).public公共,权限范围最大
*  
*/
class Tom{//父类
	
	private String name;
	protected String address;
	void getEcctName(){
		Tom ecc = new Tom();
		ecc.name = "tony";
		ecc.address = "安徽";
		System.out.println(ecc.name);
	}
}
/**
 * 可以在不同包里的子类中实例化(new)Demo001类获得对象,但无法用该对象访问protected修饰的方法和变量
 * 可以在不同包里的子类中调用父类中,protected修饰的方法和属性,即继承
 */
 class Test extends Demo001{//Test作为Demo001的子类,可以继承父类中的方法属性变量(private修饰的不能继承)
	void nummm(){
		Demo001 demo001 = new Demo001();
		demo001.num = 20;//public修饰的变量可以通过对象访问
		/*demo001.tel = "1888888888";*///此处报错,不可以被对象调用
		tel = "1888888888888";
		num = 22;
		call = 3333;
		System.out.println(call);
		syo();//protected 修饰的变量和方法可以传递给不同包的子类
	}

}

class Son0 extends Tom{//子类
	void getEcctName(){
		Tom ecc = new Tom();
		ecc.address = "上海";
		//ecc.name = "tony";//private在本类可以使用,子类不可以
	}
}
