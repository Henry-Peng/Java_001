package com.peng.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 判定用户登录密码是否存在
 * @author pfh
 * @date 2020年5月14日
 */
public class DecidePassword {

	public static void main(String[] args){
		
		//列出已经登记的用户名和密码
		UserRegister user = new UserRegister("admin","123456");
		UserRegister user1 = new UserRegister("一号","111111");
		UserRegister user2 = new UserRegister("二号","222222");
		UserRegister user3 = new UserRegister("三号","333333");

		//按照注册的顺序将已经登记的用户存放在一个map集合中
		Map<Integer, UserRegister> users = new HashMap<Integer, UserRegister>();
		users.put(0, user);
		users.put(1, user1);
		users.put(2, user2);
		users.put(3, user3);
		
		//输入要判断的用户名和密码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String name = sc.next();
		
		//遍历map集合,寻找userName
		boolean existUser = false;
		for (Iterator<Integer> keys = users.keySet().iterator(); keys.hasNext();) {
			Integer key = keys.next();
			String register = users.get(key).getUserName();
			if (name.equals(register)) {//如果输入的用户名和数据库里的用户名一致
				existUser = true;
				System.out.println("用户存在,欢迎您");
				System.out.println("请输入密码:");
				String password = sc.next();
				if (password.equals(users.get(key).getPassWord())) {//如果输入的用户密码和数据库里的用户名密码一致
					System.out.println("登录成功!");
				} else {
					System.out.println("密码错误,登录失败");
				}
				break;
			}
		}
		if (existUser == false) {
			System.out.println("用户不存在,请重新登录");
		}

		sc.close();
		
	}

}
