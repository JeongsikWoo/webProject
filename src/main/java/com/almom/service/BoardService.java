package com.almom.service;

import java.util.List;

import com.almom.domain.BoardVO;
import com.almom.domain.Search;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;

	  public BoardVO read(Integer class_id) throws Exception;

	  public void modify(BoardVO board) throws Exception;

	  public void remove(Integer class_id) throws Exception;

	  public List<BoardVO> listAll() throws Exception;
	  
	  public List<BoardVO> listSearchCriteria(Search sch) throws Exception;

	  public int listSearchCount(Search sch) throws Exception;
}
