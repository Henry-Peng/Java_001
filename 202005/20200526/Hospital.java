package com.peng.work;

import java.util.List;
import java.util.Map;

/**
 * 医院类:(预约挂号信息)
 * 		成员变量:科室类:
 * 			成员变量:医生类
 * @author pfh
 * @date 2020年5月25日
 */
public class Hospital {
	
	private String hospitalName;
	private String address;//医院位置
	private long emergencyTele;//急诊电话
	private String rank;//医院等级
	private List<Department> departments;//医院科室部门
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getEmergencyTele() {
		return emergencyTele;
	}
	public void setEmergencyTele(long emergencyTele) {
		this.emergencyTele = emergencyTele;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(String hospitalName, String address, long emergencyTele, String rank,
			List<Department> departments) {
		super();
		this.hospitalName = hospitalName;
		this.address = address;
		this.emergencyTele = emergencyTele;
		this.rank = rank;
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", address=" + address + ", emergencyTele=" + emergencyTele
				+ ", rank=" + rank + ", departments=" + departments + "]";
	}
	

}

class Department {
	private String departName;//科室名称
	private String address;//科室位置
	private String grade; //科室等级
	private long telephone;//电话号码
	private Map<String, Doctor> doctors;
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public Map<String, Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(Map<String, Doctor> doctors) {
		this.doctors = doctors;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departName, String address, String grade, long telephone, Map<String, Doctor> doctors) {
		super();
		this.departName = departName;
		this.address = address;
		this.grade = grade;
		this.telephone = telephone;
		this.doctors = doctors;
	}
	@Override
	public String toString() {
		return "Department [departName=" + departName + ", address=" + address + ", grade=" + grade + ", telephone="
				+ telephone + ", doctors=" + doctors + "]";
	}
	
}

class Doctor {
	private String doctorName ;//医生姓名
	private String id ;//医生编号
	private int workAge ;//从业年龄
	private String level;//职业水平,例如:主治医师
	private String beGoodAt;//擅长领域
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWorkAge() {
		return workAge;
	}
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getBeGoodAt() {
		return beGoodAt;
	}
	public void setBeGoodAt(String beGoodAt) {
		this.beGoodAt = beGoodAt;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, String id, int workAge, String level, String beGoodAt) {
		super();
		this.doctorName = doctorName;
		this.id = id;
		this.workAge = workAge;
		this.level = level;
		this.beGoodAt = beGoodAt;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", id=" + id + ", workAge=" + workAge + ", level=" + level
				+ ", beGoodAt=" + beGoodAt + "]";
	}
	
	
}
