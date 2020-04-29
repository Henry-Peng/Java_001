package com.peng.test;

import com.peng.model.Users;

/**
 * 比较两个不同对象下的身份证号
 * @author pfh
 * @date 2020年4月24日
 */
public class IdcardEqualsTest {

	public static void main(String[] args) {
		//创建对象
		Users users = new Users("122222222222222222222","漳州");
		Users users2 = new Users("122222222222222222222","漳州");
		
		Users users3 = new Users("1","122222222222222222222","漳州");
		Users users4 = new Users("2","122222222222222222222","漳州");
		//第一种判定方式
		if (users.getIdCard().equals(users2.getIdCard())) {
			System.out.println("一样");
		}else {
			System.out.println("不一样");
		}
		
		//第二种
		System.out.println((users == users2)?"一致":"不一致");
		
		//第三种重写equals,只比较idCard
		System.out.println(users.equals(users2)?"一致":"不一致");
	}

}
