package com.netctoss.entity;

import java.io.Serializable;

public class Admin_info implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ADMIN_ID;
	private String ADMIN_CODE;
	private String PASSWORD;
	private String NAME;
	private String TELEPHONE;
	private String EMAIL;
	private String ENROLLDATE;

	public int getADMIN_ID() {
		return ADMIN_ID;
	}
	public void setADMIN_ID(int ADMIN_ID) {
		this.ADMIN_ID = ADMIN_ID;
	}
	public String getADMIN_CODE() {
		return ADMIN_CODE;
	}
	public void setADMIN_CODE(String ADMIN_CODE) {
		this.ADMIN_CODE = ADMIN_CODE;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public String getTELEPHONE() {
		return TELEPHONE;
	}
	public void setTELEPHONE(String TELEPHONE) {
		this.TELEPHONE = TELEPHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}
	public String getENROLLDATE() {
		return ENROLLDATE;
	}
	public void setENROLLDATE(String ENROLLDATE) {
		this.ENROLLDATE = ENROLLDATE;
	}

	public Admin_info() {

	}
	public Admin_info(int ADMIN_ID, String ADMIN_CODE, String PASSWORD, String NAME, String TELEPHONE, 
			String EMAIL, String ENROLLDATE ) {
		this.ADMIN_ID = ADMIN_ID;
		this.ADMIN_CODE = ADMIN_CODE;
		this.PASSWORD = PASSWORD;
		this.NAME = NAME;
		this.TELEPHONE = TELEPHONE;
		this.EMAIL = EMAIL;
		this.ENROLLDATE = ENROLLDATE;
	}

}