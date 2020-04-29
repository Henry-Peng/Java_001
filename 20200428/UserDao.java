package com.peng.dao;

import com.peng.model.User;

/**
 * 接口类:用户类CDUR
 * 接口中只有方法,如果有定义了属性,默认为final类型
 * @author pfh
 * @date 2020年4月27日
 */
public interface UserDao {//把原来的Class名称修改interface
	//先添加,可以查询到数据,有时需要修改数据,删除一条数据
	
	/*抽象方法
	 * 添加前缀:save,add,insert
	 * 默认隐藏public和 abstract
	 */
	default boolean addUser(User user){//添加上defult可以使用普通方法,需要加上方法体
		return true;
	}//true为成功,false为失败
	abstract void saveUser(User user);
	public abstract void insertUser(User user);
	
	
	/*
	 * 查询前缀:get,find,query,select
	 * @return
	 */
	public User getUser(User user);//返回的类型有多种,int,string,对象,数组
	
	
	/*
	 * 修改前缀:edit,update,upd
	 * user 传递参数
	 * return 1:表示成功,0:表示失败
	 */
	public int updateUser(User user);
	
	/*
	 * 删除前缀:delete,del,remove
	 * user 传递参数
	 * return 1:表示成功,0:表示失败
	 */
	int deleteUser(int deleteId);
	
	
}
