package com.peng.demo2;
/**
 * 冒泡排序:最主要是两两数字比较,位置交换
 * @author pfh
 * @date 2020年4月17日
 */
public class Demo011_bubble {

	public static void main(String[] args) {
		int[] bubbleNum = {21,22,33,52,34,67,78,79,27,34,100,190,379,677,378,327};
		
		//得到比较之后的数组
		System.out.print("********数组升序*************");
		int[] newNums =showBubble(bubbleNum);//升序
		System.out.print("排序结果:");
		for(int c : newNums){
			System.out.print("\t"+c);
		}

	}
	
	public static int[] showBubble(int[] bubbleNums){
		//升序,倒序
		int n = 0 ;
		int S = 0 ;
		for(int i = 0;i<bubbleNums.length-1;i++){//比较几轮,应该比较n-1轮
			boolean flag = true;
			for(int j=0;j<bubbleNums.length-1-i;j++){//每一轮比较n-1-i次
				n++;//比较n次
				if(bubbleNums[j]>bubbleNums[j+1]){//如果降序,则交换
					int temp = bubbleNums[j+1];//临时存储信息,做交换
					bubbleNums[j+1] = bubbleNums[j];
					bubbleNums[j] = temp;
					S++;//交换S次
					flag = false;
				}
			}
			if (flag) {//本轮如果没有交换,提前结束
				break;
			}
		}
		System.out.println("\n比较"+n+"次");
		System.out.println("交换"+S+"次");
		return bubbleNums ;
	}

}
