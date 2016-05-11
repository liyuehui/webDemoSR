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
@WebServlet(urlPatterns = { "/getuser_info_id" })
public class getuser_info_id extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getuser_info_id() {
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
		AllUserInfo.UserInfo resInfo = null;
		res.code  = 1;
		if(AllUserInfo.GaoYuanYuan.userid.equals(req.getuserid)){
			resInfo =  AllUserInfo.GaoYuanYuan;
		}else if(AllUserInfo.ZhangHuiMei.userid.equals(req.getuserid)){
			resInfo = AllUserInfo.ZhangHuiMei;
		}else if (AllUserInfo.LiuDeHua.userid.equals(req.userid)) {
			resInfo = AllUserInfo.LiuDeHua;
		} else{
			res.code = 2;
			res.msg = "未知错误";
		}
		
		res.data = resInfo;
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj {
		String userid;
		String getuserid;
	}

	class ResJson {
		int code;
		String msg;
		AllUserInfo.UserInfo data;
	}

}
