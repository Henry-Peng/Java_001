package com.netctoss.dao;

import java.util.List;

import com.netctoss.entity.Cost;
/**
 * Cost表格,资费
 * 与数据库连接进行操作的接口
 * @author pfh
 * @date 2020年7月20日
 */
public interface CostDao {
	
	/**
	 * 通过资费id获取整条资费信息
	 * @param COST_ID
	 * @return
	 */
	public Cost findCost(int COST_ID);
	
	/**
	 * 获取所有资费的条数
	 * @return
	 */
	public int countCost();	
	
	/**
	 * 获取所有的资费信息
	 * @return
	 */
	public List<Cost> findAllCost();
	
	/**
	 * 获取分页的资费信息
	 * @return
	 */
	public List<Cost> showPageCost(int currentPage, int pageSize);
	
	/**
	 * 分页
	 * 获取资费信息,按照月租,基费,时长排序order
	 * sort决定升序降序
	 * @return
	 */
	public List<Cost> showCostByOrder(String order, String sort, int currentPage, int pageSize);
	
	/**
	 * 添加cost资费
	 * @param cost
	 * @return
	 */
	public boolean addCost(Cost cost);
	
	/**
	 * 通过id删除cost资费
	 * @param cost
	 * @return
	 */
	public boolean deleteCost(int COST_ID);
	
	/**
	 * 对cost进行修改
	 * @param cost
	 * @return
	 */
	public boolean updateCost(Cost cost);
	
	/**
	 * 对资费设置为启用
	 */
	public boolean updateCost_STATUS(int COST_ID);
	
	/**
	 * 在cost表中查询是否已有该名称
	 */
	public boolean checkName(String NAME);
	
	/**
	 * 在cost表中查询是否已有该名称(除了此id对应的数据之外)
	 */
	public boolean checkNameBesideThisId(String NAME, int COST_ID);
}
