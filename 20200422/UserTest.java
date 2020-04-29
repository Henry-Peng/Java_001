package com.peng.test;

import com.peng.control.House;
import com.peng.control.User;

/**
 * 用户类的测试
 * @author pfh
 * @date 2020年4月22日
 */
public class UserTest {

	public static void main(String[] args) {
		test();
		System.out.println("*********另一个对象开始**********");
		runUserHouse();

	}
	
	public static void test() {
		// 测试对象
		User user0 = new User();
		user0.setAge(222);
		System.out.println(user0.getAge());
		user0.setAge(22);
		System.out.println(user0.getAge());
		user0.setEmail("188@qq.com");
		System.out.println(user0.getEmail());
	}

	// 有参设置对象
	public static void runUserHouse() {
		User user = new User(null,1, "henry", 25, "37778888888930099", "1888888888", 1346793213, "1346793213@qq.com", false);
		System.out.println(user.getIdCard());
		System.out.println(user.getEmail());
		House house = new House(1, "二环里", 0, 10000000, 100);
		user.setHouse(house);// 给User类中的House类中赋值
		//想得到房子信息的值,先有User的对象.house对象.house类中的成员变量
		System.out.println(user);
		String marriage = user.isMarriage()?"已婚":"未婚";
		//String marriage2 = user.isMarriage()==false?"未婚":"已婚";
		String houseType = getHouseType(user.getHouse().getType());
		/*System.out.println(marriage);*/
		System.out.println("身份证号:"+user.getIdCard()+"的"+user.getUserName()+user.getAge()+"岁,在"+user.getHouse().getAddress()+
				"有间面积"+user.getHouse().getArea()+"平的"+houseType+"房子,"+marriage);
		
	}
	
	public static String getHouseType(int type) {
		// 0:别墅,1:楼房,2:商铺,3:公寓,4:复式
		String houseType = "";

		if (type == 0) {
			houseType = "别墅";
		} else if (type == 1) {
			houseType = "楼房";
		} else if (type == 2) {
			houseType = "商铺";
		} else if (type == 3) {
			houseType = "公寓";
		} else if (type == 4) {
			houseType = "复式";
		} else {
			System.out.println("房屋类型输入错误...");
		}
		return houseType;
	}
}





