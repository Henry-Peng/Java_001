package com.netctoss.dao.impl;

public class Test {

	public static void main(String[] args) {
		CostDaoImpl cImpl = new CostDaoImpl();
		CostDaoImpl cImpl2 = null;
		cImpl = cImpl2;
		System.out.println(cImpl);;
		System.out.println(cImpl2);;

	}

}
