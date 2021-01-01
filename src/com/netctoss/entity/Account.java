package com.netctoss.entity;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ACCOUNT_ID;
	private int RECOMMENDRE_ID;
	private String LOGIN_NAME;
	private String LOGIN_PASSWD;
	private String STATUS;
	private String CREATE_DATE;
	private String PAUSE_DATE;
	private String CLOSE_DATE;
	private String REAL_NAME;
	private String ID_CARD_NO;
	private String BIRTH_DATE;
	private String GENDER;
	private String OCCUPATION;
	private String TELEPHONE;
	private String EMAIL;
	private String MAIL_ADDRESS;
	private String ZIP_CODE;
	private String QQ;
	private String LAST_LOGIN_TIME;
	private String LAST_LOGIN_IP;

	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}
	public int getRECOMMENDRE_ID() {
		return RECOMMENDRE_ID;
	}
	public void setRECOMMENDRE_ID(int RECOMMENDRE_ID) {
		this.RECOMMENDRE_ID = RECOMMENDRE_ID;
	}
	public String getLOGIN_NAME() {
		return LOGIN_NAME;
	}
	public void setLOGIN_NAME(String LOGIN_NAME) {
		this.LOGIN_NAME = LOGIN_NAME;
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
	public String getREAL_NAME() {
		return REAL_NAME;
	}
	public void setREAL_NAME(String REAL_NAME) {
		this.REAL_NAME = REAL_NAME;
	}
	public String getID_CARD_NO() {
		return ID_CARD_NO;
	}
	public void setID_CARD_NO(String ID_CARD_NO) {
		this.ID_CARD_NO = ID_CARD_NO;
	}
	public String getBIRTH_DATE() {
		return BIRTH_DATE;
	}
	public void setBIRTH_DATE(String BIRTH_DATE) {
		this.BIRTH_DATE = BIRTH_DATE;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}
	public String getOCCUPATION() {
		return OCCUPATION;
	}
	public void setOCCUPATION(String OCCUPATION) {
		this.OCCUPATION = OCCUPATION;
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
	public String getMAIL_ADDRESS() {
		return MAIL_ADDRESS;
	}
	public void setMAIL_ADDRESS(String MAIL_ADDRESS) {
		this.MAIL_ADDRESS = MAIL_ADDRESS;
	}
	public String getZIP_CODE() {
		return ZIP_CODE;
	}
	public void setZIP_CODE(String ZIP_CODE) {
		this.ZIP_CODE = ZIP_CODE;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String QQ) {
		this.QQ = QQ;
	}
	public String getLAST_LOGIN_TIME() {
		return LAST_LOGIN_TIME;
	}
	public void setLAST_LOGIN_TIME(String LAST_LOGIN_TIME) {
		this.LAST_LOGIN_TIME = LAST_LOGIN_TIME;
	}
	public String getLAST_LOGIN_IP() {
		return LAST_LOGIN_IP;
	}
	public void setLAST_LOGIN_IP(String LAST_LOGIN_IP) {
		this.LAST_LOGIN_IP = LAST_LOGIN_IP;
	}

	public Account() {

	}
	public Account(int ACCOUNT_ID, int RECOMMENDRE_ID, String LOGIN_NAME, String LOGIN_PASSWD, String STATUS, 
			String CREATE_DATE, String PAUSE_DATE, String CLOSE_DATE, String REAL_NAME, String ID_CARD_NO, 
			String BIRTH_DATE, String GENDER, String OCCUPATION, String TELEPHONE, String EMAIL, 
			String MAIL_ADDRESS, String ZIP_CODE, String QQ, String LAST_LOGIN_TIME, String LAST_LOGIN_IP 
			) {
		this.ACCOUNT_ID = ACCOUNT_ID;
		this.RECOMMENDRE_ID = RECOMMENDRE_ID;
		this.LOGIN_NAME = LOGIN_NAME;
		this.LOGIN_PASSWD = LOGIN_PASSWD;
		this.STATUS = STATUS;
		this.CREATE_DATE = CREATE_DATE;
		this.PAUSE_DATE = PAUSE_DATE;
		this.CLOSE_DATE = CLOSE_DATE;
		this.REAL_NAME = REAL_NAME;
		this.ID_CARD_NO = ID_CARD_NO;
		this.BIRTH_DATE = BIRTH_DATE;
		this.GENDER = GENDER;
		this.OCCUPATION = OCCUPATION;
		this.TELEPHONE = TELEPHONE;
		this.EMAIL = EMAIL;
		this.MAIL_ADDRESS = MAIL_ADDRESS;
		this.ZIP_CODE = ZIP_CODE;
		this.QQ = QQ;
		this.LAST_LOGIN_TIME = LAST_LOGIN_TIME;
		this.LAST_LOGIN_IP = LAST_LOGIN_IP;
	}

}