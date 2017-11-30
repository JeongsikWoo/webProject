package com.almom.persistence;

import java.util.List;

import com.almom.domain.BoardVO;
import com.almom.domain.Search;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;

	  public BoardVO read(Integer class_id) throws Exception;

	  public void update(BoardVO vo) throws Exception;

	  public void delete(Integer class_id) throws Exception;

	  public List<BoardVO> listAll() throws Exception;

	  //cri
	  public List<BoardVO> listSearch(Search sch)throws Exception;
	  
	  public int listSearchCount(Search sch)throws Exception;
}
