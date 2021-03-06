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
@WebServlet(urlPatterns = {"/getverifycode"})
public class GetVerifyCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetVerifyCodeServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String phone = request.getParameter("mobileno");
		
		System.err.println("getverifycode mobileno "+ phone );
		
		response.setCharacterEncoding("utf-8");
		
		SimpleResponse res = new SimpleResponse();
		res.code = 1;
		res.msg = "验证码已发送到你手机上";
		
		Gson gson = new Gson();
		String str = gson.toJson(res);
		
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
