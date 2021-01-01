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
 * "资费管理"模块详细信息的servlet
 */
@WebServlet("/FeeDetailServlet")
public class FeeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FeeServiceDao feeServiceDao = new FeeServiceDaoImpl();
		Cost cost = null;
		int COST_ID = Integer.parseInt(request.getParameter("COST_ID"));
		cost = feeServiceDao.findCost(COST_ID);
		/*if (cost == null) {
			response.getWriter().print("数据为空,此处应转到error页面");
		}*/
		request.setAttribute("cost", cost);
		request.getRequestDispatcher("WEB-INF/jsp/fee/fee_detail.jsp").forward(request, response);

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
