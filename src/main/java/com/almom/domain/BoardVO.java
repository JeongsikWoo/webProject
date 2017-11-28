package com.almom.domain;

import java.util.Date;

public class BoardVO {
	private Integer class_id;
	private String class_name;
	private Date class_regdate;
	private Integer class_category;
	private Integer class_type;
	private Integer class_minStudentNum;
	private Integer class_maxStudentNum;
	private Integer class_currentStudentNum;
	private String class_coverImagePath;
	private String class_tutorIntroduce;
	private String class_classIntroduce;
	private String class_target;
	private Integer class_pricePerHour;
	private Integer class_timePerDay;
	private Integer class_dayPerMonth;
	private Integer class_price;
	private String class_placeComment;
	private String class_notice;
	private Integer class_status;
	private Integer TUTOR_tutor_id;
	private Integer TUTOR_USER_user_id;
	
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Date getClass_regdate() {
		return class_regdate;
	}
	public void setClass_regdate(Date class_regdate) {
		this.class_regdate = class_regdate;
	}
	public Integer getClass_category() {
		return class_category;
	}
	public void setClass_category(Integer class_category) {
		this.class_category = class_category;
	}
	public Integer getClass_type() {
		return class_type;
	}
	public void setClass_type(Integer class_type) {
		this.class_type = class_type;
	}
	public Integer getClass_minStudentNum() {
		return class_minStudentNum;
	}
	public void setClass_minStudentNum(Integer class_minStudentNum) {
		this.class_minStudentNum = class_minStudentNum;
	}
	public Integer getClass_maxStudentNum() {
		return class_maxStudentNum;
	}
	public void setClass_maxStudentNum(Integer class_maxStudentNum) {
		this.class_maxStudentNum = class_maxStudentNum;
	}
	public Integer getClass_currentStudentNum() {
		return class_currentStudentNum;
	}
	public void setClass_currentStudentNum(Integer class_currentStudentNum) {
		this.class_currentStudentNum = class_currentStudentNum;
	}
	public String getClass_coverImagePath() {
		return class_coverImagePath;
	}
	public void setClass_coverImagePath(String class_coverImagePath) {
		this.class_coverImagePath = class_coverImagePath;
	}
	public String getClass_tutorIntroduce() {
		return class_tutorIntroduce;
	}
	public void setClass_tutorIntroduce(String class_tutorIntroduce) {
		this.class_tutorIntroduce = class_tutorIntroduce;
	}
	public String getClass_classIntroduce() {
		return class_classIntroduce;
	}
	public void setClass_classIntroduce(String class_classIntroduce) {
		this.class_classIntroduce = class_classIntroduce;
	}
	public String getClass_target() {
		return class_target;
	}
	public void setClass_target(String class_target) {
		this.class_target = class_target;
	}
	public Integer getClass_pricePerHour() {
		return class_pricePerHour;
	}
	public void setClass_pricePerHour(Integer class_pricePerHour) {
		this.class_pricePerHour = class_pricePerHour;
	}
	public Integer getClass_timePerDay() {
		return class_timePerDay;
	}
	public void setClass_timePerDay(Integer class_timePerDay) {
		this.class_timePerDay = class_timePerDay;
	}
	public Integer getClass_dayPerMonth() {
		return class_dayPerMonth;
	}
	public void setClass_dayPerMonth(Integer class_dayPerMonth) {
		this.class_dayPerMonth = class_dayPerMonth;
	}
	public Integer getClass_price() {
		return class_price;
	}
	public void setClass_price(Integer class_price) {
		this.class_price = class_price;
	}
	public String getClass_placeComment() {
		return class_placeComment;
	}
	public void setClass_placeComment(String class_placeComment) {
		this.class_placeComment = class_placeComment;
	}
	public String getClass_notice() {
		return class_notice;
	}
	public void setClass_notice(String class_notice) {
		this.class_notice = class_notice;
	}
	public Integer getClass_status() {
		return class_status;
	}
	public void setClass_status(Integer class_status) {
		this.class_status = class_status;
	}
	public Integer getTUTOR_tutor_id() {
		return TUTOR_tutor_id;
	}
	public void setTUTOR_tutor_id(Integer TUTOR_tutor_id) {
		TUTOR_tutor_id = TUTOR_tutor_id;
	}
	public Integer getTUTOR_USER_user_id() {
		return TUTOR_USER_user_id;
	}
	public void setTUTOR_USER_user_id(Integer TUTOR_USER_user_id) {
		TUTOR_USER_user_id = TUTOR_USER_user_id;
	}
	@Override
	public String toString() {
		return "BoardVO [class_id=" + class_id + ", class_name=" + class_name + ", class_regdate=" + class_regdate
				+ ", class_category=" + class_category + ", class_type=" + class_type + ", class_minStudentNum="
				+ class_minStudentNum + ", class_maxStudentNum=" + class_maxStudentNum + ", class_currentStudentNum="
				+ class_currentStudentNum + ", class_coverImagePath=" + class_coverImagePath + ", class_tutorIntroduce="
				+ class_tutorIntroduce + ", class_classIntroduce=" + class_classIntroduce + ", class_target="
				+ class_target + ", class_pricePerHour=" + class_pricePerHour + ", class_timePerDay=" + class_timePerDay
				+ ", class_dayPerMonth=" + class_dayPerMonth + ", class_price=" + class_price + ", class_placeComment="
				+ class_placeComment + ", class_notice=" + class_notice + ", class_status=" + class_status
				+ ", TUTOR_tutor_id=" + TUTOR_tutor_id + ", TUTOR_USER_user_id=" + TUTOR_USER_user_id + "]";
	}
}
