package com.almom.domain;

public class CertificateVO {

	private String certificateName;
	private String certificateImage;
	private String tutorId;
	public String getTutorId() {
		return tutorId;
	}
	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getCertificateImage() {
		return certificateImage;
	}
	public void setCertificateImage(String certificateImage) {
		this.certificateImage = certificateImage;
	}
	@Override
	public String toString() {
		return "CertificateVO [certificateName=" + certificateName + ", certificateImage=" + certificateImage
				+ ", tutorId=" + tutorId + "]";
	}

	
	
}
