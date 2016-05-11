package com.lee.bean;

import java.io.Serializable;
import java.util.List;

public class ProjectDetailInfo implements Serializable {

	public int code;
	public String msg;
	public DetailInfo project;
	public List<CommentInfo> comments;

	public static class DetailInfo implements Serializable {
		public String projectid;
		public String projectname;
		public String introduce;
		public String projectcategory;
		public String projectindustry;
		public String projectstage;
		public String financescale;
		public String financestage;
		public String projectcity;
		public String needresource;
		public String mode;
		public String createtime;

		public String createuserid;
		public String createuserrealname;
		public String createUsercommentname;
		public String createusercity;
		public String createuserportrait;
		public String createuserlevel;
		public String createusergender;
		public int praisenum;
	}

	public static class CommentInfo implements Serializable {
		public String userid;
		public String userrealname;
		public String usercommentname;
		public String portrait;
		public String comment;
	}

}
