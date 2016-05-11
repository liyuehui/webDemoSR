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
import com.lee.bean.LevelInfo;
import com.lee.bean.LevelInfo.LevelDetailInfo;
import com.lee.bean.ProjectListInfo;
import com.lee.bean.ProjectListInfo.ProjcetSimpleInfo;
import com.lee.bean.SimpleResponse;
import com.lee.global.Global;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/get_level_info" })
public class GetLevelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetLevelInfoServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String flag = request.getParameter("flag");
		System.err.println("get_level_info" );

		LevelInfo info = new LevelInfo();
		info.code = 1;
		List<LevelDetailInfo> list = new ArrayList<LevelDetailInfo>();
		for(int i = 0; i < 3;i++){
			LevelDetailInfo detailInfo = new LevelDetailInfo();
			if(i == 0){
				detailInfo.level="A级";
				detailInfo.needContent="姓名、手机号、邮箱";
				detailInfo.function = "推送信息2条";
			}else if(i == 1){
				detailInfo.level="B级";
				detailInfo.needContent="性别、昵称、头像、所在机构（单位）、职位、所在城市、工作地点、所属行业";
				detailInfo.function = "推送信息5条";
			}else if(i == 2){
				detailInfo.level="C级";
				detailInfo.needContent="工作经历，教育经历、微博、QQ、核心资源";
				detailInfo.function = "推送信息不限，创建群组，查看久友邮箱和手机号";
			}
			list.add(detailInfo);
		}
		info.list = list;

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
