package com.netctoss.entity;

import java.io.Serializable;

public class Cost implements Serializable{

	private static final long serialVersionUID = 1L;

	private int COST_ID;
	private String NAME;
	private int BASE_DURATION;
	private double BASE_COST;
	private double UNIT_COST;
	private String STATUS;
	private String DESR;
	private String CREATIME;
	private String STARTIME;
	private String COST_TYPE;

	public int getCOST_ID() {
		return COST_ID;
	}
	public void setCOST_ID(int COST_ID) {
		this.COST_ID = COST_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public int getBASE_DURATION() {
		return BASE_DURATION;
	}
	public void setBASE_DURATION(int BASE_DURATION) {
		this.BASE_DURATION = BASE_DURATION;
	}
	public double getBASE_COST() {
		return BASE_COST;
	}
	public void setBASE_COST(double BASE_COST) {
		this.BASE_COST = BASE_COST;
	}
	public double getUNIT_COST() {
		return UNIT_COST;
	}
	public void setUNIT_COST(double UNIT_COST) {
		this.UNIT_COST = UNIT_COST;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
	public String getDESR() {
		return DESR;
	}
	public void setDESR(String DESR) {
		this.DESR = DESR;
	}
	public String getCREATIME() {
		return CREATIME;
	}
	public void setCREATIME(String CREATIME) {
		this.CREATIME = CREATIME;
	}
	public String getSTARTIME() {
		return STARTIME;
	}
	public void setSTARTIME(String STARTIME) {
		this.STARTIME = STARTIME;
	}
	public String getCOST_TYPE() {
		return COST_TYPE;
	}
	public void setCOST_TYPE(String COST_TYPE) {
		this.COST_TYPE = COST_TYPE;
	}

	public Cost() {

	}
	public Cost(int COST_ID, String NAME, int BASE_DURATION, double BASE_COST, double UNIT_COST, 
			String STATUS, String DESR, String CREATIME, String STARTIME, String COST_TYPE 
			) {
		this.COST_ID = COST_ID;
		this.NAME = NAME;
		this.BASE_DURATION = BASE_DURATION;
		this.BASE_COST = BASE_COST;
		this.UNIT_COST = UNIT_COST;
		this.STATUS = STATUS;
		this.DESR = DESR;
		this.CREATIME = CREATIME;
		this.STARTIME = STARTIME;
		this.COST_TYPE = COST_TYPE;
	}
	@Override
	public String toString() {
		return "Cost [COST_ID=" + COST_ID + ", NAME=" + NAME + ", BASE_DURATION=" + BASE_DURATION + ", BASE_COST="
				+ BASE_COST + ", UNIT_COST=" + UNIT_COST + ", STATUS=" + STATUS + ", DESR=" + DESR + ", CREATIME="
				+ CREATIME + ", STARTIME=" + STARTIME + ", COST_TYPE=" + COST_TYPE + "]";
	}

}