package com.lee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.SimpleResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/search_pwd"})
public class SearchPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchPasswordServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mobileno = request.getParameter("mobileno");
		String verifycode = request.getParameter("verifycode");
		String newpassword = request.getParameter("newpassword");
		
		System.err.println("search_pwd mobileno "+mobileno + " verifycode " +verifycode+" newpassword"+newpassword );
		
		response.setCharacterEncoding("utf-8");
		SimpleResponse res = new SimpleResponse();
		res.code = 1;
		res.msg = "密码修改成功";
		
		Gson gson = new Gson();
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
