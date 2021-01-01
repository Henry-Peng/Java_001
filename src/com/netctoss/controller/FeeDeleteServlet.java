package com.netctoss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netctoss.service.FeeServiceDao;
import com.netctoss.service.impl.FeeServiceDaoImpl;

/**
 * "资费管理"模块删除资费的servlet
 */
@WebServlet("/FeeDeleteServlet")
public class FeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FeeServiceDao feeServiceDao = new FeeServiceDaoImpl();
		int COST_ID = Integer.parseInt(request.getParameter("COST_ID"));
		boolean result = feeServiceDao.deleteCost(COST_ID);
		response.getWriter().print(result);
		response.getWriter().close();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
