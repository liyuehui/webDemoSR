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
@WebServlet(urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userrealname = request.getParameter("userrealname");
		String email = request.getParameter("email");
		String invitecode = request.getParameter("invitecode");
		String mobileno = request.getParameter("mobileno");
		String verifycode = request.getParameter("verifycode");
		String password = request.getParameter("password");
		
		
		System.err.println("register userrealname "+userrealname
				+ " email " +email+" invitecode " +invitecode
				+" mobileno "+mobileno +" verifycode "+verifycode
				+" password  "+password);
		
		response.setCharacterEncoding("utf-8");
		SimpleResponse res = new SimpleResponse();
		res.code = 1;
		res.msg = "注册成功";
		
		Gson gson = new Gson();
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
