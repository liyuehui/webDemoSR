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
@WebServlet(urlPatterns = { "/getuser_locationinfo" })
public class getuser_locationinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getuser_locationinfo() {
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
		if (AllUserInfo.LiuDeHua.userid.equals(req.userid)) {
			res.code = 1;
			res.users = new ArrayList<UserLoacation>();

			UserLoacation u1 = new UserLoacation();
			u1.city = AllUserInfo.GaoYuanYuan.city;
			u1.latitude = AllUserInfo.GaoYuanYuan.latitude;
			u1.longitude = AllUserInfo.GaoYuanYuan.longitude;
			u1.portrait = AllUserInfo.GaoYuanYuan.portrait;
			u1.realname = AllUserInfo.GaoYuanYuan.realname;
			u1.userid = AllUserInfo.GaoYuanYuan.userid;
			res.users.add(u1);
			
			UserLoacation u = new UserLoacation();
			u.city = AllUserInfo.ZhangHuiMei.city;
			u.latitude = AllUserInfo.ZhangHuiMei.latitude;
			u.longitude = AllUserInfo.ZhangHuiMei.longitude;
			u.portrait = AllUserInfo.ZhangHuiMei.portrait;
			u.realname = AllUserInfo.ZhangHuiMei.realname;
			u.userid = AllUserInfo.ZhangHuiMei.userid;
			res.users.add(u);
			String str = gson.toJson(res);
			response.getWriter().append(str);
		} else {
			res.code = 2;
			res.msg = "Î´Öª´íÎó";
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj {
		String userid;
		String longitude;
		String latitude;
		String range;
	}

	class ResJson {
		int code;
		String msg;
		ArrayList<UserLoacation> users;
	}

	class UserLoacation {
		String userid;
		String realname;
		String portrait;
		String city;
		String longitude;
		String latitude;
	}
}
