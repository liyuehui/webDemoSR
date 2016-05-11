package com.lee.bean;

import java.io.Serializable;
import java.util.List;

public class ProjectListInfo implements Serializable{
	
	public int code;
	public String msg;
	public List<ProjcetSimpleInfo> projects;
	
	
	public static class ProjcetSimpleInfo implements Serializable{
		public String projectid;
		public String projectname;
		public String projectcategory;
		public String financescale;
		public String needresource;
		public String industry;
		public String projectstage;
		
		public String createuserid;
		public String createuserrealname;
		public String createUserCommentName;
		public String createuserlevel;
		public String createusergender;
		public String createusercity;
		public String createuserportrait;
		public String createtime;
		public String praisenum;
		public String commentnum;
		public String status;
	}
	
}
