package com.netctoss.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.netctoss.entity.Cost;
import com.netctoss.service.FeeServiceDao;
import com.netctoss.service.impl.FeeServiceDaoImpl;

/**
 * "资费管理"模块添加资费的servlet
 */
@WebServlet("/FeeAddServlet")
public class FeeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FeeServiceDao feeServiceDao = new FeeServiceDaoImpl();
		Cost cost = new Cost();
		try {
			BeanUtils.populate(cost, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		boolean result = feeServiceDao.checkName(cost.getNAME());//判断表中是否已有该名称
		if (result) {
			response.getWriter().print("0");//如果已有,则返回0
		}else{//如果没有该名称,先对要添加的内容进行补充
			cost.setSTATUS("0");//设置状态
			cost.setCREATIME(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));// [Date日期,转换成字符串]以当前的时间进行格式化(yyyy-MM-dd hh:mm:ss)
			if (feeServiceDao.addCost(cost)) {//执行添加,并返回结果
				response.getWriter().print("1");//返回1表示成功
			}else {//如果失败
				response.getWriter().print("-1");//返回-1表示失败
			}
		}

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
