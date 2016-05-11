package com.lee;

import java.io.IOException;
import java.util.ArrayList;

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
@WebServlet(urlPatterns = { "/search_user" })
public class search_user extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public search_user() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Gson gson = new Gson();
		ResJson res = new ResJson();
		response.setCharacterEncoding("utf-8");
		AllUserInfo.UserInfo resInfo = null;
		res.code  = 1;
		ArrayList<users> users = new ArrayList<users>();
		
		users u = new users();
		u.city = AllUserInfo.ZhangHuiMei.city;
		u.level = AllUserInfo.ZhangHuiMei.level;
		u.portrait = AllUserInfo.ZhangHuiMei.portrait;
		u.realname = AllUserInfo.ZhangHuiMei.realname;
		u.type = "A";
		u.userid = AllUserInfo.ZhangHuiMei.userid;
		users.add(u);
		
		users u1 = new users();
		u1.city = AllUserInfo.GaoYuanYuan.city;
		u1.level = AllUserInfo.GaoYuanYuan.level;
		u1.portrait = AllUserInfo.GaoYuanYuan.portrait;
		u1.realname = AllUserInfo.GaoYuanYuan.realname;
		u1.type = "A";
		u1.userid = AllUserInfo.GaoYuanYuan.userid;
		users.add(u1);
		
		res.users = users;
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


	class ResJson {
		int code;
		String msg;
		ArrayList<users> users;
	}

	class users{
		String type;
		String userid;
		String realname;
		String level;
		String portrait;
		String city;//":"北京"
	}
}
