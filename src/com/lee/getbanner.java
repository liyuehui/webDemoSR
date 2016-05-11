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
import com.lee.bean.SimpleResponse;
import com.lee.global.Global;

/**
 * 
 * Servlet implementation class MyServlet
 * 
 */
@WebServlet(urlPatterns = { "/getbanner" })
public class getbanner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getbanner() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FriendListInfo info = new FriendListInfo();
		info.code = 1;
		info.banners = getBannerInfo();

		response.setCharacterEncoding("utf-8");

		Gson gson = new Gson();
		String str = gson.toJson(info);

		response.getWriter().append(str);
	}

	private List<BannerInfo> getBannerInfo() {
		ArrayList<BannerInfo> list = new ArrayList<BannerInfo>();
		FriendListInfo.BannerInfo ban = new FriendListInfo.BannerInfo();
		ban.portrait = "http://app.jiuyoucapital.com.cn//upload//201602//22//1456107005_3239.jpg";
		ban.title = "投融咖";
		ban.url = "http://app.jiuyoucapital.com.cn//index.php//admin//headlineinfo//index.html?bannerid=24";
		list.add(ban);
		return list;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
