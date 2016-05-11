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
import com.lee.bean.ProjectListInfo;
import com.lee.bean.ProjectListInfo.ProjcetSimpleInfo;
import com.lee.bean.SimpleResponse;
import com.lee.global.Global;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/getcollect_project" })
public class getcollect_project extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getcollect_project() {
		super();
	}

	public static final String[] Money_Scale = new String[] { "不限", "3000万到5000万", "5000万到一亿", "一亿到三亿", "三亿到五亿", "五亿以上",
			"十亿以上" };
	// 行业
	public static final String[] Industry_Indicator = new String[] { "不限", "互联网", "云计算", "网络信息安全", "消费", "资源能源", "游戏",
			"文化娱乐", "媒体资讯", "O2O", "大数据", "企业服务", "教育培训", "电子商务", "金融", "旅游", "汽车", "房地产", "智能硬件", "社交", "医疗健康", "软件工具",
			"招聘", "物流", "新能源与环保", "高端制造", "生物医药", "农业", "其它" };
	// 类别
	public static final String[] Category_Indicator = new String[] { "不限", "国内一级", "国内二级", "海外投资", "新三板", "天使", "VC",
			"PE", "定增", "并购", "壳资源", "阳光私募/公募", "求职与招聘", "平台及项目合作", "其他", };

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		ProjectListInfo info = new ProjectListInfo();
		info.code = 1;
		List<ProjcetSimpleInfo> projectSimpleList = new ArrayList<ProjcetSimpleInfo>();
		getScale(projectSimpleList);
		info.projects = projectSimpleList;

		response.setCharacterEncoding("utf-8");

		Gson gson = new Gson();
		String str = gson.toJson(info);

		response.getWriter().append(str);
	}

	private void getScale(List<ProjcetSimpleInfo> projectSimpleList) {
		for (int j = 0; j < Money_Scale.length; j++) {
				ProjcetSimpleInfo simple = new ProjcetSimpleInfo();
				simple.projectid = "1045";
				simple.projectname = "项目" + j;
				simple.projectcategory = "国内一级";
				simple.financescale = Money_Scale[j];
				simple.createuserlevel = AllUserInfo.ZhangHuiMei.level;
				simple.createusergender = AllUserInfo.ZhangHuiMei.gender;
				simple.createuserid = AllUserInfo.ZhangHuiMei.userid;
				simple.createuserrealname = AllUserInfo.ZhangHuiMei.realname;
				simple.createusercity = AllUserInfo.ZhangHuiMei.city;
				simple.createuserportrait =  AllUserInfo.ZhangHuiMei.portrait;
				simple.needresource = "法律，资金";
				simple.createtime = "2015年11月2日  15:05";
				simple.praisenum = "56";
				simple.commentnum = "156";
				simple.projectstage = "A轮";
				projectSimpleList.add(simple);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
