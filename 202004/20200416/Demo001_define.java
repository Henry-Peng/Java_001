package com.peng.demo2;
/**
 * 创建:定义不同类型的数组
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo001_define {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*int[] nums;
		nums = new int[8];*/
		int[] nums = new int[8];//可以存放的位置:0,1,2,3,4,5,6,7;
		double[] dous = new double[22];
		String[] foods = new String[100];
		//....
		String[] names={};
		
		String[] pros = new String[3];
		//定义一个省份,把值赋进去
		pros[2] = "湖北省";
		pros[1] = "江苏省";
		pros[0] = "山东省";
		System.out.println(pros[2]);
		System.out.println("********************");
		
		String[] newPros = {"湖南","浙江","安徽","广西","山西"};
		System.out.println(pros[0]);
		System.out.println(newPros[1]);
		System.out.println(newPros.length);
		System.out.println(newPros[newPros.length-1]);

	}

}
