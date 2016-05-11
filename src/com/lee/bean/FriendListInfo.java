package com.lee.bean;

import java.io.Serializable;
import java.util.List;

public class FriendListInfo implements Serializable{
	
	public int code;
	public String msg;
	public List<UserSimpleInfo> jiuyou;
	public List<UserSimpleInfo> users;
	public List<BannerInfo> banners;
	
	public static class UserSimpleInfo implements Serializable{
		public String type;
		public String userid;
		public String imuserid;
		public String realname;
		public String level;
		public String portrait;
		public String city;
		
	}
	
	public static class BannerInfo implements Serializable{
		public String portrait;
		public String title;
		public String url;
	}
}
