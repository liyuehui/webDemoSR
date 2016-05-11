package com.lee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.AllUserInfo;
import com.lee.bean.LoginResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String reqjson = request.getParameter("reqjson");
		System.err.println(" reqjson:"+reqjson);
		Gson gson = new Gson();
		reqJSonObj req = gson.fromJson(reqjson, reqJSonObj.class);
		LoginResponse res = new LoginResponse();
		response.setCharacterEncoding("utf-8");
		if("18611629603".equals(req.mobileno) && AllUserInfo.LiuDeHua.password.equals(req.password)){
			res.code = 1;
			res.msg = "登录成功";
			LoginResponse.Data data = new LoginResponse.Data();
			data.impassword = AllUserInfo.LiuDeHua.impassword;
			data.imuserid = AllUserInfo.LiuDeHua.imuserid;
			data.userid = AllUserInfo.LiuDeHua.userid;
			data.level = AllUserInfo.LiuDeHua.level;
			res.data = data;
			String str = gson.toJson(res);
			response.getWriter().append(str);
		}else{
			res.code = 2;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj{
		String mobileno;
		String password;
	}
	
}
