package com.netctoss.entity;

import java.io.Serializable;

public class Bill_item implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ITEM_ID;
	private int BILL_ID;
	private int DETAIL_ID;
	private int SERVICE_ID;

	public int getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(int ITEM_ID) {
		this.ITEM_ID = ITEM_ID;
	}
	public int getBILL_ID() {
		return BILL_ID;
	}
	public void setBILL_ID(int BILL_ID) {
		this.BILL_ID = BILL_ID;
	}
	public int getDETAIL_ID() {
		return DETAIL_ID;
	}
	public void setDETAIL_ID(int DETAIL_ID) {
		this.DETAIL_ID = DETAIL_ID;
	}
	public int getSERVICE_ID() {
		return SERVICE_ID;
	}
	public void setSERVICE_ID(int SERVICE_ID) {
		this.SERVICE_ID = SERVICE_ID;
	}

	public Bill_item() {

	}
	public Bill_item(int ITEM_ID, int BILL_ID, int DETAIL_ID, int SERVICE_ID ) {
		this.ITEM_ID = ITEM_ID;
		this.BILL_ID = BILL_ID;
		this.DETAIL_ID = DETAIL_ID;
		this.SERVICE_ID = SERVICE_ID;
	}

}