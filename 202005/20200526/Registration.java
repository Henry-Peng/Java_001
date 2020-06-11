package com.peng.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 挂号类:
 *  医院里外科陈医生一天8个小时（15分钟可以挂一个号），一天相当于32预约号 使用多线程方式实现，多人抢号(号则共享资源) 
 * @author pfh
 * @date 2020年5月25日
 */
public class Registration {

	public static void main(String[] args) {
		
	}
	
	public static void setHospitalInfo(){
		Doctor doctor = new Doctor("陈医生", "SSDD3399", 19, "主治医师", "外科诊断");
		Map<String, Doctor> doctors = new HashMap<String, Doctor>();
		doctors.put(doctor.getId(), doctor);
		Department department = new Department("外科室", "门诊三楼", "省级重点", 17788993300L, doctors);
		List<Department> departments = new ArrayList<>();
		departments.add(department);
		Hospital hospital = new Hospital("九龙医院", "润江桥22号", 88886666333l, "三甲", departments);		System.out.println(hospital);
	}
	
	public static void setWorkDay() {
		
		
		
	}
	
	public static void setDayTime() {
		
		
		
	}

}
