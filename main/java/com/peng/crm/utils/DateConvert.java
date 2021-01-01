package com.peng.crm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 日期转换器
 * s:source,源类型,要转换的类型
 * t:target,目标,要转换成的目标类型
 * @author pfh
 * @date 2020年8月9日
 */
public class DateConvert implements Converter<String, Date>{

	public Date convert(String source) {
		Date date = null;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = sd.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	

}
