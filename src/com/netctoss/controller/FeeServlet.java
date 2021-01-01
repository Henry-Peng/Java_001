package com.netctoss.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netctoss.entity.Cost;
import com.netctoss.entity.PageBeanAccount;
import com.netctoss.service.FeeServiceDao;
import com.netctoss.service.impl.FeeServiceDaoImpl;

/**
 * "资费管理"模块开始的servlet
 */
@WebServlet("/FeeServlet")
public class FeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FeeServiceDao feeServiceDao = new FeeServiceDaoImpl();
		List<Cost> costs = null;
		PageBeanAccount page = new PageBeanAccount();
		// System.out.println(page);
		// 每页数据条数
		int pageSize = Integer.parseInt(getServletContext().getInitParameter("pageSize"));
		// 当前页码
		int pageNum = request.getParameter("pageNum") == null ? 1 : Integer.parseInt(request.getParameter("pageNum"));

		int count = feeServiceDao.countCost();// 获取数据条数

		int pageCount = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;// 获取页码数

		// 将数据传递给Page,便于统一
		page.setPageCount(pageCount);// 页数
		page.setPageNum(pageNum);// 页码
		page.setPageSize(pageSize);
		page.setUrl(request.getContextPath() + "/FeeServlet");
		if (pageNum < pageCount) {
			request.setAttribute("hasNext", true);
		} else {
			request.setAttribute("hasNext", false);
		}
		if (pageNum > 1) {
			request.setAttribute("hasPrevious", true);
		} else {
			request.setAttribute("hasPrevious", false);
		}
		page.setEveryPageEnd(pageCount);
		page.setEveryPageStart(1);

		request.setAttribute("page", page);// 传递分页信息

		String order = request.getParameter("order");
		String sort = request.getParameter("sort") == null ? "asc" : request.getParameter("sort");
		if (order == null || order.equals("")) {// order为空表示不排序,直接分页查询
			costs = feeServiceDao.showPageCost(pageNum, pageSize);
		} else {
			costs = feeServiceDao.showCostByOrder(order, sort, pageNum, pageSize);
			request.setAttribute("order", order);
			request.setAttribute("sort", sort);
		}
		request.setAttribute("costs", costs);//传递查询数据
		request.getRequestDispatcher("WEB-INF/jsp/fee/fee_list.jsp").forward(request, response);

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
