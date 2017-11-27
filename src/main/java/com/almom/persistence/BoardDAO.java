package com.almom.persistence;

import java.util.List;

import com.almom.domain.BoardVO;
import com.almom.domain.Criteria;
import com.almom.domain.SearchCriteria;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;

	  public BoardVO read(Integer class_id) throws Exception;

	  public void update(BoardVO vo) throws Exception;

	  public void delete(Integer class_id) throws Exception;

	  public List<BoardVO> listAll() throws Exception;

	  public List<BoardVO> listPage(int page) throws Exception;

	  public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	  public int countPaging(Criteria cri) throws Exception;
	  
	  //use for dynamic sql
	  
	  public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;
	  
	  public int listSearchCount(SearchCriteria cri)throws Exception;
}