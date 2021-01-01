package com.peng.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.peng.crm.mapper.BaseDictMapper;
import com.peng.crm.mapper.CustomerMapper;
import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.service.CustomerService;
import com.peng.crm.utils.Page;

/**
 * 客户服务的实现类
 * @author pfh
 * @date 2020年8月12日
 */
@Service
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)//事务的声明式注解
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired//没有装配时为null;不可调用成员变量
	private Page<Customer> page;

	/**
	 * 分页查询客户信息列表,没有条件则查询全部
	 */
	public Page<Customer> findCustomerList(QueryVo vo) {
		
		//设置每一页数据条数
		vo.setRows(page.getSize());
		
		//vo设置start,开始条数
		vo.setStart((vo.getPage()-1)*vo.getRows());
		
		//查询并设置总记录数
		page.setTotal(customerMapper.getCountByQueryVo(vo));
		
		//查询并传入查询到的数据
		page.setRows(customerMapper.findCustomerList(vo));
		
		//返回当前页码
		page.setPage(vo.getPage());
		
		/* int total;
			private int page;
			private int size;
			private List<D> rows;*/
		
		return page;
	}
	
	
	/**
	 * 根据id删除用户信息
	 * @param custId
	 * @return
	 */
	public int deleteByPrimaryKey(Integer custId) {
		// TODO Auto-generated method stub
		return customerMapper.deleteByPrimaryKey(custId);
	}

	 /**
     * 插入用户信息
     * @param record
     * @return
     */
	public int insertSelective(Customer record) {
		// TODO Auto-generated method stub
		return customerMapper.insertSelective(record);
	}

	 /**
     * 根据id查询用户信息
     * @param custId
     * @return
     */
	public Customer selectByPrimaryKey(Integer custId) {
		// TODO Auto-generated method stub
		return customerMapper.selectByPrimaryKey(custId);
	}

	 /**
     * 根据id更新用户信息
     * @param record
     * @return
     */
	public int updateByPrimaryKeySelective(Customer customer) {
		return customerMapper.updateByPrimaryKeySelective(customer);
	}

}
