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
import com.lee.bean.TribeListInfo;
import com.lee.bean.TribeListInfo.TribeInfo;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/getuser_group"})
public class GetUserJoinGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetUserJoinGroupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String type = request.getParameter("type");
//		
//		System.err.println("getuser_group type "+type);
		
		response.setCharacterEncoding("utf-8");
		TribeListInfo res = new TribeListInfo();
		res.code = 1;
		
//		ArrayList<TribeInfo> list = new ArrayList<TribeInfo>();
//		TribeInfo data1 = new TribeInfo();
//		data1.tribeid = "1587182129";
//		data1.tribename = "我的第一个群组";
//		data1.portrait = "https://webjs.ww.taobao.com/generate/tribe/picture/tribev6_picture_default_taobao.gif";
//
//		TribeInfo data2 = new TribeInfo();
//		data2.tribeid = "1587182893";
//		data2.tribename = "我的第二个群组";
//		data2.portrait = "https://webjs.ww.taobao.com/generate/tribe/picture/tribev6_picture_default_taobao.gif";
//		list.add(data2);
//		list.add(data1);
		res.groups = null;
		
		Gson gson = new Gson();
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
