package com.peng.other;

public interface UserDao {

	public void run1();//实际编译为:public abstract void run1();
	void run2();//实际编译为:public abstract void run2();默认添加public abstract
	default void run3() {//如果设置为default,必须要设置方法体
	}//编译时为:public void run3(){}

	 

	  
}
