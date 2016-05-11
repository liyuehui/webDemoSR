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
 * Servlet implementation class
 * 
 */
@WebServlet(urlPatterns = { "/adduser_create_group" })
public class AddGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddGroupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tribename = request.getParameter("tribename");
		String users = request.getParameter("users");
		
		LoginResponse info = new LoginResponse();
		info.code = 1;
		info.msg = "建群成功";

		System.err.println("adduser_create_group tribename " + tribename+" users "+users);

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
