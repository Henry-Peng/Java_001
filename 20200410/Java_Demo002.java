package com.peng.demo;

/**
 * 练习使用int、Char、String等
 * @author pfh
 * @date 2020年4月11日
 */
public class Java_Demo002 {
/**
 * 20200410 pfh add his some information
 */
	public static void main(String[] args) {
		/*public static void main(String[] args) {
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("Hello,");
			System.out.println("There is my some information:");//说明内容
			System.out.println("Henry.Peng");//输出姓名；字符串String
			System.out.println("男");//性别；Char类型
			System.out.println("100");//年龄；int类型，整数
			System.out.println("577677");//校园短号；int类型
			System.out.println("6000.5");//月薪；double类型，小数点
			System.out.println("苏州");//住址；字符串String
			System.out.println("唱、跳、rap");//爱好；字符串String
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
			//end pfh
*/
		String spaceCharacter = "***************************";
		String stateMent = "There is my some information:";
		String userName = "彭付辉";
		Character sex = '男';
		int age = 25;
		int phoneNumber = 577677;
		double salary = 6000.5;
		String address = "苏州";
		String hobbys = "唱、跳、rap";
		/**
		 * 下面为多行信息输出
		 */
		System.out.println(spaceCharacter);
		System.out.println("Hello,");
		System.out.println(stateMent);
		System.out.println("姓名"+userName);
		System.out.println("性别"+sex);
		System.out.println("年龄"+age);
		System.out.println("校园短号"+phoneNumber);
		System.out.println("薪资"+salary);
		System.out.println("住址"+address);
		System.out.println("爱好"+hobbys);
		System.out.println(spaceCharacter);
		//end pfh 20200411
	}

}
