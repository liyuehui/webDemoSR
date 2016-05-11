package com.lee;

import java.io.BufferedReader;
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

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lee.util.AlgorithmUtil;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	private static final String APPKEY = "RC-App-Key";
	private static final String NONCE = "RC-Nonce";
	private static final String TIMESTAMP = "RC-Timestamp";
	private static final String SIGNATURE = "RC-Signature";

	private static String tokenUri = "https://api.cn.ronghub.com/user/getToken.json";
	private static String appKey = "cpj2xarljexin";
	private static String appSecret = "bnvOnvuLA233";

	private static  PrintWriter out;
	private static BufferedReader in;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			System.err.println("cookies size " + cookies.length + " content " + cookies[0].getValue());
		} else {
			Cookie cookie = new Cookie("SESSIONID", System.currentTimeMillis() + ""); // (key,value)
			// cookie.setPath("/");// 这个要设置
			// cookie.setDomain(".aotori.com");//这样设置，能实现两个网站共用
			// cookie.setMaxAge(365 * 24 * 60 * 60);//
			// 不设置的话，则cookies不写入硬盘,而是写在内存,只在当前页面有用,以秒为单位
			response.addCookie(cookie);
		}

		String requestType = request.getParameter("requestType");
		if ("register".equals(requestType)) {
			String usernameLogon = request.getParameter("phone");
			String passwordLogon = request.getParameter("pass");
			System.err.println("requestType "+requestType+"phone " + usernameLogon + " pass " + passwordLogon);
		}

		//String ret = getTokenFromRong("aklg", "aga", "http://img211.poco.cn/food_cookbook/201106/223348.jpg");
		//response.getWriter().print(ret);

	}

	public static String getTokenFromRong(String userId, String name, String portraitUri) {
		String result = "";// 要返回的json数据
		try {
			String nonce = String.valueOf(Math.random() * 1000000);
			String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
			StringBuilder toSign = new StringBuilder(appSecret).append(nonce).append(timestamp);
			String sign = AlgorithmUtil.SHA1(toSign.toString());

			URL url = new URL(tokenUri);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setUseCaches(false);
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setInstanceFollowRedirects(true);
			conn.setConnectTimeout(30000);
			conn.setReadTimeout(30000);

			conn.setRequestProperty(APPKEY, appKey);
			conn.setRequestProperty(NONCE, nonce);
			conn.setRequestProperty(TIMESTAMP, timestamp);
			conn.setRequestProperty(SIGNATURE, sign);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			// out.print("userId=jlk456j5&name=Ironman&portraitUri=http%3A%2F%2Fabc.com%2Fmyportrait.jpg");
			out.print(getPostBody(userId, name, portraitUri));
			// flush输出流的缓冲
			out.flush();

			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("reuslt " + result);
		return result;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	// body生成
	public static String getPostBody(String userId, String name, String portraitUri) {
		StringBuilder sb = new StringBuilder();
		sb.append("userId=");
		sb.append(userId + "&");
		sb.append("name=");
		sb.append(name + "&");
		sb.append("portraitUri=");
		if (portraitUri == null || portraitUri == "") {
		} else {
			try {
				sb.append(URLEncoder.encode(portraitUri, "utf-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		System.out.println("body " + sb.toString());
		return sb.toString();
	}
}
