package com.peng.demo2;

/**
 * copy Demo004,Array输出/缓存/截取/间隔
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo006_buffer {
	
	public static void main(String[] args){
		int[] newNums = getNums();//输入
		for(int c : newNums){
			System.out.print(c+"\t");//输出
		}
		
		StringBuffer sbf = new StringBuffer();//新建缓存,非数组格式,是字符串
		for(int n : newNums){
			sbf.append(n+",");//进入缓存并加间隔符
		}
		
		System.out.println("\n缓存字符串内容:"+sbf);
		System.out.println("去掉尾号:"+sbf.substring(0, sbf.length()-1));
		System.out.println("********字符串分割之后用数组接收***********");
		String[] arrays = sbf.substring(0, sbf.length()).split(",");
		for(int i=0;i<arrays.length;i++){
			System.out.print(arrays[i]+"\t");
		}
		System.out.print(arrays.length);
	}
	
	public static int[] getNums(){
		int[] nums = {22,33,44,55,66,77,88};
		return nums;
	}

}
