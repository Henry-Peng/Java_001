package com.netctoss.entity;

import java.io.Serializable;

public class Service_update_bak implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ID;
	private int SERVICE_ID;
	private int COST_ID;

	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getSERVICE_ID() {
		return SERVICE_ID;
	}
	public void setSERVICE_ID(int SERVICE_ID) {
		this.SERVICE_ID = SERVICE_ID;
	}
	public int getCOST_ID() {
		return COST_ID;
	}
	public void setCOST_ID(int COST_ID) {
		this.COST_ID = COST_ID;
	}

	public Service_update_bak() {

	}
	public Service_update_bak(int ID, int SERVICE_ID, int COST_ID ) {
		this.ID = ID;
		this.SERVICE_ID = SERVICE_ID;
		this.COST_ID = COST_ID;
	}

}