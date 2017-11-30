package com.almom.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.almom.domain.BoardVO;
import com.almom.domain.Search;

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
  public List<BoardVO> listSearch(Search sch) throws Exception {

    return session.selectList(namespace + ".listSearch", sch);
  }

  @Override
  public int listSearchCount(Search sch) throws Exception {

    return session.selectOne(namespace + ".listSearchCount", sch);
  }
}
