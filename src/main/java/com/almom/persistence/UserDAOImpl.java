package com.almom.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.almom.controller.UserController;
import com.almom.domain.CertificateVO;
import com.almom.domain.TutorVO;
import com.almom.domain.UserVO;
import com.almom.dto.LoginDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String namespace = "com.almom.mapper.UserMapper";

	@Override
	public void insertUser(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertUser", vo);
	}

	@Override
	public void insertTutor(TutorVO vo) throws Exception {
		// TODO Auto-generated method stub

		logger.info("dao " + vo);
		sqlSession.insert(namespace + ".insertTutor", vo);
	}

	@Override
	public void insertCertificate(CertificateVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertCertificate", vo);
	}

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		Object obj = sqlSession.selectOne(namespace + ".login", dto);

		return sqlSession.selectOne(namespace + ".login", dto);
	}

	@Override
	public UserVO getProfile(String str) throws Exception {
		// TODO Auto-generated method stub
		Object obj = sqlSession.selectOne(namespace + ".getProfile", str);
		return sqlSession.selectOne(namespace + ".getProfile", str);
	}

	@Override
	public void addRegistUser(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".addRegister", vo);

	}
}
