package com.peng.other;
/**
 * 修饰符四种:
 * 		public
 * 		private
 * 		defected
 * 		default
 * @author pfh
 * @date 2020年4月30日
 */
public class PublicClass {//类上的修饰符 only public, abstract & final are permitted
	private String sex = "男";
	private static void runPrivateMethod(){//private不能被别的类调用
		System.out.println("进入runPrivateMethod方法,输出性别:");
	}
	
	public void runPublicMethod(){
		System.out.println("进入runPublicMethod方法,输出性别:" + sex);
	}
	
	void runDefaultMethod(){
		System.out.println("进入runDefaultMethod方法,输出性别:" + sex);
	}
	
	protected void runProtectedMethod(){
		System.out.println("进入runProtectedMethod方法,输出性别:" + sex);
	}
	
	public static void main(String[] args) {
		runPrivateMethod();//private方法可以在本类中调用
	}

}
