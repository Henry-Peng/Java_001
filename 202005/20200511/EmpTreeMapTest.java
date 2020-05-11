package com.peng.list;

import java.util.TreeMap;

import com.peng.model.Employee;
/**
 * 员工类(增加Comparable器,实现这个compareTo的方法)
 * @author pfh
 * @date 2020年5月11日
 */
public class EmpTreeMapTest {

	public static void main(String[] args) {
		int num = 7;
		Employee[] employees = new Employee[num];
		for (int i = 0; i < num; i++) {
			Employee employee = new Employee();
			employee.setNo(1000 + i);
			employee.setName("员工" + (char)(i+97));
			employee.setSalary(i*800+5000);
			employees[i] = employee;
		}
		
		//把对象放置在Map中
		TreeMap<Integer, Employee> emp = new TreeMap<>();
		for (int i = 0; i < employees.length; i++) {
			emp.put(i,employees[i]);
		}
		for (Integer k : emp.keySet()) {
			System.out.println(k + ":" + emp.get(k));
		}
		
		System.out.println("*********Compara*********");
		
		
		TreeMap<Employee,String> emps = new TreeMap<>();
		//put,for
		for (int i = 0; i < employees.length; i++) {
			emps.put(employees[i],"生活品质+" + i);
			//System.out.println(employees[i]);
		}
		
		for (Employee k : emps.keySet()) {
			System.out.println(k + ":" + emps.get(k));
		}
	}

}
