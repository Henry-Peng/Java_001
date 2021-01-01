package com.netctoss.entity;

import java.io.Serializable;

public class Bill implements Serializable{

	private static final long serialVersionUID = 1L;

	private int BILL_ID;
	private int ACCOUNT_ID;
	private String BILL_MONTH;
	private double COST;
	private String PAYMENT_MODE;
	private String PAY_STATE;

	public int getBILL_ID() {
		return BILL_ID;
	}
	public void setBILL_ID(int BILL_ID) {
		this.BILL_ID = BILL_ID;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}
	public String getBILL_MONTH() {
		return BILL_MONTH;
	}
	public void setBILL_MONTH(String BILL_MONTH) {
		this.BILL_MONTH = BILL_MONTH;
	}
	public double getCOST() {
		return COST;
	}
	public void setCOST(double COST) {
		this.COST = COST;
	}
	public String getPAYMENT_MODE() {
		return PAYMENT_MODE;
	}
	public void setPAYMENT_MODE(String PAYMENT_MODE) {
		this.PAYMENT_MODE = PAYMENT_MODE;
	}
	public String getPAY_STATE() {
		return PAY_STATE;
	}
	public void setPAY_STATE(String PAY_STATE) {
		this.PAY_STATE = PAY_STATE;
	}

	public Bill() {

	}
	public Bill(int BILL_ID, int ACCOUNT_ID, String BILL_MONTH, double COST, String PAYMENT_MODE, 
			String PAY_STATE ) {
		this.BILL_ID = BILL_ID;
		this.ACCOUNT_ID = ACCOUNT_ID;
		this.BILL_MONTH = BILL_MONTH;
		this.COST = COST;
		this.PAYMENT_MODE = PAYMENT_MODE;
		this.PAY_STATE = PAY_STATE;
	}

}