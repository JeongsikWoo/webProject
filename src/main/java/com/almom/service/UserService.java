package com.almom.service;

import com.almom.domain.CertificateVO;
import com.almom.domain.TutorVO;
import com.almom.domain.UserVO;
import com.almom.dto.LoginDTO;

public interface UserService {
	public void regist(UserVO user) throws Exception;
	public void registTutor(TutorVO tutor, CertificateVO certificate) throws Exception;
	public UserVO login(LoginDTO dto)throws Exception;
	public UserVO getProfile(String str)throws Exception;
	public void addRegistUser(UserVO user)throws Exception;
}
