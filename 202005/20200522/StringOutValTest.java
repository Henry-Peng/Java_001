package com.peng.mapping;
/**
 * 测试执行String值:自定义一个String类(包名称也必须一样)
 * @author pfh
 * @date 2020年5月22日
 */
public class StringOutValTest {

	public static void main(String[] args) {
		String name = "何文";
		//输出是null,实际是XXXX/lib/rt.jar
		System.out.println(name.getClass().getClassLoader());//加载器,找到启动器(底层是C++),打印输出会是null
		//System.out.println(name);
		System.out.println(name.toString());//自定义一个String类,输出还是按照系统自带的进行,安全保证
		
		//保证安全机制,我们直接使用object或是string,自己也无法定义,调用的全是jdk下的jt.jar
		
	}

}
