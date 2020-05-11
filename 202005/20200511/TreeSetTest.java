package com.peng.list;

import java.util.TreeSet;

import com.peng.model.Employee;

/**
 * 员工比较器:使用TreeSet
 * 		TreeSet:底层简易版的new TreeMap<?,?>();
 * @author pfh
 * @date 2020年5月11日
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Employee> emps = new TreeSet<>();
		int num = 7;
		//Employee[] employees = new Employee[num];
		for (int i = 0; i < num; i++) {
			Employee employee = new Employee();
			employee.setNo(1000 + i);
			employee.setName("员工" + (char)(i+97));
			employee.setSalary(i*800+5000);
			//employees[i] = employee;
			emps.add(employee);
		}
		emps.add(new Employee(999,"员工0",6600));
		
		for (Employee employee : emps) {
			System.out.println(employee);
		}
		

	}

}
