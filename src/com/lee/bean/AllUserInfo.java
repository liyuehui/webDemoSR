package com.lee.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllUserInfo implements Serializable{
	static {
		UserInfo liudehua = new UserInfo();
		liudehua.userid = "18611629603";
		liudehua.city = "北京";
		liudehua.latitude = "40.014549";
		liudehua.longitude = "116.347766";
		liudehua.portrait = "http://g.hiphotos.baidu.com/baike/c0%3Dbaike116%2C5%2C5%2C116%2C38/sign=a5c50479484a20a425133495f13bf347/2934349b033b5bb52f397c9531d3d539b700bceb.jpg";
		liudehua.impassword="liudehua";
		liudehua.imuserid="liudehua";
		liudehua.realname="刘德华";
		liudehua.password = "123456";
		liudehua.level = "1";
		liudehua.gender = "男";
		liudehua.mobileno = "18611629603";
		liudehua.email = "liudehua@gmail.com";
		liudehua.nickname = "liudehua";
		liudehua.company = "Google";
		liudehua.position="CEO";
		liudehua.industry = "金融，IT";
		liudehua.workaddress ="海淀区上地科贸大厦407";
		liudehua.investstage = "天使,VC，PE，并购，定增";
		liudehua.investscale = "100万至3000万，3000万至5000万";
		liudehua.favcategory = "国内一级，国内二级";
		liudehua.provideresource = "资金，法务";
		liudehua.weibo = "weibo";
		liudehua.weixin = "weixin";
		liudehua.QQ = "154545";
		
		liudehua.workhistory = new ArrayList<workhistory>();
		workhistory w1 = new workhistory();
		w1.begintime = "1996.8";
		w1.endtime = "2000.2";
		w1.company = "Oracle";
		w1.position = "CTO";
		liudehua.workhistory.add(w1);
		
		liudehua.studyhistory = new ArrayList<studyhistory> ();
		studyhistory s = new studyhistory();
		s.begintime ="1996.8";
		s.endtime = "2000.2";
		s.school = "北京大学";
		s.major = "计算机";
		s.minor = "计算机";
		s.degree = "学士";
		liudehua.studyhistory.add(s);
		LiuDeHua = liudehua;
		
		UserInfo gaoyuanyuan = new UserInfo();
		gaoyuanyuan.userid = "1";
		gaoyuanyuan.impassword="gaoyuanyuan";
		gaoyuanyuan.imuserid="gaoyuanyuan";
		gaoyuanyuan.city = "北京";
		gaoyuanyuan.latitude = "40.114549";
		gaoyuanyuan.longitude = "116.447766";
		gaoyuanyuan.portrait = "http://d.ifengimg.com/mw978_mh598/y1.ifengimg.com/a/2016_17/79063502d6034f3.jpg";
		gaoyuanyuan.realname="高圆圆";
		gaoyuanyuan.gender = "女";
		gaoyuanyuan.level="1";
		gaoyuanyuan.mobileno = "18254171516";
		gaoyuanyuan.email = "gaoyuanyuan@gmail.com";
		gaoyuanyuan.nickname = "gaoyuanyuan";
		gaoyuanyuan.company = "sina";
		gaoyuanyuan.position = "CTO";
		gaoyuanyuan.industry = "金融，IT";
		gaoyuanyuan.workaddress ="海淀区上地科贸大厦407";
		gaoyuanyuan.investstage = "天使,VC，PE，并购，定增";
		gaoyuanyuan.investscale = "100万至3000万，3000万至5000万";
		gaoyuanyuan.favcategory = "国内一级，国内二级";
		gaoyuanyuan.provideresource = "资金，法务";
		gaoyuanyuan.weibo = "weibo";
		gaoyuanyuan.weixin = "weixin";
		gaoyuanyuan.QQ = "154545";
		
		gaoyuanyuan.workhistory = new ArrayList<workhistory>();
		workhistory w = new workhistory();
		w.begintime = "1996.8";
		w.endtime = "2000.2";
		w.company = "Oracle";
		w.position = "CTO";
		gaoyuanyuan.workhistory.add(w);
		
		gaoyuanyuan.studyhistory = new ArrayList<studyhistory> ();
		gaoyuanyuan.studyhistory.add(s);
		
		GaoYuanYuan = gaoyuanyuan;
		
		UserInfo zhanghuimei = new UserInfo();
		zhanghuimei.userid = "2";
		zhanghuimei.impassword="zhanghuimei";
		zhanghuimei.imuserid="zhanghuimei";
		zhanghuimei.city = "北京";
		zhanghuimei.latitude = "40.114549";
		zhanghuimei.longitude = "116.547766";
		zhanghuimei.portrait = "http://f.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=89992cd9d188d43fe4a499a01c77b97e/42166d224f4a20a433b9b76b97529822730ed0f3.jpg";
		zhanghuimei.realname = "张惠妹";
		zhanghuimei.gender = "女";
		zhanghuimei.level = "1";
		zhanghuimei.mobileno = "15846521548";
		zhanghuimei.email = "zhanghuimei@qq.com";
		zhanghuimei.nickname=  "zhanghuimei";
		zhanghuimei.company = "baidu";
		zhanghuimei.position = "COO";
		zhanghuimei.industry ="金融，IT";
		zhanghuimei.workaddress ="海淀区上地科贸大厦407";
		zhanghuimei.investstage = "天使,VC，PE，并购，定增";
		zhanghuimei.investscale = "100万至3000万，3000万至5000万";
		zhanghuimei.favcategory = "国内一级，国内二级";
		zhanghuimei.provideresource = "资金，法务";
		zhanghuimei.weibo = "weibo";
		zhanghuimei.weixin = "weixin";
		zhanghuimei.QQ = "154545";
		zhanghuimei.workhistory = new ArrayList<workhistory>();
		workhistory w2 = new workhistory();
		w2.begintime = "1996.8";
		w2.endtime = "2000.2";
		w2.company = "Oracle";
		w2.position = "CTO";
		zhanghuimei.workhistory.add(w2);
		
		zhanghuimei.studyhistory = new ArrayList<studyhistory>();
		
		zhanghuimei.studyhistory.add(s);
		
		ZhangHuiMei = zhanghuimei;
		
	}
	
	public static UserInfo LiuDeHua;
	public static UserInfo GaoYuanYuan;
	public static UserInfo ZhangHuiMei;
	
	public static class UserInfo{
		public String imuserid;
		public String impassword;
		public String userid;
		public String city;
		public String latitude;
		public String longitude;
		public String portrait;
		public String realname;
		public String password;
		public String level;
		public String gender;
		public String mobileno;
		public String email;
		public String nickname;
		public String company;
		public String position;
		public String industry;
		public String workaddress;
		public String investstage;
		public String investscale;
		public String favcategory;
		public String provideresource;
		public String weibo;
		public String weixin;
		public String QQ;
		
		public ArrayList<workhistory> workhistory;
		public ArrayList<studyhistory> studyhistory;
	}
	
	public static class workhistory{
		public String company;
		public String begintime;
		public String endtime;
		public String position;
	}

	public static class studyhistory{
		public String school;
		public String begintime;
		public String endtime;
		public String major;
		public String minor;
		public String degree;
	}
}
