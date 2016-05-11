package com.lee.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataDao<T> {

	private String getTableByClass(Class<T> classInstace) {
		String uf = classInstace.getName();
		// System.out.println("getTableByClass():"+uf);
		String ret = null;
		if (uf.equals("com.lee.bean.UserInfo")) {
			ret = "user_infos";
		}
		if (uf.equals("com.lee.bean.GroupInfo")) {
			ret = "group_infos";
		}
		if (uf.equals("com.lee.bean.UserGroup")) {
			ret = "user_group";
		}
		return ret;
	}

	/**
	 * 查询
	 * 
	 * @param classInstace
	 * @return
	 */
	public List<T> query(Class<T> classInstace) {
		String queryStr = "select * from " + getTableByClass(classInstace);
		System.out.println("queryster:" + queryStr);

		Connection conn = new DatabaseConnection().getConn();
		PreparedStatement pstmt;
		ResultSet rs = null;
		List<T> list = new ArrayList<T>();
		try {

			pstmt = conn.prepareStatement(queryStr);
			rs = pstmt.executeQuery();
			T ins = null;
			Field[] fs = null;

			while (rs.next()) {
				try {
					ins = classInstace.newInstance();
					fs = ins.getClass().getDeclaredFields();
				} catch (InstantiationException | IllegalAccessException e1) {
					e1.printStackTrace();
				}
				for (int i = 0; i < fs.length; i++) {
					try {
						Field f = fs[i];
						f.setAccessible(true);
						System.out.println("type name:" + f.getType().getName());
						if (f.getType().getName().equals("int")) {
							// System.out.println(" mitch");
							f.set(ins, rs.getInt(i + 1));
						} else {
							f.set(ins, rs.getString(i + 1));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				list.add(ins);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 插入
	 * 
	 * @param instance
	 * @param obj
	 * @return
	 */
	public int insert(Class<T> instance, T obj) {

		String insertStr = "insert into " + this.getTableByClass(instance) + "(";
		String values = " values(";

		Field[] fs = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			// System.out.println(" insert
			// fs.length:"+fs.length+fs[i].toString());
			Field f = fs[i];
			f.setAccessible(true);
			insertStr += f.getName();
			try {
				if (f.get(obj) == null) {
					values += "null";
				} else {
					if (f.getType().getName().equals("int")) {
						values += f.get(obj).toString();
					} else {
						values += "'" + f.get(obj) + "'";
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			if (i != fs.length - 1) {
				insertStr += ",";
				values += ",";
			}
		}

		values += ")";
		insertStr += ")";

		System.out.println(" insertStr:" + insertStr + values);

		Connection conn = new DatabaseConnection().getConn();
		PreparedStatement pstmt;

		int i;
		try {
			pstmt = conn.prepareStatement(insertStr + values);
			i = pstmt.executeUpdate();
			System.out.println("insert ret :" + i);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * 跟新
	 * @param classInstance
	 * @param obj
	 * @param where
	 * @return
	 */
	
	public int update(Class<T> classInstance, T obj, String where) {
		String updateStr = "update " + this.getTableByClass(classInstance) + " set ";
		Field[] fs = obj.getClass().getDeclaredFields();
		try {
			for (int i = 0; i < fs.length; i++) {
				Field f = fs[i];
				if (f.getName().equals(where))
					continue;
				f.setAccessible(true);
				// System.out.println(" update:"+f.getName());
				if (f.get(obj) != null || f.get(obj) != "") {
					updateStr += f.getName() + " = ";
					if (f.getType().getName().equals("int")) {
						updateStr += f.get(obj) + " ";
					} else {
						updateStr += " '" + f.get(obj) + "' ";
					}
				}
				if (i != fs.length - 1) {
					updateStr += ",";
				}
			}
			Field f = obj.getClass().getDeclaredField(where);
			f.setAccessible(true);
			updateStr += " where " + where + " = " + f.get(obj) + "";

			System.out.println(updateStr);
			Connection conn = new DatabaseConnection().getConn();
			PreparedStatement pstmt;
			int i;
			pstmt = conn.prepareStatement(updateStr);
			i = pstmt.executeUpdate();
			return i;
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		return -1;
	}

	/**
	 * 删除
	 * 
	 * @param classInstance
	 * @param obj
	 * @param where
	 * @return
	 */
	public int delete(Class<T> classInstance, T obj, String where) {
		String deleteStr = "delete from " + this.getTableByClass(classInstance) + " where " + where + " = ";
		try {
			Field f = obj.getClass().getDeclaredField(where);
			f.setAccessible(true);
			deleteStr += f.get(obj);
			System.out.println(" deleteStr:" + deleteStr);

			Connection conn = new DatabaseConnection().getConn();
			PreparedStatement pstmt;

			int i;

			pstmt = conn.prepareStatement(deleteStr);
			i = pstmt.executeUpdate();
			System.out.println("deleteStr ret :" + i);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * 查询个数
	 * @param classInstace
	 * @return
	 */
	public int queryCount(Class<T> classInstace) {
		List list = query(classInstace);
		return list.size();

	}

	/**
	 * 是否存在
	 * @param classInstance
	 * @param obj
	 * @param where
	 * @return
	 */
	public int isExitByID(Class<T> classInstance, T obj, String where) {
		
		String sql = "Select 1 from " + this.getTableByClass(classInstance) + " where " + where + " = ";
		Field f;
		try {
			f = obj.getClass().getDeclaredField(where);
			f.setAccessible(true);
			sql += f.get(obj);
			Connection conn = new DatabaseConnection().getConn();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.err.println("sql = "+sql);
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				i++;
			}
			return i;
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
