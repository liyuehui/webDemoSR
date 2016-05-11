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
import com.lee.bean.AllUserInfo;
import com.lee.bean.FriendListInfo;
import com.lee.bean.FriendListInfo.BannerInfo;
import com.lee.bean.FriendListInfo.UserSimpleInfo;
import com.lee.bean.ProjectDetailInfo;
import com.lee.bean.ProjectDetailInfo.CommentInfo;
import com.lee.bean.ProjectDetailInfo.DetailInfo;
import com.lee.bean.ProjectListInfo;
import com.lee.bean.ProjectListInfo.ProjcetSimpleInfo;
import com.lee.bean.SimpleResponse;
import com.lee.global.Global;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = {"/getproject_comment_info" })
public class getproject_comment_info extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getproject_comment_info() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		ProjectDetailInfo info = new ProjectDetailInfo();
		info.code = 1;
		
		List<CommentInfo> projectSimpleList = new ArrayList<CommentInfo>();
		for(int i = 0; i < 2; i++){
			CommentInfo simple = new CommentInfo();
			simple.comment = "该好好好好好好好好好";
			simple.portrait=AllUserInfo.ZhangHuiMei.portrait;
			simple.userid =AllUserInfo.ZhangHuiMei.userid;
			simple.userrealname =AllUserInfo.ZhangHuiMei.realname;
			projectSimpleList.add(simple);
		}
		info.comments = projectSimpleList;
		
		
		
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
