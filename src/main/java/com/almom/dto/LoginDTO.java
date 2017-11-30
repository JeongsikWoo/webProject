package com.almom.dto;

public class LoginDTO {
	
	private String user_email;
	private String user_password;
	private boolean useCookie;
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [user_email=" + user_email + ", user_password=" + user_password + ", useCookie=" + useCookie
				+ "]";
	}


	
}
