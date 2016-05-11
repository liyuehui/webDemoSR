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
import com.lee.bean.FriendListInfo.UserSimpleInfo;
import com.lee.global.Global;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
//@WebServlet(urlPatterns = { "/getuser_keywords" })
//public class GetAllUsersByKeywordsServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public GetAllUsersByKeywordsServlet() {
//		super();
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		String keywords = request.getParameter("keywords");
//
//		FriendListInfo info = new FriendListInfo();
//		info.code = 1;
//		info.jiuyou = getJiuyou();
//		info.users = getUsers();
//		
//
//		System.err.println("getuser_keywords keywords " + keywords);
//
//		response.setCharacterEncoding("utf-8");
//		Gson gson = new Gson();
//		String str = gson.toJson(info);
//		response.getWriter().append(str);
//	}
//
//	//普通
//	private List<UserSimpleInfo> getUsers() {
//		List<UserSimpleInfo> list = new ArrayList<UserSimpleInfo>();
//		for (int i = 0; i < 5; i++) {
//			UserSimpleInfo info = new UserSimpleInfo();
//			info.city = "北京市";
//			info.realname = "Smith" + i;
//			info.userid = 69+i;
//			if (i == 0) {
//				info.portrait = Global.RequestURL + "default_icon.png";
//				info.type = "A";
//				info.userid = 5887;
//				info.commentname = "刘德华";
//				info.level = 1;
//			} else if (i == 10) {
//				info.portrait = Global.RequestURL + "default_icon.png";
//				info.type = "B";
//				info.commentname = "周润发";
//				info.level = 2;
//			} else if (i == 20) {
//				info.portrait = Global.RequestURL + "default_icon.png";
//				info.type = "C";
//				info.commentname = "周星驰";
//				info.level = 3;
//			} else if (i == 30) {
//				info.portrait = Global.RequestURL + "default_icon.png";
//				info.type = "D";
//				info.level = 1;
//			} else {
//				info.level = 2;
//				info.type = "";
//				info.portrait = "";
//				info.portrait = Global.RequestURL + "liutao.jpg";
//			}
//			list.add(info);
//		}
//		return list;
//	}
//
//	//久友
//	private List<UserSimpleInfo> getJiuyou() {
//		List<UserSimpleInfo> list = new ArrayList<UserSimpleInfo>();
//		
//			
//		UserSimpleInfo info1 = new UserSimpleInfo();
//		info1.city = "北京市";
//		info1.realname = "Smith1";
//		info1.userid = 1548;
//		info1.portrait = Global.RequestURL + "default_icon.png";
//		info1.type = "A";
//		info1.commentname = "刘德华";
//		info1.level = 1;
//		list.add(info1);
//		
//		UserSimpleInfo info12 = new UserSimpleInfo();
//		info12.city = "北京市";
//		info12.realname = "Smith1";
//		info12.userid = 1549;
//		info12.portrait = Global.RequestURL + "default_icon.png";
//		info12.type = "A";
//		info12.level = 1;
//		list.add(info12);
//		
//		UserSimpleInfo info13 = new UserSimpleInfo();
//		info13.city = "北京市";
//		info13.realname = "Smith1";
//		info13.userid = 1550;
//		info13.portrait = Global.RequestURL + "default_icon.png";
//		info13.type = "A";
//		info13.level = 1;
//		list.add(info13);
//		
//		return list;
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
