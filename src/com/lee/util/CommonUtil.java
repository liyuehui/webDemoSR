package com.lee.util;

import java.text.SimpleDateFormat;

public class CommonUtil {
	public static String getTime(long mil){
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		return sdf.format(mil);
	}
}
