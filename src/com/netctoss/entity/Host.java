package com.netctoss.entity;

import java.io.Serializable;

public class Host implements Serializable{

	private static final long serialVersionUID = 1L;

	private String HOST_ID;
	private String NAME;
	private String LOCATION;

	public String getHOST_ID() {
		return HOST_ID;
	}
	public void setHOST_ID(String HOST_ID) {
		this.HOST_ID = HOST_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String LOCATION) {
		this.LOCATION = LOCATION;
	}

	public Host() {

	}
	public Host(String HOST_ID, String NAME, String LOCATION ) {
		this.HOST_ID = HOST_ID;
		this.NAME = NAME;
		this.LOCATION = LOCATION;
	}

}