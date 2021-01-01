package com.netctoss.entity;

import java.io.Serializable;

public class Function_info implements Serializable{

	private static final long serialVersionUID = 1L;

	private int FUNCTION_ID;
	private String FUNCTION_CODE;
	private int MODULE_ID;
	private String NAME;
	private String URL;

	public int getFUNCTION_ID() {
		return FUNCTION_ID;
	}
	public void setFUNCTION_ID(int FUNCTION_ID) {
		this.FUNCTION_ID = FUNCTION_ID;
	}
	public String getFUNCTION_CODE() {
		return FUNCTION_CODE;
	}
	public void setFUNCTION_CODE(String FUNCTION_CODE) {
		this.FUNCTION_CODE = FUNCTION_CODE;
	}
	public int getMODULE_ID() {
		return MODULE_ID;
	}
	public void setMODULE_ID(int MODULE_ID) {
		this.MODULE_ID = MODULE_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String URL) {
		this.URL = URL;
	}

	public Function_info() {

	}
	public Function_info(int FUNCTION_ID, String FUNCTION_CODE, int MODULE_ID, String NAME, String URL 
			) {
		this.FUNCTION_ID = FUNCTION_ID;
		this.FUNCTION_CODE = FUNCTION_CODE;
		this.MODULE_ID = MODULE_ID;
		this.NAME = NAME;
		this.URL = URL;
	}

}