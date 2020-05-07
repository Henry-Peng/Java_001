package com.peng.demo;
/**
 * break与continue的使用方式
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo016_for {

	public static void main(String[] args) {
		int i;
		// 跑步四圈：int i = 0,停止到第几圈[0,1,2,3]
		for(i=0;i<8;i++){
			if (i==3) {
				System.out.println("第"+i+"圈,不想跑了");
				continue;
			}
			if (i==6) {
				System.out.println("第"+i+"圈,还可以坚持坚持");
				continue;
			}
			System.out.println(i);
		}
		for(i=0;i<10;i++){
			if (i==8) {
				break;
			}
			System.out.print(i);
		}

	}

}
