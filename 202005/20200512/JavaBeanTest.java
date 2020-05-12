package com.peng.list;

import java.util.ArrayList;
import java.util.List;

import com.peng.model.User;
import com.peng.time.DateShow;

/**
 * ORM:对象关系映射
 * 一行数据一一对应上的User类(JavaBean)
 * 每个JavaBean存储在list中
 * @author pfh
 * @date 2020年5月12日
 */
public class JavaBeanTest {

	public static void main(String[] args) {
		// 创建多少个User对象
		User us1 = new User(1, "AB", "111111", "苏州", '男', new DateShow().formatDate("y-M-d"));
		User us2 = new User(2, "CD", "111111", "上海", '女', new DateShow().formatDate("y-M-d"));
		User us3 = new User(3, "EF", "111111", "杭州", '男', new DateShow().formatDate("y-M-d"));
		
		List<User> users = new ArrayList<User>();
		users.add(us2);
		users.add(us3);
		users.add(us1);
		
		System.out.println("******普通方法for*********");
		for (int i = 0; i < users.size(); i++) {
			User c = users.get(i);
			System.out.println(c);
		}
		
		System.out.println("******增强版方法for*********");
		for (User u : users) {
			System.out.println(u);
		}
	}

}
