package com.peng.basics;

import java.util.Scanner;
/**
 * 判定是否是会员:如果是,输出会员号;不是,则告诉客户办理会员卡
 * @author pfh
 * @date 2020年5月7日
 */
public class ScannerIfVip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("客户您要入住哪个酒店?");
		String[] hotelName = {"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		System.out.print("可供选择的酒店有:");
		for (int i = 0; i < hotelName.length; i++) {
			System.out.print((i+1) + "-" + hotelName[i] + ";");
		}
		System.out.println("\n请输入酒店对应数值:(1-2-3)");
		if (sc.hasNextLine()) {
			String inString = sc.nextLine();
			int id = inString.hashCode();
			if (id >= 49 && id <=51) {
				System.out.println("您入住的酒店为:" + hotelName[id-49]);
				runIfVip(sc);
			}else {
				System.out.println("输入数值错误,请输入酒店对应数值:(1或2或3)");
			}
		
		}
		sc.close();
	}
	
	public static void runIfVip(Scanner sc) {
		System.out.println("请问您是否是会员?(如果是请输入1,如果不是请输入2):");
		if (sc.hasNextLine()) {
			String vipIf = sc.nextLine();
			int vip = vipIf.hashCode();
			if (vip == 49 ) {// vip == 49 || vipIf.contains("是")
				System.out.println("您为会员,请输入会员卡号:");
				String no = sc.nextLine();
				System.out.println("您的会员卡号为:" + no);
			}else if (vip == 50 ) {
				System.out.println("您不是会员,可以办理一张会员卡");
			}else {
				System.out.println("输入信息有错误(如果是请输入1,如果不是请输入2)");
			}
			
		}
	}

}
