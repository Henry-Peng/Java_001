package com.peng.unInner;

/**
 * 测试非静态内部类
 * @author pfh
 * @date 2020年4月29日
 */
public class Person {

	public static void main(String[] args) {
		Boy.InnerOne innerOne = new Boy().new InnerOne();//对象内部类
		//想调用内部类的方法runInnerOne,先得创建外部类new Boy.创建内部类new InnerOne()
		innerOne.runInnerOne();
		innerOne.address2 = "湖南";//内部类修饰符如果为private,外部调用将报错,只能在本类中
		System.out.println(innerOne.address2);
		System.out.println("**************");
		Boy.staticInner inner = new Boy.staticInner();//与普通内部类不同,静态内部类不在堆中,不可以new开辟空间
		
		
	}

}
class Boy{
	String address = "北京1";
	
	public  void  showBoy() {
		System.out.println(address);
		run3();
	}
	public static void run3(){
		System.out.println("不能加入静态方法");
	}
	//创建内部类InnerOne
	class InnerOne{
		protected String address2 = "上海2";
		public void runInnerOne() {
			System.out.println("外部类的变量名称:" + Boy.this.address);//address
			System.out.println("内部类的变量名称:" + InnerOne.this.address2);//Ctrl+Y:前进一步
			//非静态的内部类不能调用静态内部类,还有方法
		}
	}
	//静态内部类
	static class staticInner{//static修饰的只初始化一次
		
		public static void runStaticInner(){
			new Boy().new InnerOne().runInnerOne();
		}
	}
	
}
