package com.netctoss.dao.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;


import com.netctoss.dao.CostDao;
import com.netctoss.entity.Cost;
import com.netctoss.util.JDBCUtil;


/**
 * Cost表格,资费
 * 与数据库连接进行操作的接口实现层
 * @author pfh
 * @date 2020年7月21日
 */
public class CostDaoImpl implements CostDao{
	
	private QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
	
	/**
	 * 通过资费id获取整条资费信息
	 * @param COST_ID
	 * @return
	 */
	public Cost findCost(int COST_ID) {
		Cost cost = new Cost();
		try {
			cost = queryRunner.query("select * from cost where COST_ID = ?", new BeanHandler<Cost>(Cost.class), COST_ID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cost;
	}
	
	/**
	 * 获取所有资费的条数
	 * @return
	 */
	public int countCost() {
		long count = 0;
		try {
			count = (long) queryRunner.query("select COUNT(*) from cost", new MapHandler()).get("COUNT(*)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (int) count;
	}

	/**
	 * 获取所有的资费信息
	 * @return
	 */
	public List<Cost> findAllCost() {
		List<Cost> costs = null;
		try {
			costs = queryRunner.query("select * from cost", new BeanListHandler<Cost>(Cost.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return costs;
	}

	/**
	 * 获取分页的资费信息
	 * @return
	 */
	public List<Cost> showPageCost(int currentPage, int pageSize) {
		List<Cost> costs = null;
		int current = (currentPage-1)*pageSize;
		try {
			costs = queryRunner.query("select * from cost limit ?, ?", new BeanListHandler<Cost>(Cost.class), current, pageSize);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return costs;
	}

	/**
	 * 分页
	 * 获取资费信息,按照月租,基费,时长排序
	 * order可以为BASE_COST,UNIT_COST,BASE_DURATION
	 * sort决定升序降序
	 * @return
	 */
	public List<Cost> showCostByOrder(String order, String sort, int currentPage, int pageSize) {
		List<Cost> costs = null;
		int current = (currentPage-1)*pageSize;
		String sql = "select * from cost order by " + order + " " + sort +" limit ?, ?";
		try {
			//costs = queryRunner.query("select * from cost order by ? ? limit ?, ?", new BeanListHandler<Cost>(Cost.class), order, sort, current, pageSize);
			costs = queryRunner.query(sql, new BeanListHandler<Cost>(Cost.class), current, pageSize);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println(costs);
		return costs;
	}

	/**
	 * 添加cost资费
	 * @param cost
	 * @return
	 */
	public boolean addCost(Cost cost) {
		boolean result = false;
		try {
			//result = queryRunner.update("insert into cost('NAME','BASE_DURATION','BASE_COST','UNIT_COST','STATUS','DESR','CREATIME','STARTIME','COST_TYPE') "
					result = queryRunner.update("insert into cost(NAME,BASE_DURATION,BASE_COST,UNIT_COST,STATUS,DESR,CREATIME,STARTIME,COST_TYPE) "
					+ " values(?,?,?,?,?,?,?,?,?)",
					cost.getNAME(),
					cost.getBASE_DURATION(),
					cost.getBASE_COST(),
					cost.getUNIT_COST(),
					cost.getSTATUS(),
					cost.getDESR(),
					cost.getCREATIME(),
					cost.getSTARTIME(),
					cost.getCOST_TYPE()
					)>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 通过id删除cost资费
	 * @param cost
	 * @return
	 */
	public boolean deleteCost(int COST_ID) {
		boolean result = false;
		try {
			result = queryRunner.update("delete from cost where COST_ID = ?", COST_ID)>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 对cost进行修改
	 * @param cost
	 * @return
	 */
	public boolean updateCost(Cost cost) {
		boolean result = false;
		try {
			result = queryRunner.update("update cost set NAME = ? ,BASE_DURATION = ? ,BASE_COST = ? ,UNIT_COST = ? ,DESR = ? ,COST_TYPE = ?  where COST_ID = ?",
					cost.getNAME(),
					cost.getBASE_DURATION(),
					cost.getBASE_COST(),
					cost.getUNIT_COST(),
					cost.getDESR(),
					cost.getCOST_TYPE(),
					cost.getCOST_ID()
					)>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 对资费设置为启用
	 */
	public boolean updateCost_STATUS(int COST_ID) {
		boolean result = false;
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// [Date日期,转换成字符串]以当前的时间进行格式化(yyyy-MM-dd hh:mm:ss)
		String STARTIME = sd.format(date);
		try {
			
			result = queryRunner.update("update cost set STATUS = 1,STARTIME = ? where COST_ID = ?", STARTIME, COST_ID)>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 在cost表中查询是否已有该名称
	 */
	public boolean checkName(String NAME) {
		boolean result = false;
		try {
			Cost cost = queryRunner.query("select * from cost where NAME = ?", new BeanHandler<Cost>(Cost.class), NAME);
			result = (cost != null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * 在cost表中查询是否已有该名称(除了此id对应的数据之外)
	 */
	public boolean checkNameBesideThisId(String NAME, int COST_ID) {
		boolean result = false;
		try {
			Cost cost = queryRunner.query("select * from cost where NAME = ? and COST_ID != ?", new BeanHandler<Cost>(Cost.class), NAME, COST_ID);
			result = (cost != null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
