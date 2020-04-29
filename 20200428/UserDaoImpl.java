package com.peng.dao;

import com.peng.model.User;

/**
 * 接口实现类:用户
 * @author pfh
 * @date 2020年4月27日
 */
public class UserDaoImpl implements UserDao{//,ShopDao实现多接口
	//1.实现某一个接口类,用关键字implements实现父类

	//2.父类有多少个抽象方法,子类必须实现多少个抽象方法

	public boolean addUser(User user) { //true为成功,false为失败
		System.out.println("添加一个用户姓名,用户姓名叫:" + user.getUserName());
		//return (user.getUserName()== null)?false:true;
		boolean flag = false;
		if (user.getId() != 0) {//id为0则失败
			flag = true;
		}
		return flag;
	}

	@Override
	public void saveUser(User user) {
		
	}

	@Override
	public void insertUser(User user) {
		
	}

	/*@Override
	public void getUser(User user) {
		System.out.println("进入此getUser方法");
		System.out.println("查询到一个用户,姓名:"+user.getUserName());
	}*/
	@Override
	public User getUser(User user) {
		System.out.println("进入此getUser方法");
		User user2 = new User();
		user2.setId(user.getId());
		user2.setUserName(user.getUserName());
		user2.setAge(22);
		return user2;
	}

	@Override
	public int updateUser(User user) {
		System.out.println("进入此updateUser方法");
		//System.out.println("对用户进行修改...");
		int updateCount = 0;
		User resultUser = findUserAll();
		if (user.getId() == resultUser.getId()) {
			updateCount = 1;
		}
		return updateCount;
	}

	@Override
	public int deleteUser(int deleteId) {
		System.out.println("进入此deleteUser方法");
		int delCount = 0;
		//判定传递参数的id在仓库地址是否有此人
		User user = findUserAll();
		if (deleteId == user.getId()) {
			delCount = 1;
		}
		return delCount;
		//System.out.println("删除一个编号:"+deleteId+"的用户");
	}
	
	//存储数据
	public static User findUserAll(){
		return new User(1,"pfh");
	}

	/*@Override
	public void getShop() {
		// TODO Auto-generated method stub
		
	}*/

	
	
}
