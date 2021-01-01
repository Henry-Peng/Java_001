package com.netctoss.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

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
 * "资费管理"模块执行修改操作的servlet
 */
@WebServlet("/FeeUpdateServlet")
public class FeeUpdateServlet extends HttpServlet {
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
		
		boolean result = feeServiceDao.checkNameBesideThisId(cost.getNAME(), cost.getCOST_ID());//判断表中是否已有该名称,除了此数据之外
		if (result) {
			response.getWriter().print("0");//如果已有,则返回0
		}else{//如果没有该名称,则将要修改的内容传回
			boolean updateResult = feeServiceDao.updateCost(cost);
			if (updateResult) {//执行修改,并返回结果
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
