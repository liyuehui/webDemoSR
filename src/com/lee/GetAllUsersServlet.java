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
import com.lee.bean.SimpleResponse;
import com.lee.global.Global;

/**
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/getalluser","/getuser_keywords" })
public class GetAllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetAllUsersServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FriendListInfo info = new FriendListInfo();
		info.code = 1;
		info.users = getUsers();

		response.setCharacterEncoding("utf-8");

		Gson gson = new Gson();
		String str = gson.toJson(info);

		response.getWriter().append(str);
	}

	//
	private List<UserSimpleInfo> getUsers() {
		List<UserSimpleInfo> list = new ArrayList<UserSimpleInfo>();
		for (int i = 0; i < 5; i++) {
			UserSimpleInfo info = new UserSimpleInfo();
			info.city = AllUserInfo.LiuDeHua.city;
			info.realname = AllUserInfo.LiuDeHua.realname;
			info.userid = AllUserInfo.LiuDeHua.userid;
			info.level = AllUserInfo.LiuDeHua.level;
			info.portrait = AllUserInfo.LiuDeHua.portrait;
			info.imuserid = AllUserInfo.LiuDeHua.imuserid;
			if (i == 0) {
				info.type = "A";
			} else if (i == 1) {
				info.type = "B";
			} else if (i == 2) {
				info.type = "C";
			} else if (i == 3) {
				info.type = "D";
			} else {
				info.type = "E";
			}
			list.add(info);
		}
		
		for (int i = 0; i < 5; i++) {
			UserSimpleInfo info = new UserSimpleInfo();
			info.city = AllUserInfo.GaoYuanYuan.city;
			info.realname = AllUserInfo.GaoYuanYuan.realname;
			info.userid = AllUserInfo.GaoYuanYuan.userid;
			info.level = AllUserInfo.GaoYuanYuan.level;
			info.portrait = AllUserInfo.GaoYuanYuan.portrait;
			info.imuserid = AllUserInfo.GaoYuanYuan.imuserid;
			if (i == 0) {
				info.type = "F";
			} else if (i == 1) {
				info.type = "G";
			} else if (i == 2) {
				info.type = "H";
			} else if (i == 3) {
				info.type = "I";
			} else {
				info.type = "J";
			}
			list.add(info);
		}
		
		for (int i = 0; i < 5; i++) {
			UserSimpleInfo info = new UserSimpleInfo();
			info.city = AllUserInfo.ZhangHuiMei.city;
			info.realname = AllUserInfo.ZhangHuiMei.realname;
			info.userid = AllUserInfo.ZhangHuiMei.userid;
			info.level = AllUserInfo.ZhangHuiMei.level;
			info.portrait = AllUserInfo.ZhangHuiMei.portrait;
			info.imuserid = AllUserInfo.ZhangHuiMei.imuserid;
			if (i == 0) {
				info.type = "K";
			} else if (i == 1) {
				info.type = "L";
			} else if (i == 2) {
				info.type = "M";
			} else if (i == 3) {
				info.type = "Z";
			} else {
				info.type = "#";
			}
			list.add(info);
		}
		return list;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
