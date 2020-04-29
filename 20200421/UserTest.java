package com.peng.test;

import com.peng.modle.User;

/**
 * 测试类
 * @author pfh
 * @date 2020年4月21日
 */
public class UserTest {

	public static void main(String[] args) {
		User user = new User(0,"花花");
		//给对象赋值
		System.out.println(user.getName());//get获取
		user.setId(1);
		user.setName("小米");
		System.out.println("序号:"+user.getId()+",姓名:"+user.getName());
		
		user.coding();//ctrl+按住,可以查询源代码
		user.sleep("阿祥");
		System.out.println(user.toString());//重写后的输出
		//使用构造方法赋值
		user.coding("hio");
		
		
	}

}
