package com.peng.list;

import java.util.HashMap;
import com.peng.model.Employee;

/**
 * 类放入Map集合中
 * 生成一系列变量名
 * @author pfh
 * @date 2020年5月9日
 */
public class EmployeeHashMapTest {

	public static void main(String[] args) {
		//新建对象
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
		HashMap<Integer, Employee> emps = new HashMap<>();
		//put,for
		for (int i = 0; i < employees.length; i++) {
			emps.put(9000 + i, employees[i]);
		}
		
		//get获取
		//System.out.println(emps);
		for(int i = 0 ; i < emps.size() ; i ++){
			System.out.println("序号:" + emps.get(9000 + i).getNo() + "," + emps.get(9000 + i).getName());
		}
		
		System.out.println("******循环读取数据,通过key方式*********");
		for (Integer k : emps.keySet()) {
			System.out.println(k + ":" + emps.get(k));
		}
		
	}

}
