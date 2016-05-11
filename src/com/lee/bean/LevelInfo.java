package com.lee.bean;

import java.io.Serializable;
import java.util.List;

public class LevelInfo implements Serializable{
	public int code;
	public String msg;
	public List<LevelDetailInfo> list;
	
	public static class LevelDetailInfo{
		public String level;
		public String needContent;
		public String function;
	}
}
