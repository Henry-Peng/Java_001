package com.netctoss.entity;

import java.io.Serializable;

public class Role_module implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ROLE_ID;
	private int MODULE_ID;

	public int getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(int ROLE_ID) {
		this.ROLE_ID = ROLE_ID;
	}
	public int getMODULE_ID() {
		return MODULE_ID;
	}
	public void setMODULE_ID(int MODULE_ID) {
		this.MODULE_ID = MODULE_ID;
	}

	public Role_module() {

	}
	public Role_module(int ROLE_ID, int MODULE_ID ) {
		this.ROLE_ID = ROLE_ID;
		this.MODULE_ID = MODULE_ID;
	}

}