package com.almom.domain;

public class TutorVO {
	private Integer tutor_id;
	private String tutor_name;
	private String tutor_universityName;
	private String tutor_universityMajor;
	private String tutor_universityStatus;
	private String tutor_graduateName;
	private String tutor_graduateMajor;
	private String tutor_graduateStatus;
	private String tutor_identificateImage;
	private Integer USER_user_id;

	public Integer getTutor_id() {
		return tutor_id;
	}

	public void setTutor_id(Integer tutor_id) {
		this.tutor_id = tutor_id;
	}

	public String getTutor_name() {
		System.out.println("TUTORNAME : " + tutor_name);
		return tutor_name;
	}

	public void setTutor_name(String tutor_name) {
		this.tutor_name = tutor_name;
	}

	public String getTutor_universityName() {
		return tutor_universityName;
	}

	public void setTutor_universityName(String tutor_universityName) {
		this.tutor_universityName = tutor_universityName;
	}

	public String getTutor_universityMajor() {
		return tutor_universityMajor;
	}

	public void setTutor_universityMajor(String tutor_universityMajor) {
		this.tutor_universityMajor = tutor_universityMajor;
	}

	public String getTutor_universityStatus() {
		return tutor_universityStatus;
	}

	public void setTutor_universityStatus(String tutor_universityStatus) {
		this.tutor_universityStatus = tutor_universityStatus;
	}

	public String getTutor_graduateName() {
		return tutor_graduateName;
	}

	public void setTutor_graduateName(String tutor_graduateName) {
		this.tutor_graduateName = tutor_graduateName;
	}

	public String getTutor_graduateMajor() {
		return tutor_graduateMajor;
	}

	public void setTutor_graduateMajor(String tutor_graduateMajor) {
		this.tutor_graduateMajor = tutor_graduateMajor;
	}

	public String getTutor_graduateStatus() {
		return tutor_graduateStatus;
	}

	public void setTutor_graduateStatus(String tutor_graduateStatus) {
		this.tutor_graduateStatus = tutor_graduateStatus;
	}

	public String getTutor_identificateImage() {
		return tutor_identificateImage;
	}

	public void setTutor_identificateImage(String tutor_identificateImage) {
		this.tutor_identificateImage = tutor_identificateImage;
	}

	public Integer getUSER_user_id() {
		return USER_user_id;
	}

	public void setUSER_user_id(Integer USER_user_id) {
		this.USER_user_id = USER_user_id;
	}

	@Override
	public String toString() {
		return "TutorVO [tutor_id=" + tutor_id + ", tutor_name=" + tutor_name + ", tutor_universityName="
				+ tutor_universityName + ", tutor_universityMajor=" + tutor_universityMajor
				+ ", tutor_universityStatus=" + tutor_universityStatus + ", tutor_graduateName=" + tutor_graduateName
				+ ", tutor_graduateMajor=" + tutor_graduateMajor + ", tutor_graduateStatus=" + tutor_graduateStatus
				+ ", tutor_identificateImage=" + tutor_identificateImage + ", USER_user_id=" + USER_user_id + "]";
	}
}
