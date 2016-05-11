package com.lee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.LoginResponse;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/leave_group" })
public class LeaveGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LeaveGroupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tribeid = request.getParameter("tribeid");
		
		LoginResponse info = new LoginResponse();
		info.code = 1;
		info.msg = "成功退出群组";

		System.err.println("leave_group tribeid " + tribeid);

		response.setCharacterEncoding("utf-8");

		Gson gson = new Gson();
		String str = gson.toJson(info);
		
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
