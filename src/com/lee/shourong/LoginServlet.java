package com.lee.shourong;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lee.bean.AllUserInfo;
import com.lee.bean.LoginResponse;
import com.lee.shourong.LoginServlet.BannerResBean.BannerInfo;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/shourong/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String reqjson = request.getParameter("reqjson");
		System.err.println(" reqjson:"+reqjson);
		Gson gson = new Gson();
		reqJSonObj req = gson.fromJson(reqjson, reqJSonObj.class);
		BannerResBean res = new BannerResBean();
		response.setCharacterEncoding("utf-8");
		res.resultcode = "1";
		ArrayList<BannerInfo> list = new ArrayList<BannerInfo>();
		BannerInfo info = new BannerInfo();
		info.bannerImgPath ="https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1462799586&di=9441064f60b7db62a93b29635ee4b069&src=http://pic12.nipic.com/20101229/5123760_234026985000_2.jpg";
		list.add(info);
//		
		BannerInfo info1 = new BannerInfo();
		info1.bannerImgPath ="http://img.baizhan.net/uploads/allimg/160425/21_160425142633_1.jpg";
		list.add(info1);
		
		res.data = list;
		String str = gson.toJson(res);
		response.getWriter().append(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	class reqJSonObj{
		String mobileno;
		String password;
	}
	
	public static class BannerResBean {
        public String resultcode;
        public String msg;
        public ArrayList<BannerInfo> data;

        public static class BannerInfo {
            public String bannerImgPath;
            public String href;
        }
    }
	
}
