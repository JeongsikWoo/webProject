package com.almom.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.almom.domain.BoardVO;
import com.almom.domain.Search;
import com.almom.persistence.BoardDAO;
import com.almom.persistence.UserDAO;

@Service
public class BoardServiceImpl implements BoardService {

  @Inject
  private BoardDAO dao;

  @Override
  public void regist(BoardVO board) throws Exception {
    dao.create(board);
  }

  @Override
  public BoardVO read(Integer class_id) throws Exception {
    return dao.read(class_id);
  }

  @Override
  public void modify(BoardVO board) throws Exception {
    dao.update(board);
  }

  @Override
  public void remove(Integer class_id) throws Exception {
    dao.delete(class_id);
  }

  @Override
  public List<BoardVO> listAll() throws Exception {
    return dao.listAll();
  }

  @Override
  public List<BoardVO> listSearchCriteria(Search sch) throws Exception {

    return dao.listSearch(sch);
  }

  @Override
  public int listSearchCount(Search sch) throws Exception {

    return dao.listSearchCount(sch);
  }
}
