package com.netctoss.entity;

import java.io.Serializable;

public class Service_detail implements Serializable{

	private static final long serialVersionUID = 1L;

	private int DETAIL_ID;
	private int SERVICE_ID;
	private String CLIENT_HOST;
	private String OS_USERNAME;
	private int PID;
	private String LOGIN_TIME;
	private String LOGOUT_TIME;
	private double DURATION;
	private double COST;

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
	public String getCLIENT_HOST() {
		return CLIENT_HOST;
	}
	public void setCLIENT_HOST(String CLIENT_HOST) {
		this.CLIENT_HOST = CLIENT_HOST;
	}
	public String getOS_USERNAME() {
		return OS_USERNAME;
	}
	public void setOS_USERNAME(String OS_USERNAME) {
		this.OS_USERNAME = OS_USERNAME;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int PID) {
		this.PID = PID;
	}
	public String getLOGIN_TIME() {
		return LOGIN_TIME;
	}
	public void setLOGIN_TIME(String LOGIN_TIME) {
		this.LOGIN_TIME = LOGIN_TIME;
	}
	public String getLOGOUT_TIME() {
		return LOGOUT_TIME;
	}
	public void setLOGOUT_TIME(String LOGOUT_TIME) {
		this.LOGOUT_TIME = LOGOUT_TIME;
	}
	public double getDURATION() {
		return DURATION;
	}
	public void setDURATION(double DURATION) {
		this.DURATION = DURATION;
	}
	public double getCOST() {
		return COST;
	}
	public void setCOST(double COST) {
		this.COST = COST;
	}

	public Service_detail() {

	}
	public Service_detail(int DETAIL_ID, int SERVICE_ID, String CLIENT_HOST, String OS_USERNAME, int PID, 
			String LOGIN_TIME, String LOGOUT_TIME, double DURATION, double COST ) {
		this.DETAIL_ID = DETAIL_ID;
		this.SERVICE_ID = SERVICE_ID;
		this.CLIENT_HOST = CLIENT_HOST;
		this.OS_USERNAME = OS_USERNAME;
		this.PID = PID;
		this.LOGIN_TIME = LOGIN_TIME;
		this.LOGOUT_TIME = LOGOUT_TIME;
		this.DURATION = DURATION;
		this.COST = COST;
	}
	@Override
	public String toString() {
		return "Service_detail [DETAIL_ID=" + DETAIL_ID + ", SERVICE_ID=" + SERVICE_ID + ", CLIENT_HOST=" + CLIENT_HOST
				+ ", OS_USERNAME=" + OS_USERNAME + ", PID=" + PID + ", LOGIN_TIME=" + LOGIN_TIME + ", LOGOUT_TIME="
				+ LOGOUT_TIME + ", DURATION=" + DURATION + ", COST=" + COST + "]";
	}

}