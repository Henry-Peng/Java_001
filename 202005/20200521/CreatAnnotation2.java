package com.peng.annotation;
/**
 * 建类时选择属性后
 *        自动生成的状态
 */
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
public @interface CreatAnnotation2 {
	public String inVal() ;
	public String url() default "abcd";
}
