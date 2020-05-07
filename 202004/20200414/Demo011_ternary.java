package com.peng.demo;

/**
 * 三目运算符：
 *  (条件判定)?true(文字):false(文字)
 * @author pfh
 * @date 2020年4月14日
 */
public class Demo011_ternary {

	public static void main(String[] args) {
		System.out.println((2<5)? true: false);
		//ctrl+Z返回；ctrl+Y前进
		int sex = 0 ;//1为男，0为女;
		System.out.println((sex == 0) ? "女" : "男");
		
		System.out.println(((3>4) && (8<9))? "正确": "错误");
		
		System.out.println(("李四" == "张三") ? "相等" : "不相等");
		System.out.println(("李四".equals("李四") ? "相等":"不相等"));
		
		int num = 8 ;
		System.out.println((5<8) && (8>7)? (num++):(num--));
		System.out.println(num);
		
		//String loginName = "";
		String loginName = null ;
		//String loginName = "李四";
		String loginName2 = "张三";
		System.out.println(loginName != null ?
				(loginName.equals(loginName2)? "相等":"不相等"):"值为空");
		//System.out.println((loginName.equals(loginName2)? "相等":"不相等"));
		
		//end pfh 20200414

	}

}
