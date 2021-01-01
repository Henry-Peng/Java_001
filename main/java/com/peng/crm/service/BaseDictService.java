package com.peng.crm.service;

import java.util.List;

import com.peng.crm.pojo.BaseDict;

/**
 * 字典数据表的业务逻辑接口
 * @author pfh
 * @date 2020年8月11日
 */
public interface BaseDictService {
	
	/**
	 * 根据字典码查找客户
	 */
	List<BaseDict> getBaseDictByCode(String code);
	
	

}
