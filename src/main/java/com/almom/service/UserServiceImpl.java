package com.almom.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.almom.controller.UserController;
import com.almom.domain.CertificateVO;
import com.almom.domain.TutorVO;
import com.almom.domain.UserVO;
import com.almom.dto.LoginDTO;
import com.almom.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	@Inject
	private UserDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Override
	public void regist(UserVO user) throws Exception {
		// TODO Auto-generated method stub
		logger.info("service " + user.toString());
		System.out.println("���� : ȸ������ �� �α�");
		dao.insertUser(user);
	}

	@Override
	public void registTutor(TutorVO tutor, CertificateVO certificate) throws Exception {
		// TODO Auto-generated method stub
		logger.info("service " + tutor.toString());
		dao.insertTutor(tutor);
		dao.insertCertificate(certificate);

	}

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(dto);
	}

	@Override
	public UserVO getProfile(String str) throws Exception {
		// TODO Auto-generated method stub

		return dao.getProfile(str);
	}

	@Override
	public void addRegistUser(UserVO user) throws Exception {
		// TODO Auto-generated method stub
		logger.info("sss");

		dao.addRegistUser(user);
		logger.info("ssss");
	}

}
