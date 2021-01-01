package com.peng.crm.mapper;

import java.util.List;

import com.peng.crm.pojo.BaseDict;

/**
 * 字典数据表持久化接口
 * @author pfh
 * @date 2020年8月11日
 */
public interface BaseDictMapper { 
	
	/**
	 * 根据字典码查找客户
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
	
    int deleteByPrimaryKey(String dictId);

    int insert(BaseDict record);

    int insertSelective(BaseDict record);

    BaseDict selectByPrimaryKey(String dictId);

    int updateByPrimaryKeySelective(BaseDict record);

    int updateByPrimaryKey(BaseDict record);
}