package com.peng.demo;
/**
 * while 取偶数,素数
 * @author pfh
 * @date 2020年4月15日
 */
public class Demo018_while {

	public static void main(String[] args) {
		getNums();
		primeNums();
	}
	
	public static void getNums() {
		int i = 1;
		int y = 1;
		while(i<100){
			if(i%2==0){//取偶数
				System.out.println("输出偶数:"+i+",第"+y+"个");
				y++;
			}
			i++;
		}
	}
	
	public static void primeNums() {//取素数方法
		System.out.println("下列是素数:");
		int n = 0;//素数个数
		for(int i=100;i<200;i++){//100到199
			int num = 0;
			for(int b=2;b<i;b++){//除数设定
				if(i%b==0){
					num++;
				}
			}
			if(num==0){
				n++;
				System.out.print(i+",");
			}
		}
		System.out.println("素数共有"+n+"个");
		
	}

}
