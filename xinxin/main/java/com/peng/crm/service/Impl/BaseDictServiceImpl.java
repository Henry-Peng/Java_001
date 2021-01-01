package com.peng.crm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.peng.crm.mapper.BaseDictMapper;
import com.peng.crm.pojo.BaseDict;
import com.peng.crm.service.BaseDictService;

/**
 * 字典码服务层的实现类
 * @author pfh
 * @date 2020年8月11日
 */
@Service
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)//事务的声明式注解
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictMapper baseDictMapper;

	public List<BaseDict> getBaseDictByCode(String code) {
		return baseDictMapper.getBaseDictByCode(code);
	}

}
