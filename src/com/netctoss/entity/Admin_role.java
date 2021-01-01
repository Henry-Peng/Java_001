package com.netctoss.entity;

import java.io.Serializable;

public class Admin_role implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ADMIN_ID;
	private int ROLE_ID;

	public int getADMIN_ID() {
		return ADMIN_ID;
	}
	public void setADMIN_ID(int ADMIN_ID) {
		this.ADMIN_ID = ADMIN_ID;
	}
	public int getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(int ROLE_ID) {
		this.ROLE_ID = ROLE_ID;
	}

	public Admin_role() {

	}
	public Admin_role(int ADMIN_ID, int ROLE_ID ) {
		this.ADMIN_ID = ADMIN_ID;
		this.ROLE_ID = ROLE_ID;
	}

}