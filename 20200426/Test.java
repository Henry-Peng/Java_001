package com.peng.test;
import java.util.Arrays;
/**
 *   ==与equals比较:
 *   纯数字比较只能==
 *   equals必须是String类型
 *   new String类型与String a = "22"
 *   只要new出来的(引用类型)
 *   String b = a+8(+叫字符串追，其实是对象，堆中内存地址产生)
 * @author djy
 * @date   2020年4月24日
 *
 */
import com.peng.modelNew.Son;

public class Test {

	public static void main(String[] args) {
		
		runNum1();
		System.out.println("********************下面是Compare2**********************");
		runStringCompana2();
		System.out.println("********************下面是Compare3**********************");
		runStringCompana3();
		System.out.println("********************下面是Compare4**********************");
		runStringCompana4();
		System.out.println("********************下面是Compare5**********************");
		runStringCompana5();
		System.out.println("********************下面是Compare6**********************");
		runStringCompana6();
		System.out.println("********************下面是Compare7**********************");
		runArrays7();
		System.out.println("********************下面是Compare8**********************");
		runStringCompara8();
		System.out.println("********************暂无**********************");
	}
	
	public static void runStringCompara8() {
		String aString = "ii";
		Son son = new Son();
		Son son2 = new Son();
		boolean answer = (son.getName() == son2.getName());//get返回的是一个字符串
		System.out.println(answer);	
	}
	
	public static void runArrays7(){
		/*int[] nums = new int[8];
		nums[0]=11;*/
		int[] nums = {22,11,55};//new 之后的，在堆中生成一个内存地址
		int[] nums2 = {22,11,55};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
		System.out.println("==号比较两个数组:"+(nums == nums2));//先比较内存地址是否一致
		System.out.println("equals两个数组:"+nums.equals(nums2));
		System.out.println("其它方式Arrays.equals:"+Arrays.equals(nums, nums2));
	}
	
	// 字符串比较(定义一个String变量，然后再+[追加])
	public static void runStringCompana6() {
		String s1 ="12";//方法区
		String s2 = s1 + "3";//+追加,在堆中生成一个内存地址，这时已经是个对象，相当于是new之后
		String s3 = "123";//在方法区

		// ==与equals
		System.out.println("==号比较:"+(s2 == s3));
		System.out.println("************equals****************");
		System.out.println("[String变量之后+]equals比较," + s2 + "与" + s3 + "字符串:" + (s2.equals(s3)));// 比较输出值是否一样
	}
	
	// 字符串比较(new方式，还有String a=55)
	public static void runStringCompana5() {
		String s1 = new String("张三");//new 在堆中产生一个对象，产生一个内存地址
		String s2 = "张三";//字符串在方法区

		// ==与equals
		System.out.println("==号比较:"+(s1 == s2));//比较内存地址[@11222]是否一致，然后才比较值
		System.out.println("************equals****************");
		System.out.println("String类型new之后 (与一个String直接赋值)的equals比较," + s1 + "与" + s2 + "字符串:" + (s1.equals(s2)));// 比较输出值是否一样
	}
	
	// 字符串比较(new方式)
	public static void runStringCompana4() {
		String h = new String("张三");//new 在堆中产生一个对象，产生一个内存地址
		String i = new String("张三");//在堆中生成一个新的对象

		// ==与equals
		System.out.println("==号比较:"+(h == i));//比较内存地址[@11222]是否一致，然后才比较值
		System.out.println("************equals****************");
		System.out.println("String类型new之后的equals比较," + h + "与" + i + "字符串:" + (h.equals(i)));// 比较输出值是否一样
	}
	
	// 字符串比较
	public static void runStringCompana3() {
		String e = "12";
		int f = Integer.valueOf(e)+3;//Integer.valueOf(e)＝把"12"转换成int//Integer.valueOf产生内存地址，堆中
		String g = "15";
		
		// ==与equals
		System.out.println( "==比较:"+( Integer.valueOf(g) == f ) );
		System.out.println("equals比较," + f + "和" + g + "数字:" + (g.equals(f)));// 比较输出值是否一样
	}
	
	//字符串比较
	public static void runStringCompana2(){
		String c = "111";//在方法区
		String d = "111";//在方法区
		
		//==与equals
		System.out.println("==比较,"+c+"和"+d+"数字:" + (c==d));
		System.out.println("**************equals比较*******************");
		System.out.println("equals比较,"+c+"和"+d+"数字:"+(c.equals(d)));//比较输出值是否一样
	}
	
	public static void runNum1(){
		int a = 85;//在方法区
		int b = 85;//在方法区
		//boolean result = (a==b);
		boolean result = (a==b);
		System.out.println(a+"和"+b+"的数字型比较:"+result);
	}
}
