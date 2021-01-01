package com.peng.crm.service;

import java.util.List;

import com.peng.crm.pojo.BaseDict;
import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.utils.Page;

/**
 * 客户表的业务逻辑接口
 * @author pfh
 * @date 2020年8月11日
 */
public interface CustomerService {
	
	
	/**
	 * 分页查询客户信息列表,没有条件则查询全部
	 */
	Page<Customer> findCustomerList(QueryVo vo);
	

	/**
	 * 根据id删除用户信息
	 * @param custId
	 * @return
	 */
    int deleteByPrimaryKey(Integer custId);

    /**
     * 插入用户信息
     * @param record
     * @return
     */
    int insertSelective(Customer record);

    /**
     * 根据id查询用户信息
     * @param custId
     * @return
     */
    Customer selectByPrimaryKey(Integer custId);

    /**
     * 根据id更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Customer record);
	
	

}
