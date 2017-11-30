package com.almom.persistence;

import com.almom.domain.CertificateVO;
import com.almom.domain.TutorVO;
import com.almom.domain.UserVO;
import com.almom.dto.LoginDTO;

public interface UserDAO {
	
	public void insertUser(UserVO vo) throws Exception;
	public void insertTutor(TutorVO vo)throws Exception; 
	public void insertCertificate(CertificateVO vo)throws Exception;
	public UserVO login(LoginDTO dto)throws Exception;
	public UserVO getProfile(String str)throws Exception;
	public void addRegistUser(UserVO vo)throws Exception;
}
