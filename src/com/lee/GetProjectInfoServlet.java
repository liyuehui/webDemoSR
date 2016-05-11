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
@WebServlet(urlPatterns = {"/getproject_info" })
public class GetProjectInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetProjectInfoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		ProjectDetailInfo info = new ProjectDetailInfo();
		info.code = 1;
		
//		List<CommentInfo> projectSimpleList = new ArrayList<CommentInfo>();
//		for(int i = 0; i < 5; i++){
//			CommentInfo simple = new CommentInfo();
//			simple.comment = "agage该好好好好好好好好好好好好好好好好好好好好好好好好好好好好好好";
//			simple.portrait="http://133.130.102.178:8080/jiuyou/liutao.jpg";
//			simple.userid ="152";
//			simple.userrealname ="谢霆锋";
//			projectSimpleList.add(simple);
//		}
//		info.mProjectCommentList = projectSimpleList;
		
		
		DetailInfo detail = new DetailInfo();
		detail.createtime = "2014年10月3日";
		detail.createusercity=AllUserInfo.ZhangHuiMei.city;
		detail.createUsercommentname = "";
		detail.createusergender ="男";
		detail.createuserid = AllUserInfo.ZhangHuiMei.userid;
		detail.createuserlevel = "2";
		detail.createuserportrait = AllUserInfo.ZhangHuiMei.portrait;
		detail.createuserrealname=AllUserInfo.ZhangHuiMei.realname;
		detail.financescale="五亿以上";
		detail.financestage ="A轮";
		detail.introduce="这是个非常牛逼的项目";
		detail.mode = "融资方的费用标准";
		detail.needresource ="资金";
		detail.praisenum = 100;
		detail.projectcategory = "国内一级";
		detail.projectcity="纽约";
		detail.projectid = "1225";
		detail.projectindustry="IT";
		detail.projectname="找融资的项目";
		detail.projectstage="筹备中";
		info.project = detail;
		
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
