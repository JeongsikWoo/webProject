package com.almom.test;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.almom.domain.BoardVO;
import com.almom.domain.Search;
import com.almom.persistence.BoardDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class BoardDAOTest {
	
  @Inject
  private BoardDAO dao;

  private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

  @Test
  public void testCreate() throws Exception {

	Date dt = new Date();
	
    BoardVO board = new BoardVO();
    board.setClass_name("새로운 클래스 제목 ");
    board.setClass_regdate(dt);
    board.setClass_category(1);
    board.setClass_type(1);
    board.setClass_minStudentNum(1);
    board.setClass_maxStudentNum(3);
    board.setClass_currentStudentNum(0);
    board.setClass_coverImagePath("/image/classCover/");
    board.setClass_tutorIntroduce("튜터 소개");
    board.setClass_classIntroduce("클래스 소개");
    board.setClass_target("클래스 대상 소개");
    board.setClass_pricePerHour(1000);
    board.setClass_timePerDay(10);
    board.setClass_dayPerMonth(20);
    board.setClass_price(200000);
    board.setClass_placeComment("장소 코멘트");
    board.setClass_notice("공지");
    board.setClass_status(1);
    board.setTUTOR_tutor_id(001);
    dao.create(board);
  }
  
  @Test
  public void testRead() throws Exception {
    logger.info(dao.read(1).toString());
  }

  @Test
  public void testUpdate() throws Exception {

    BoardVO board = new BoardVO();
    board.setClass_name("수정한 클래스 제목 ");
    board.setClass_category(1);
    board.setClass_type(1);
    board.setClass_minStudentNum(1);
    board.setClass_maxStudentNum(3);
    board.setClass_currentStudentNum(0);
    board.setClass_coverImagePath("/image/classCover2/");
    board.setClass_tutorIntroduce("수정한 튜터 소개");
    board.setClass_classIntroduce("수정한 클래스 소개");
    board.setClass_target("수정한 클래스 대상 소개");
    board.setClass_pricePerHour(1000);
    board.setClass_timePerDay(10);
    board.setClass_dayPerMonth(20);
    board.setClass_price(200000);
    board.setClass_placeComment("수정한 장소 코멘트");
    board.setClass_notice("수정한 공지");
    dao.update(board);
  }

  @Test
  public void testDelete() throws Exception {

    dao.delete(1);
  }

  @Test
  public void testListAll() throws Exception {

    logger.info(dao.listAll().toString());

  }

  @Test
  public void testURI() throws Exception {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/board/read").queryParam("class_id", 12)
        .queryParam("perPageNum", 20).build();

    logger.info("/board/read?class_id=12&perPageNum=20");
    logger.info(uriComponents.toString());

  }

  @Test
  public void testURI2() throws Exception {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/{module}/{page}").queryParam("class_id", 12)
        .queryParam("perPageNum", 20).build().expand("board", "read").encode();

    logger.info("/board/read?class_id=12&perPageNum=20");
    logger.info(uriComponents.toString());
  }

}
