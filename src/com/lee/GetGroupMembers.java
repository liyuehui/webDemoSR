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
import com.lee.bean.TribeMemberInfo;
import com.lee.bean.TribeMemberInfo.MemberInfo;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = {"/get_group_members"})
public class GetGroupMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetGroupMembers() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tribeid = request.getParameter("tribeid");
		
		System.err.println("get_group_members tribeid "+ tribeid);
		
		response.setCharacterEncoding("utf-8");
		
		TribeMemberInfo res = new TribeMemberInfo();
		
		res.code = 1;
		res.tribename = "这是那个群组";
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		
		for(int i = 0; i< 100;i++){
			MemberInfo info  = new MemberInfo();
			info.userid = "56542";
			info.level = 2;
			info.portrait = "https://webjs.ww.taobao.com/generate/tribe/picture/tribev6_picture_default_taobao.gif";
			list.add(info);
		}
		
		res.members = list;
		
		Gson gson = new Gson();
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
