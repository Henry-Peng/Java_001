package com.peng.test;

import com.peng.model.User;
import com.peng.utils.Gender;

/**
 * 测试性别枚举类
 * @author pfh
 * @date 2020年4月29日
 */
public class GenderTest {

	public static void main(String[] args) {
		System.out.println(Gender.MAN);
		Gender[] genders = Gender.values();
		for (Gender c : Gender.values()) {
			System.out.println(c);
			System.out.println(c);
		}
		
		User user = new User(1, "梦珂");
		user.setSex(Gender.WOMAN.toString());
		
		String sexVal = (user.getSex().equals(Gender.MAN.toString()))?"男":"女";//不加toString也可以
		System.out.println(user.getId() + "," + user.getUserName() + "," + sexVal);
	}

}
