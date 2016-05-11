package com.lee;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.LoginResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = { "/set_location" })
public class set_location extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public set_location() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String reqjson = request.getParameter("reqjson");
		System.err.println(" reqjson:" + reqjson);
		Gson gson = new Gson();
		reqJSonObj req = gson.fromJson(reqjson, reqJSonObj.class);
		ResJson res = new ResJson();
		response.setCharacterEncoding("utf-8");
		if ("18611629603".equals(req.userid)) {
			res.code = 1;
			res.msg = "提交成功";
			
			String str = gson.toJson(res);
			response.getWriter().append(str);
		} else {
			res.code = 2;
			res.msg = "未知错误";
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj {
		String setlocation;
		String userid;
	}

	class ResJson {
		int code;
		String msg;
	}

}
