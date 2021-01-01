package com.peng.crm.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.crm.pojo.BaseDict;
import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.service.BaseDictService;
import com.peng.crm.service.CustomerService;
import com.peng.crm.utils.Page;


/**
 * 用户访问控制层
 * @author pfh
 * @date 2020年8月11日
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;

	@Autowired
	private CustomerService customerService;
	
	@Value("${customer.from}")
	private String customerFrom;
	
	@Value("${customer.industry}")
	private String customerIndustry;
	
	@Value("${customer.level}")
	private String customerLevel;
	
	/**
	 * 客户管理页面
	 * @return
	 */
	//客户管理页面
	@RequestMapping("list")
	public String list(Model model, QueryVo vo){
		//System.out.println(vo.getCustName()+"mm");
		
		//查询数据
		List<BaseDict> fromType = baseDictService.getBaseDictByCode(customerFrom); 
		
		//查询客户行业
		List<BaseDict> industryType = baseDictService.getBaseDictByCode(customerIndustry); 
		
		//查询客户级别
		List<BaseDict> levelType = baseDictService.getBaseDictByCode(customerLevel); 
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		Page<Customer> page = customerService.findCustomerList(vo);
		
		model.addAttribute("page", page);
		model.addAttribute("vo", vo);
		
		
		return "customer";
		
	}
	
	/**
	 * 跳到客户修改页面
	 */
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit( Integer id ){
		
		Customer customer = customerService.selectByPrimaryKey(id);
		
		return customer;
		
	}
	
	
	/**
	 * 进行客户修改操作
	 */
	@RequestMapping("update")
	@ResponseBody
	public String update(Customer customer){
		//System.out.println(customer);
		String msg = "1";
		if (customerService.updateByPrimaryKeySelective(customer)>0) {
			msg = "0";
		}
		return msg;
		
	}
	
	/**
	 * 客户删除页面
	 */
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer id){
		String msg = "1";
		if (customerService.deleteByPrimaryKey(id)>0) {
			msg = "0";
		}
		return msg;
		
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("aa")
	public String customerList(){
		
		return "customer";
		
	}
	@RequestMapping("bb")
	public String myTag(){
		
		return "myTag";
		
	}

}
