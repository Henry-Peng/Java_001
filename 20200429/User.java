package com.peng.model;
/**
 * 封装类:用户类
 * @author pfh
 * @date 2020年4月22日
 */
public class User {
	
	//成员变量(全部设置成私有的private)
	private int id;//编号,标识号
	private String userName;
	private String sex;
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}



	private int age;
	private String idCard;//身份证号
	private String tel;
	private int qqName;//qq号
	private String email;//邮箱
	private boolean marriage;//是否结婚,true为已婚
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setAge(int age) {
		//范围0-120
		if (age>=0 && age<=120){
			this.age = age;
		}else{
			System.out.println(age+"此年龄的输入不合法...");
		}
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getQqName() {
		return qqName;
	}

	public void setQqName(int qqName) {
		this.qqName = qqName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		//@qq.com
		if (email.length()>7) {
			if (email.contains("@") && email.contains(".com")) {
				this.email = email;
			}else {
				System.out.println("此邮箱地址不合法...");
			}
			
		}else{
			System.out.println("此邮箱地址长度不够");
		}
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	//构造方法(无参构造方法,带参数构造方法),给别人引用,要设置成公共的
	public User(){
		
	}
	public User(int id, String userName){
		this.id = id;
		this.userName = userName;
	}
	
	public User(int id, String userName, int age, String idCard, String tel, int qqName, String email,
			boolean marriage) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.idCard = idCard;
		this.tel = tel;
		this.qqName = qqName;
		this.email = email;
		this.marriage = marriage;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
	

}
