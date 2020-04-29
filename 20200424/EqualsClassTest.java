package com.peng.test;
/**
 * 比较:
 *   ==  和    .equals()
 * @author pfh
 * @date 2020年4月23日
 */
public class EqualsClassTest {

	public static void main(String[] args) {
		
		runCompara();
		
	}
	
	//比较方法
	public static void runCompara(){
		int  a = 111111;
		int  b = 222222;
		if (a == b) {
			System.out.println("两个密码是一样的");
		}else {
			System.out.println("两个密码不一致");
		}
		
		String abc = "虎虎生威";
		String bcd;
		bcd = "虎虎生威";
		String cde = "连年有余";
		//String cde = "虎虎生威";
		
		if (abc == bcd) {
			System.out.println("两个账号一样");
		}
		
		if (abc.equals(bcd)) {
			System.out.println("两个账号一样");
		}else{
			System.out.println("两个账号不一样");
		}
		
		
		
	}

}
