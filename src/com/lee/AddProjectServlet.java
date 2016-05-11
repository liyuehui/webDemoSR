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
@WebServlet(urlPatterns = { "/adduser_project","/addproject_commentinfo","/collect_project","/addproject_praise"
		,"/user_sendgroupmsg","/feedback","/adduser_info"})
public class AddProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddProjectServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String name = request.getParameter("name");
//		String introduce = request.getParameter("introduce");
//		String category = request.getParameter("category");
//		String industry = request.getParameter("industry");
//		String projectstage = request.getParameter("projectstage");
//		String financestage = request.getParameter("financestage");
//		String financescale = request.getParameter("financescale");
//		String city = request.getParameter("city");
//		String needresource = request.getParameter("needresource");
//		String mode = request.getParameter("mode");
		
		LoginResponse info = new LoginResponse();
		info.code = 1;
		info.msg = "提交成功";

//		System.err.println("adduser_project name:" + name+" introduce:"+introduce+" category:"+category+" industry:"+industry
//				+" projectstage:"+projectstage+" financestage:"+financestage+" financescale:"+financescale+" city:"+city+" needresource:"+
//				needresource+" mode:"+mode);

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
