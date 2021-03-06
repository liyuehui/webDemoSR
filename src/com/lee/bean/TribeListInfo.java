package com.lee.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 群信息
 * 
 * @author LYH
 *
 */
public class TribeListInfo implements Serializable {

	public int code;
	public List<TribeInfo> groups;
	
	public static class TribeInfo{
		public String tribeid;
		public String tribename;
		public String portrait;
	}

}
