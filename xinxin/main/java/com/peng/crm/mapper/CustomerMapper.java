package com.peng.crm.mapper;

import java.util.List;

import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;


public interface CustomerMapper {
	
	
	/**
	 * 分页查询客户信息列表,没有条件则查询全部
	 */
	List<Customer> findCustomerList(QueryVo vo);
	
	 /**
     * 根据查询的条件获取总记录数
     */
    Integer getCountByQueryVo(QueryVo vo);

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