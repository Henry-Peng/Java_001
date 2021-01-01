package com.peng.crm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理器
 * @author pfh
 * @date 2020年8月10日
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver{

	
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		//记录异常日志
		//ex.printStackTrace();
		
		//错误消息的提示
		String msg = "系统发生异常,请联系管理员!";
		
		//如果为自定义异常,显示自定义消息
		if (ex instanceof MyExceptionResolver) {
			msg = ((MyExceptionResolver)ex).getMsg();//在异常处要设置抛出异常为MyExceptionResolver
		}
		//System.out.println(msg);
		//响应用户的错误信息
		ModelAndView mav = new ModelAndView();
		
		//返回错误信息
		mav.addObject("msg", msg);
		
		//相应的错误提示页面
		mav.setViewName("msg");
		
		return mav;
	}
	
}
