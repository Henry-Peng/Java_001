package com.peng.mapping;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.peng.json.User;

/**
 * 类对象获取,获取类名称/属性/方法/构造器
 * @author pfh
 * @date 2020年5月22日
 */
public class UserTest {//全限定路径名:com.peng.mapping.UserTest
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String classPath = "com.peng.json.User";
		Class<?> class1 = Class.forName(classPath);
 		System.out.println(class1);
 		System.out.println(class1.hashCode());
 		Class<?> class2 = Class.forName(classPath);
 		System.out.println(class2.hashCode());
 		
 		
 		/*
 		 * 右击类名称选中Copy qualified name得到:
 		 * 全限定路径名/seDemo06XML&Ann&Json/src/com/peng/mapping/UserTest.java
 		 */
 		System.out.println(class1.getName());//com.peng.json.User
 		System.out.println(class1);//class com.peng.json.User
 		System.out.println(class1.getSimpleName());//User,类名称
 		
 		int[] arr1 = new int[2];
 		System.out.println(arr1.getClass().hashCode());
 		int[] arr2 = new int[5];
 		System.out.println(arr2.getClass().hashCode());
 		int[][] arr3 = new int[5][3];
 		System.out.println(arr3.getClass().hashCode());
 		
 		/*
 		 * //获取声明的成员变量(所有修饰符)
 		 */
 		Field[] fields = class1.getDeclaredFields();
 		for (Field field : fields) {
			System.out.println(field);
		}
 		
 		/*
 		 * 获取Class1类自己声明的所有方法(不包括构造器方法),包括private修饰的方法
 		 */
 		//Method[] methods = class1.getDeclaredMethods();
 		for (Method method : class1.getDeclaredMethods()) {
			System.out.println(method);
		}
 		System.out.println("****************************");
 		
 		/*
 		 * 获取Class1类的方法(不包括构造器方法)不仅包括声明的方法,还有Object类中的方法,但是不包括private修饰的方法
 		 */
 		for (Method method : class1.getMethods()) {
			System.out.println(method);
		}
 		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
 		
 		/*
 		 *获取构造器
 		 */
 		Constructor<?>[] constructors = class1.getConstructors();
 		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
 		System.out.println(constructors.length);
 		System.out.println(class1.getConstructors().length);//说明getConstructors方法返回数组形式
 		
 		/*
 		 * 动态获取
 		 */
 		User user = (User) class1.newInstance();//调用无参构造器,实例化对象
 		//User user = null;//NullPointerException,未实例化,也会报<init>错误
 		/*
 		 * 实例化之后,Set&Get都可以操作
 		 */
 		System.out.println("name:" + user.getName());//name:null  得到的是user类属性
 		System.out.println("name:" + class1.getName());//name:com.peng.json.User   得到的是类的名称
 		user.setName("张三");
 		System.out.println("name:" + user.getName());//name:张三
	
	}

}
