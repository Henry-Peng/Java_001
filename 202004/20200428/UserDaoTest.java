package com.peng.test;

import com.peng.dao.UserDao;
import com.peng.dao.UserDaoImpl;
import com.peng.model.User;

/**
 * 接口类的测试
 * @author pfh
 * @date 2020年4月27日
 */
public class UserDaoTest {

	public static void main(String[] args) {
		User user = new User(1,"pfh");//传递一个对象进去
		/*
		 * 本类接收也可父类接收(多态)
		 */
		/*//子类接收
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		boolean flag = userDaoImpl.addUser(user);
		System.out.println(flag == true ? "添加成功":"添加失败");
		User returnUser = userDaoImpl.getUser(user);
		System.out.println("返回的"+returnUser);
		int deleteId = user.getId();
		userDaoImpl.deleteUser(deleteId);
		System.out.println("*******************************");*/
		//父类接收
		UserDao userDao = new UserDaoImpl();
		boolean flag = userDao.addUser(user);
		System.out.println(flag?"添加成功":"添加失败");
		System.out.println("*****************");
		User returnUser = userDao.getUser(user);
		System.out.println("返回的"+returnUser);
		int resultDel = userDao.deleteUser(user.getId());
		System.out.println(resultDel == 1? "删除成功":"删除失败");
		System.out.println("=================");
		int resultUpdate = userDao.updateUser(user);
		System.out.println(resultUpdate == 1? "修改成功":"修改失败");
		
	}

}
