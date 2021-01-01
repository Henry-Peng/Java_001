package com.netctoss.entity;

import java.io.Serializable;

public class Role_info implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ROLE_ID;
	private String NAME;

	public int getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(int ROLE_ID) {
		this.ROLE_ID = ROLE_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public Role_info() {

	}
	public Role_info(int ROLE_ID, String NAME ) {
		this.ROLE_ID = ROLE_ID;
		this.NAME = NAME;
	}

}