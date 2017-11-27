package com.almom.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.almom.domain.BoardVO;
import com.almom.domain.Criteria;
import com.almom.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

  @Inject
  private SqlSession session;

  private static String namespace = "com.almom.mapper.BoardMapper";
  
  @Override
  public void create(BoardVO vo) throws Exception {
    session.insert(namespace + ".create", vo);
  }

  @Override
  public BoardVO read(Integer class_id) throws Exception {
    return session.selectOne(namespace + ".read", class_id);
  }

  @Override
  public void update(BoardVO vo) throws Exception {
    session.update(namespace + ".update", vo);
  }

  @Override
  public void delete(Integer class_id) throws Exception {
    session.delete(namespace + ".delete", class_id);
  }

  @Override
  public List<BoardVO> listAll() throws Exception {
    return session.selectList(namespace + ".listAll");
  }

  @Override
  public List<BoardVO> listPage(int page) throws Exception {

    if (page <= 0) {
      page = 1;
    }

    page = (page - 1) * 10;

    return session.selectList(namespace + ".listPage", page);
  }

  @Override
  public List<BoardVO> listCriteria(Criteria cri) throws Exception {

    return session.selectList(namespace + ".listCriteria", cri);
  }

  @Override
  public int countPaging(Criteria cri) throws Exception {

    return session.selectOne(namespace + ".countPaging", cri);
  }

  @Override
  public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {

    return session.selectList(namespace + ".listSearch", cri);
  }

  @Override
  public int listSearchCount(SearchCriteria cri) throws Exception {

    return session.selectOne(namespace + ".listSearchCount", cri);
  }
}
