package com.almom.domain;

public class UserVO {
	private Integer user_id;
	private String user_email;
	private String user_name;
	private String user_password;
	private String user_profileImagePath;
	private Integer user_sex;
	private Integer user_age;
	private String user_job;
	private String user_phoneNumber;
	private String user_snsId;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_profileImagePath() {
		return user_profileImagePath;
	}
	public void setUser_profileImagePath(String user_profileImagePath) {
		this.user_profileImagePath = user_profileImagePath;
	}
	public Integer getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(Integer user_sex) {
		this.user_sex = user_sex;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public String getUser_job() {
		return user_job;
	}
	public void setUser_job(String user_job) {
		this.user_job = user_job;
	}
	public String getUser_phoneNumber() {
		return user_phoneNumber;
	}
	public void setUser_phoneNumber(String user_phoneNumber) {
		this.user_phoneNumber = user_phoneNumber;
	}
	public String getUser_snsId() {
		return user_snsId;
	}
	public void setUser_snsId(String user_snsId) {
		this.user_snsId = user_snsId;
	}
	
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_email=" + user_email + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", user_profileImagePath=" + user_profileImagePath
				+ ", user_sex=" + user_sex + ", user_age=" + user_age + ", user_job=" + user_job + ", user_phoneNumber="
				+ user_phoneNumber + ", user_snsId=" + user_snsId + "]";
	}
}
