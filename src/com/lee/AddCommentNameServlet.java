package com.lee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.FriendListInfo;
import com.lee.bean.FriendListInfo.BannerInfo;
import com.lee.bean.FriendListInfo.UserSimpleInfo;
import com.lee.bean.LoginResponse;
import com.lee.bean.SimpleResponse;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/adduser_comment_name" })
public class AddCommentNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddCommentNameServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//request.getSession().setAttribute(arg0, arg1);
		String userid = request.getParameter("userid");
		String comment = request.getParameter("comment");
		
		LoginResponse info = new LoginResponse();
		info.code = 1;
		info.msg = "备注姓名提交成功";

		System.err.println("adduser_comment_name userid " + userid+" comment "+comment);

		response.setCharacterEncoding("utf-8");

		Gson gson = new Gson();
		String str = gson.toJson(info);

		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
