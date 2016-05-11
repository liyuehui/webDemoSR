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
import com.lee.bean.FavCategoryInfo;
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
@WebServlet(urlPatterns = { "/getuser_favcategory" })
public class GetUserFavCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetUserFavCategoryServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String tribename = request.getParameter("tribename");
//		String users = request.getParameter("users");
		
		FavCategoryInfo info = new FavCategoryInfo();
		info.code = 1;
		info.favcategory = "国内一级,国内二级,求职与招聘";
		
		

		System.err.println("getuser_favcategory ");

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
