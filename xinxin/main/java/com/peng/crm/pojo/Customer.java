package com.peng.crm.pojo;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long cust_id;
	private String cust_name;
	private Long cust_user_id;
	private Long cust_create_id;
	private String cust_source;
	private String cust_industry;
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private String cust_zipcode;
	private String cust_address;
	private Date cust_createtime;

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_user_id=" + cust_user_id
				+ ", cust_create_id=" + cust_create_id + ", cust_source=" + cust_source + ", cust_industry="
				+ cust_industry + ", cust_level=" + cust_level + ", cust_linkman=" + cust_linkman + ", cust_phone="
				+ cust_phone + ", cust_mobile=" + cust_mobile + ", cust_zipcode=" + cust_zipcode + ", cust_address="
				+ cust_address + ", cust_createtime=" + cust_createtime + "]";
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Long getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(Long cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public Long getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(Long cust_create_id) {
		this.cust_create_id = cust_create_id;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public String getCust_zipcode() {
		return cust_zipcode;
	}
	public void setCust_zipcode(String cust_zipcode) {
		this.cust_zipcode = cust_zipcode;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public Date getCust_createtime() {
		return cust_createtime;
	}
	public void setCust_createtime(Date cust_createtime) {
		this.cust_createtime = cust_createtime;
	}

	public Customer() {

	}
	public Customer(Long cust_id, String cust_name, Long cust_user_id, Long cust_create_id, String cust_source, 
			String cust_industry, String cust_level, String cust_linkman, String cust_phone, String cust_mobile, 
			String cust_zipcode, String cust_address, Date cust_createtime ) {
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_user_id = cust_user_id;
		this.cust_create_id = cust_create_id;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
		this.cust_linkman = cust_linkman;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_zipcode = cust_zipcode;
		this.cust_address = cust_address;
		this.cust_createtime = cust_createtime;
	}

}