package com.lee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private final String DBDriver= "com.mysql.jdbc.Driver";
	private final String DBURL = "jdbc:mysql://localhost:3306/jiuyou?characterEncoding=UTF-8";
	private final String DBUSER = "root";
	private final String DBPASS = "lyh1988";
	private Connection conn = null;
	
	public DatabaseConnection(){
		try {
			Class.forName(DBDriver);
			this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn(){
		return conn;
	}
	
	public void closeDB(){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
