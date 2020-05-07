package com.peng.demo2;
/**
 * 创建一个数组,赋值,循环取值
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo002_arrayFor {

	public static void main(String[] args) {
		showCitys();
	}
	
	public static void showCitys() {
		String[] citys = {"北京","上海","广州","深圳","香港","台北"};
		System.out.println("城市数量:"+citys.length);
		//使用for循环取值,取所有的值
		System.out.println("for的第一种输出方式:");
		for(int i=0;i<citys.length;i++){
			System.out.println("城市名称:"+citys[i]);
		}
		
		System.out.println("********for增强版输出************");
		for(String c:citys){
			System.out.println("增强版for输出:"+c);
		}
	}

}
