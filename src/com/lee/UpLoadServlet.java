package com.lee;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.lee.bean.ResultInfo;
import com.lee.bean.UserInfo;
import com.lee.dao.DataDao;
import com.lee.util.AlgorithmUtil;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet(urlPatterns = {"/adduser_info"})
//public class UpLoadServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public UpLoadServlet() {
//		super();
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		Cookie[] cookies = request.getCookies();
////		if (cookies != null) {
////			System.err.println("cookies size " + cookies.length + " content " + cookies[0].getValue());
////		} else {
////			Cookie cookie = new Cookie("SESSIONID", System.currentTimeMillis() + ""); // (key,value)
////			response.addCookie(cookie);
////		}
//		try {
//			DiskFileItemFactory factory = new DiskFileItemFactory();
//			ServletFileUpload upload = new ServletFileUpload(factory);
//			List<FileItem> list = upload.parseRequest(request);
//			HashMap<String, String> paramMap = new HashMap<String, String>();
//			for (FileItem item : list) {
//				String paramName = item.getFieldName();
//				System.out.println(paramName);
//				String paramValue = item.getString();
//				System.out.println(paramValue);
//				paramMap.put(paramName, paramValue);
//				if (item.isFormField() == false) {
//					File f = new File("d:\\img.jpg");
//					item.write(f);
//					//System.out.println("write filt success");
//					System.out.println( " list " + list.size());
//				}
//			}
//
//			if ("register".equals(paramMap.get("requestType"))) {
//				toReg(response,paramMap);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void toReg(HttpServletResponse response, HashMap<String, String> paramMap) {
//		String phone = paramMap.get("phone").trim();
//		String pass = paramMap.get("pass");
//		
//		System.err.println("uploadeServlet phone = "+ phone+" pass ="+pass);
//		DataDao dao = new DataDao<UserInfo>();
//		UserInfo info = new UserInfo();
//		long p = Long.parseLong(phone);
//		info.setUserid(p);
//		int ret = dao.isExitByID(UserInfo.class, info, "userid");
//		//注册不成功
//		if(ret > 0){ 
//			try {
//				ResponseInfo res = new ResponseInfo("100","usename is exist");
//				Gson gson = new Gson();
//				
//				response.getWriter().write(gson.toJson(res));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		//注册成功
//		}else{ 
//			info.setPassword(pass);
//			info.setUsername("NC:"+phone);
//			String token = MyServlet.getTokenFromRong(phone, "NC:"+phone, null);
//			ResultInfo ri;
//			//info.setToken(token);
//			if(token != null || !"".equals(token)){
//				Gson gson = new Gson();
//				ri= gson.fromJson(token,ResultInfo.class);
//				System.err.println("token is "+token);
//				info.setToken(ri.token);
//			}else{
//				
//				System.err.println("token is null");
//			}
//			int i = dao.insert(UserInfo.class, info);
//			if(i > 0){
//					try {
//						response.getWriter().write(token);
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//			}
//		}
//
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//	
//	static class  ResponseInfo{
//		ResponseInfo(String code,String message){
//			this.code = code;
//			this.message = message;
//		}
//		public String code;
//		public String message;
//	}
//}
