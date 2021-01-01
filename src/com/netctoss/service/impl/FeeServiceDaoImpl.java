package com.netctoss.service.impl;

import java.util.List;

import com.netctoss.dao.CostDao;
import com.netctoss.dao.impl.CostDaoImpl;
import com.netctoss.entity.Cost;
import com.netctoss.service.FeeServiceDao;

/**
 * 资费管理接口实现层
 * @author pfh
 * @date 2020年7月21日
 */
public class FeeServiceDaoImpl implements FeeServiceDao{

	CostDao costDao = new CostDaoImpl();
	/**
	 * 通过资费id获取整条资费信息
	 * @param COST_ID
	 * @return
	 */
	public Cost findCost(int COST_ID) {
		return costDao.findCost(COST_ID);
	}

	/**
	 * 获取所有资费的条数
	 * @return
	 */
	public int countCost() {
		return costDao.countCost();
	}

	/**
	 * 获取所有的资费信息
	 * @return
	 */
	public List<Cost> findAllCost() {
		return costDao.findAllCost();
	}

	/**
	 * 获取分页的资费信息
	 * @return
	 */
	public List<Cost> showPageCost(int currentPage, int pageSize) {
		return costDao.showPageCost(currentPage, pageSize);
	}

	/**
	 * 分页
	 * 获取资费信息,按照月租,基费,时长排序order
	 * sort决定升序降序
	 * @return
	 */
	public List<Cost> showCostByOrder(String order, String sort, int currentPage, int pageSize) {
		return costDao.showCostByOrder(order, sort, currentPage, pageSize);
	}

	/**
	 * 添加cost资费
	 * @param cost
	 * @return
	 */
	public boolean addCost(Cost cost) {
		return costDao.addCost(cost);
	}


	/**
	 * 通过id删除cost资费
	 * @param cost
	 * @return
	 */
	public boolean deleteCost(int COST_ID) {
		return costDao.deleteCost(COST_ID);
	}

	/**
	 * 对cost进行修改
	 * @param cost
	 * @return
	 */
	public boolean updateCost(Cost cost) {
		return costDao.updateCost(cost);
	}

	/**
	 * 对资费启用属性进行设置
	 */
	public boolean updateCost_STATUS(int COST_ID) {
		return costDao.updateCost_STATUS(COST_ID);
	}

	/**
	 * 在cost表中查询是否已有该名称
	 */
	public boolean checkName(String NAME) {
		return costDao.checkName(NAME);
	}

	/**
	 * 检查修改后的数据名称是否与其他名称重复
	 * 即,在cost表中查询是否已有该名称(除了此id对应的数据之外)
	 */
	public boolean checkNameBesideThisId(String NAME, int COST_ID){
		return costDao.checkNameBesideThisId(NAME, COST_ID);
		
	}


}
