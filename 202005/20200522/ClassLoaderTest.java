package com.peng.mapping;

/**
 * 测试输出不同类加载器
 * @author pfh
 * @date 2020年5月22日
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		//应用程序类加载器
		System.out.println(ClassLoader.getSystemClassLoader());
		//扩展类加载器
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		//启动类加载器(底层C++)无法被java程序直接引用,因此JVM默认直接使用启动类加载器
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
		
		//获取当前项目下的:类的应用程序,不影响别的项目
		System.out.println(System.getProperty("java.class.path"));
		//test();
	}
	
	public static void test() {
		String aString = "ll";
		String bString = "ll";
		String cString = new String("ll");
		System.out.println(aString == cString);
		System.out.println(aString.hashCode());
		System.out.println(bString.hashCode());
		System.out.println(cString.hashCode());
		
		System.out.println(aString.getClass() + "," + Integer.toHexString(aString.hashCode()));
		System.out.println(cString.getClass().getName() + "," + Integer.toHexString(cString.hashCode()));
		
	}

}
