package com.lee.shourong;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.	HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/getIndexProjects"})
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProjectServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String reqjson = request.getParameter("reqjson");
		System.err.println(" reqjson:"+reqjson);
		Gson gson = new Gson();
		reqJSonObj req = gson.fromJson(reqjson, reqJSonObj.class);
		BannerResBean res = new BannerResBean();
		response.setCharacterEncoding("utf-8");
		res.resultcode = "1";
		ArrayList<String> list = new ArrayList<String>();
		list.add("hehe");
		list.add("hehe");
		list.add("hehe");
		list.add("hehe");
		res.data = list;
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj{
		String mobileno;
		String password;
	}
	
	public static class BannerResBean {
        public String resultcode;
        public String msg;
        public ArrayList<String> data;

    }
	
}
