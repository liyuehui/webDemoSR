package com.lee.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.lee.bean.GroupInfo;
import com.lee.bean.UserGroup;
import com.lee.bean.UserInfo;
import com.lee.dao.DataDao;
import com.lee.dao.DatabaseConnection;

public class TestDB {
	
	@Test
	public void testInsert(){
		UserInfo user = new UserInfo();
		user.setIntroduce("个人");
		user.setMail("ly@qq.com");
		user.setPassword("all");
		user.setPhone(186541715);
		user.setPortrait("http://");
		user.setRegdate("2015");
		user.setSex("男");
		user.setStatus(1);
		user.setToken("");
		user.setUserid(102);
		user.setUsername("nicheng");
		 
		GroupInfo group = new GroupInfo();
		group.setCreat_datetime("20150");
		group.setCreate_user_id(100);
		group.setGroupid(206);
		group.setGroupname("Gname");
		group.setIntroduce("");
		group.setMax_number(200);
		group.setNumber(1);
		group.setPortrait("http://");
		group.setStatus(1);
		 
		UserGroup ug = new UserGroup();
		ug.setGroupid(200);
		ug.setUserid(101);
		
		
		//String sql = "insert into user_infos(userid,username,portrait,status,token,regdate,sex,introduce,mail,phone,password) values(101,'nicheng','http://"
		//		+ "',1,'token','2015','男','desc','aag@qq.cm',158,'agagag')";
	//			String sql = "select * from user_infos";
//		Connection conn = new DatabaseConnection().getConn();
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet set = pstmt.executeQuery();
////			while(set.next()){
////				set.getString(columnIndex)
////			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		DataDao dao = new DataDao();
		dao.insert(UserInfo.class, user);
//		dao.insert(GroupInfo.class, group);
//		dao.insert(UserGroup.class, ug);
	}
	
	@Test
	public void testDelet(){
		UserInfo user = new UserInfo();
		user.setUserid(101);
		DataDao dao = new DataDao();
		
		GroupInfo group = new GroupInfo();
		group.setGroupid(206);
		
		UserGroup ug = new UserGroup();
		ug.setGroupid(200);
		ug.setUserid(101);
		
		//dao.delete(UserInfo.class,user,"userid");
		//dao.delete(GroupInfo.class,group,"groupid");
		dao.delete(UserGroup.class,ug,"groupid");
	}
	
	@Test
	public void testUpdate(){
		UserInfo user = new UserInfo();
		user.setUserid(102);
		user.setUsername("liyuhuie");
		
		DataDao dao = new DataDao();
		dao.update(UserInfo.class,user,"userid");
		
	}
	
	@Test
	public void testQuery(){
		DataDao dao = new DataDao();
//		List list =  dao.query(UserInfo.class);
		List list =  dao.query(GroupInfo.class);
		System.err.println(list.size());
		for(int i = 0; i < list.size();i++){
			System.err.println(list.get(i).toString());
		}
	}
	
	@Test
	public void testIsExist(){
		UserInfo user = new UserInfo();
		user.setUserid(102);
		
		DataDao dao = new DataDao();
		int i = dao.isExitByID(UserInfo.class,user,"userid");
		System.err.println(" is exist "+ i);
	}
}
