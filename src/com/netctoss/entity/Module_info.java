package com.netctoss.entity;

import java.io.Serializable;

public class Module_info implements Serializable{

	private static final long serialVersionUID = 1L;

	private int MODULE_ID;
	private String NAME;

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

	public Module_info() {

	}
	public Module_info(int MODULE_ID, String NAME ) {
		this.MODULE_ID = MODULE_ID;
		this.NAME = NAME;
	}

}