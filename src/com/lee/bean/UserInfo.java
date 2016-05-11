package com.lee.bean;

public class UserInfo {
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long p) {
		this.phone = p;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private long userid;
	private String username;
	private String portrait;
	private int status;
	private String token;
	private String regdate;
	private String sex;
	private String introduce;
	private String mail;
	private long phone;
	private String password;
	@Override
	public String toString() {
		return "UserInfo [userid=" + userid + ", username=" + username + ", portrait=" + portrait + ", status=" + status
				+ ", token=" + token + ", regdate=" + regdate + ", sex=" + sex + ", introduce=" + introduce + ", mail="
				+ mail + ", phone=" + phone + ", password=" + password + "]";
	}
	
	
}
