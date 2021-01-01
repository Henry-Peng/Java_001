package com.peng.crm.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 自定义标签的使用
 * @author pfh
 * @date 2020年8月11日
 */
public class MyTag extends TagSupport{
	
	@Override
	public int doStartTag() throws JspException {
		//建立一个Jsp输出流
		JspWriter out = super.pageContext.getOut();
		
		//生成一个标签
		try {
			out.print("<span>这是自定义输出的异常!</span>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	

}
