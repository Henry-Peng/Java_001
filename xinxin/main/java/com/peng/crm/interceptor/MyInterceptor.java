package com.peng.crm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义拦截器,类似于servlet里面的filter
 * @author pfh
 * @date 2020年8月11日
 */
public class MyInterceptor implements HandlerInterceptor{

	/**
	 * 方法执行后被执行
	 * 处理异常,清理资源,记录日志等
	 */
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("MyInterceptor.afterCompletion");
		
	}

	/**
	 * 方法执行后,返回ModelAndView之前执行
	 * 设置页面公用的参数等等
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("MyInterceptor.postHandle");
		
	}

	/**
	 * 进入方法前被执行
	 * 登录拦截,权限校验
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("MyInterceptor.preHandle");
		String name = request.getParameter("name");
		//true为放行;false:拦截;
		return true;
	}
	
	

}
