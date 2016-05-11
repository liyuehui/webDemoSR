package com.lee.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 群信息
 * 
 * @author LYH
 *
 */
public class TribeMemberInfo implements Serializable {

	public int code;
	public String msg;
	public String tribename;
	public List<MemberInfo> members;
	
	public static class MemberInfo{
		public String userid;
		public int level;
		public String portrait;
	}

}
