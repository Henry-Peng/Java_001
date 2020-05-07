package com.peng.demo;
/**
 * hospital information define and output
 * @author pfh
 * @date 2020年4月12日
 */
public class HospitalInfo {

	public static void main(String[] args) {
		// 20200412 pfh add hospital information
		String hosName = "镇江市九龙医院";
		String level = "三级甲等";
		String address = "京口区东城街道303号";
		int appointCall = 183660999;
		int complaintCall = 173660111;
		int supervisoryTel = 163660222;
		String e_mail = "238197@163.com";
		String website = "http://www.zjjl.com";
		double registFee = 12.0;
		/**
		 * below is output information of hospital
		 */
		System.out.println("名称："+hosName);
		System.out.println("地址："+address);
		System.out.println("等级："+level);
		System.out.println("预约电话："+appointCall);
		System.out.println("投诉电话："+complaintCall);
		System.out.println("监督电话："+supervisoryTel);
		System.out.println("电子邮件："+e_mail);
		System.out.println("网址："+website);
		System.out.println("挂号费"+registFee+'元');
		//end pfh 20200412

	}

}
