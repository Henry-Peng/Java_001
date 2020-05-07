package com.peng.demo2;
/**
 * 直接赋值:{}
 * @author pfh
 * @date 2020年4月17日
 */
public class Demo008_2D {

	public static void main(String[] args) {
		// 创建与赋值全写在一起
		String[][] proCitys = {{"苏州","无锡","常州"},{"郑州","洛阳"}};
		//循环取值
		for(String[] pcs : proCitys){
			for(String pc : pcs){
				System.out.println(pc);
			}
		}
	}
		

}
