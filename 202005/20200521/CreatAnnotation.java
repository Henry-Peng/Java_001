package com.peng.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个新的Annotation类
 * @author pfh
 * @date 2020年5月20日
 */
@Target(value = { ElementType.METHOD ,ElementType.TYPE})//此注解只能使用在方法上,还可以是类
@Retention(RetentionPolicy.RUNTIME)//RUNTIME数据保留范围最大
public @interface CreatAnnotation {

	//值输入
	String inVal() default "666";
	String val();//没有默认,则必须要求写入值addOne
	int index() default -1;
	String[] values();//没有默认,则必须要求写入值
	String addOne();
}
