package com.peng.exception;
/**
 * 异常捕捉:
 * 		try{...
 * }catch(){...
 * }
 * @author pfh
 * @date 2020年4月30日
 */
public class exception01 {

	public static void main(String[] args) {
		run1();
		run2();
		run3();
	}
	
	public static void run3(){
		try{
			int a ;
			Integer integer = null;
			a = integer;
			System.out.println(a);
		}catch(Exception c){
			c.printStackTrace();
		}
	}
	
	public static  void run2() {
		try{
			String[] hobbys = new String[3];
			hobbys[0] = "唱";
			hobbys[2] = "跳";
			hobbys[3] = "rap";
			}catch (Exception b) {
				b.printStackTrace();
				System.out.println("**************run2***************");
			}
	}
	
	public static void run1(){
		// NullPointerException;

		try {// 有存在异常的代码
			int num = 10/0;
		} catch (Exception a) {// catch:抛出异常问题信息
			// 错误信息打印输出
			// System.out.println("*********getMessage************");
			// System.out.println("*********getStackTrace************");
			a.printStackTrace();// 输出所有的错误信息
			System.err.println(a.getMessage());// getMessage:错误原因
			System.err.println(a.getStackTrace());// getStackTrace:内存地址
			System.err.println(a.getLocalizedMessage());
			System.err.println(a.toString());// 显示第一行:错误异常类提示及错误原因
			System.err.println("这是一个自己设定的错误提示信息");
			System.out.println("**************run1***************");
			
		}
	}
}
