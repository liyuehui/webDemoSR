package com.lee.bean;

public class LoginResponse {
	public int code;
	public String msg;
	public Data data;
	
	
	public static class Data{
		public String userid;
		public String level;
		public String imuserid;
		public String impassword;
	}
}
