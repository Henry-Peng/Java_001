package com.peng.demo2;
/**
 * 数组转换/截取/分割/接收
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo004_returnArray {

	public static void main(String[] args) {
		int[] newNums = showArrays();
		for(int i=0;i<newNums.length;i++){
			System.out.print(newNums[i]+"\t");
		}
		//字符串追加
		StringBuffer sbf = new StringBuffer();//临时存储区
		for(int n : newNums){
			sbf.append(n+";");//在原来拿到的值上不断的追加
		}
		System.out.println("stringBuffer原来的输出:"+sbf);
		System.out.println("截去最后一个逗号:"+sbf.substring(0,sbf.length()-1));
		//去掉最后一个逗号,substring截取方法
		System.out.println("*********字符串分割之后,用数组接收***************");
		//把字符串100,5,66,99,15,22,31分割()之后取值
		String[] arrays=sbf.substring(0,sbf.length()-1).split(";");
		for (String a:arrays){
			System.out.print(a+"\t");
		}
	}
	
	public static int[] showArrays() {
		int[] nums = {100,5,66,99,15,22,31};
		return nums;
		
	}

}
