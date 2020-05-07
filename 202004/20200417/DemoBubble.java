package com.peng.demo2;

public class DemoBubble {

	public static void main(String[] args) {
		int[] bubbleNums = {21,24,16,8,27};
		int[] newNums = showBubble(bubbleNums);
		for(int c:newNums){
			System.out.print("\t"+c);
		}
		
		// TODO Auto-generated method stub

	}
	
	public static int[] showBubble(int[] arrays) {
		for(int i=0;i<arrays.length-1;i++){
			boolean flag = true;
			for(int j=0;j<arrays.length-1-i;j++){
				if(arrays[j]>arrays[j+1]){
					int temp = arrays[j+1];
					arrays[j+1] = arrays[j];
					arrays[j] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		return arrays;
	}

}
