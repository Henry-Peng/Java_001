package com.peng.mapping;
/**
 * 静态代码块的执行顺序
 * @author pfh
 * @date 2020年5月22日
 */
public class StaticClassTest {
	static{
		System.out.println("执行静态初始化StaticClassTest");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AClass aClass = new AClass();//先执行父类的静态代码块
		aClass = new AClass();//静态代码块不会再执行
		System.out.println("+++++++++++");
		AClass aClass2 = new AClass();//哪怕对象名改变,静态代码块还是不执行,只在最开始执行一次
		//System.out.println(aClass.num);
	}

}

class AClass extends BClass{
	public static int num = 100;
	static{
		System.out.println("执行静态初始化AClass");
		num = 200;
	}
	public AClass() {
		System.out.println("创建AClass对象");
	}
}

class BClass{
	public static int num = 80;
	static{
		System.out.println("执行静态初始化BClass");
	}
}