package com.netctoss.entity;
/**
 * 资费排序属性的封装类
 * @author pfh
 * @date 2020年7月21日
 */
public class CostOrder {

	private boolean BASE_COST_order;//月租排序,true为升序,false为降序
	private boolean UNIT_COST_order;//基费排序
	private boolean BASE_DURATION_order;//时长排序
	
	public boolean isBASE_COST_order() {
		return BASE_COST_order;
	}
	public void setBASE_COST_order(boolean bASE_COST_order) {
		BASE_COST_order = bASE_COST_order;
	}
	public boolean isUNIT_COST_order() {
		return UNIT_COST_order;
	}
	public void setUNIT_COST_order(boolean uNIT_COST_order) {
		UNIT_COST_order = uNIT_COST_order;
	}
	public boolean isBASE_DURATION_order() {
		return BASE_DURATION_order;
	}
	public void setBASE_DURATION_order(boolean bASE_DURATION_order) {
		BASE_DURATION_order = bASE_DURATION_order;
	}
	public CostOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CostOrder(boolean bASE_COST_order, boolean uNIT_COST_order, boolean bASE_DURATION_order) {
		super();
		BASE_COST_order = bASE_COST_order;
		UNIT_COST_order = uNIT_COST_order;
		BASE_DURATION_order = bASE_DURATION_order;
	}
	@Override
	public String toString() {
		return "CostOrder [BASE_COST_order=" + BASE_COST_order + ", UNIT_COST_order=" + UNIT_COST_order
				+ ", BASE_DURATION_order=" + BASE_DURATION_order + "]";
	}
	
	
}
