package com.peng.unInner;
/**
 * 测试静态内部类
 * @author pfh
 * @date 2020年4月29日
 */
public class StaticPerson {

	public static void main(String[] args) {
		//调用静态内部类
		Girl.StaticInner staticInner = new Girl.StaticInner();//静态类不需要new
		staticInner.runStaticInner();

	}

	
}
//外部类
class Girl{
	//创建静态内部类
	static class StaticInner{//依赖Girl
		public void runStaticInner(){
			System.out.println("进入runStaticInner方法...");
		}
	}
	
}