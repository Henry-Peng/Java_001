package com.peng.annotation;
import java.io.IOException;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 测试自定义的注解类(CreatAnnotation.java) & (CreatAnnotation2.java)
 * 		解析自定义的注解类的信息(通过方法runWrite获得信息)
 * @author pfh
 * @date 2020年5月20日
 */
@CreatAnnotation2(inVal = "这是一个注解在类上的注解类")
public class AnnotationTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//反射  找到class信息,method的所有方法
		Class<AnnotationTest> anno = AnnotationTest.class;
		
		/*Method[] methods = anno.getMethods();
		for (Method method : methods) {//取得所有的方法
			System.out.println(method);
		}*/
		
		//runWrite
		Method method = anno.getMethod("runWrite");//参数类型可以不写parameterTypes
		/*Annotation[] annotations = method.getAnnotations();
		System.out.println(annotations.length);//2
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}*//*@com.peng.annotation.CreatAnnotation(index=-1, inVal=666, val=ll, values=[jk, lk, mn], addOne=sl)
		   @com.peng.annotation.CreatAnnotation2(url=abcd, inVal=000)*/

		CreatAnnotation[] creatAnnotations = method.getAnnotationsByType(CreatAnnotation.class);
		//System.out.println(creatAnnotations.length);//1,只输出1的注解
		
		/*for (CreatAnnotation creatAnnotation : creatAnnotations) {
			System.out.println(anno);
			System.out.println(method);
			System.out.println(creatAnnotation);
			System.out.println(creatAnnotation.values()[1]);
		}*/
		
		//获得CreatAnnotation类的信息
		for (CreatAnnotation creatAnnotation : creatAnnotations) {
			System.out.println("inVal" + creatAnnotation.inVal());
			System.out.println("val" + creatAnnotation.val());
			System.out.println("index" + creatAnnotation.index());
			
			System.out.println(Arrays.toString(creatAnnotation.values()));
		}

	}
	
	@Deprecated
	@CreatAnnotation2(inVal = "ssr")
	public void getShops() {
		System.out.println("方法弃用");
		
	}

	@CreatAnnotation(val = "ll", values = { "jk","lk","mn" }, addOne= "sl")
	@CreatAnnotation2(inVal = "000")
	public static void runWrite() throws IOException{
		
		System.out.println("runWrite");
	}

}
