package com.peng.model;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 用户的信息
 * @author pfh
 * @date 2020年4月24日
 */
public class Users {
	
	private String id;
	private String idCard;
	private String name;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Users() {
		}
	public Users(String id, String idCard, String name) {
		super();
		this.id = id;
		this.idCard = idCard;
		this.name = name;
	}
	public Users(String idCard, String name) {
		super();
		this.idCard = idCard;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		return true;
	}


	public static void main(String[] args) {
		
		
	}

}
