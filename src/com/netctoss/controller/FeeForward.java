package com.netctoss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netctoss.entity.Cost;
import com.netctoss.service.FeeServiceDao;
import com.netctoss.service.impl.FeeServiceDaoImpl;


/**
 * "资费管理"模块转向的servlet
 */
@WebServlet("/FeeForward")
public class FeeForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FeeServiceDao feeServiceDao = new FeeServiceDaoImpl();
		String operate = request.getParameter("operate");
		//重定向不可以成功跳转,需使用转发
		if ("add".equals(operate)) {
			request.getRequestDispatcher("WEB-INF/jsp/fee/fee_add.jsp").forward(request, response);
		}else if ("update".equals(operate)) {
			Cost cost = null;
			int COST_ID = Integer.parseInt(request.getParameter("COST_ID"));
			cost = feeServiceDao.findCost(COST_ID);
			request.setAttribute("cost", cost);
			request.getRequestDispatcher("WEB-INF/jsp/fee/fee_modi.jsp").forward(request, response);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
