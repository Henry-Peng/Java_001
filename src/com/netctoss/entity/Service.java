package com.netctoss.entity;

import java.io.Serializable;

public class Service implements Serializable{

	private static final long serialVersionUID = 1L;

	private int SERIVCE_ID;
	private int ACCOUNT_ID;
	private int COST_ID;
	private String UNIX_HOST_ID;
	private String OS_USER_NAME;
	private String LOGIN_PASSWD;
	private String STATUS;
	private String CREATE_DATE;
	private String PAUSE_DATE;
	private String CLOSE_DATE;

	public int getSERIVCE_ID() {
		return SERIVCE_ID;
	}
	public void setSERIVCE_ID(int SERIVCE_ID) {
		this.SERIVCE_ID = SERIVCE_ID;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}
	public int getCOST_ID() {
		return COST_ID;
	}
	public void setCOST_ID(int COST_ID) {
		this.COST_ID = COST_ID;
	}
	public String getUNIX_HOST_ID() {
		return UNIX_HOST_ID;
	}
	public void setUNIX_HOST_ID(String UNIX_HOST_ID) {
		this.UNIX_HOST_ID = UNIX_HOST_ID;
	}
	public String getOS_USER_NAME() {
		return OS_USER_NAME;
	}
	public void setOS_USER_NAME(String OS_USER_NAME) {
		this.OS_USER_NAME = OS_USER_NAME;
	}
	public String getLOGIN_PASSWD() {
		return LOGIN_PASSWD;
	}
	public void setLOGIN_PASSWD(String LOGIN_PASSWD) {
		this.LOGIN_PASSWD = LOGIN_PASSWD;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String CREATE_DATE) {
		this.CREATE_DATE = CREATE_DATE;
	}
	public String getPAUSE_DATE() {
		return PAUSE_DATE;
	}
	public void setPAUSE_DATE(String PAUSE_DATE) {
		this.PAUSE_DATE = PAUSE_DATE;
	}
	public String getCLOSE_DATE() {
		return CLOSE_DATE;
	}
	public void setCLOSE_DATE(String CLOSE_DATE) {
		this.CLOSE_DATE = CLOSE_DATE;
	}

	public Service() {

	}
	public Service(int SERIVCE_ID, int ACCOUNT_ID, int COST_ID, String UNIX_HOST_ID, String OS_USER_NAME, 
			String LOGIN_PASSWD, String STATUS, String CREATE_DATE, String PAUSE_DATE, String CLOSE_DATE 
			) {
		this.SERIVCE_ID = SERIVCE_ID;
		this.ACCOUNT_ID = ACCOUNT_ID;
		this.COST_ID = COST_ID;
		this.UNIX_HOST_ID = UNIX_HOST_ID;
		this.OS_USER_NAME = OS_USER_NAME;
		this.LOGIN_PASSWD = LOGIN_PASSWD;
		this.STATUS = STATUS;
		this.CREATE_DATE = CREATE_DATE;
		this.PAUSE_DATE = PAUSE_DATE;
		this.CLOSE_DATE = CLOSE_DATE;
	}

}