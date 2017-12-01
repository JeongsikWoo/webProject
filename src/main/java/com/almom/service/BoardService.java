package com.almom.service;

import java.util.List;

import com.almom.domain.BoardVO;
import com.almom.domain.Criteria;
import com.almom.domain.SearchCriteria;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;

	public BoardVO read(Integer class_id) throws Exception;

	public void modify(BoardVO board) throws Exception;

	public void remove(Integer class_id) throws Exception;

	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int listCountCriteria(Criteria cri) throws Exception;

	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;
}
