<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!-- Main content -->
<section class="content">

	<!-- header -->
	<div class="header">
		<!-- 검색 기능 -->
		<div id="search">
			<form id="searchForm" action="./list" method="get" style="margin: 0; padding: 0;">
				<p style="margin: 0; padding: 0;">
					<input type="hidden" name="class_id" value="${class_id}" />
					<input type="text" name="search" size="100" maxlength="30" placeholder="수업 또는 튜터를 검색해보세요" />
					<button type="﻿submit">검색</button>
				</p>
				<select name="place_district">
	  				<option>전체 지역</option>
				    <option value="1">홍대</option>
				    <option value="2">강남</option>
				    <option value="3">신촌</option>
				 	<option value="4">이태원</option>
	  			</select>
	  			<select name="class_category">
	  				<option>전체 카테고리</option>
				    <option value="1">필라테스</option>
				    <option value="2">휘트니스</option>
				    <option value="3">요가</option>
				 	<option value="4">기체조</option>
	  			</select>
			</form>
		</div>
		
		<div id="title">
			<h2 class="title">CLASS - 11월의 추천강의를 살펴보세요</h2>
		</div>
	</div>
	<!-- /.header -->
	
	
	
	<div class="body">
		<!-- 대표사진, 클래스이름, 튜터프로필사진, 튜터이름, 시간당 가격, 그룹수업, 평점, 위치 -->
		<table class="table table-bordered">
			<tr>
				<th>수업번호</th>
				<th>커버이미지</th>
				<th>수업이름</th>
				<th>시간당가격</th>
				<th>튜터이름</th>
				<th>유저프로필이미지</th>
				<th>클래스타입</th>
				<th>평점</th>
				<th>장소</th>
			</tr>
			<c:choose>
				<c:when test="${not empty list}">
					<c:forEach items="${list}" var="boardVO">
						<tr>
							<td>${boardVO.class_id}</td>
							<td style="width: 10px">${boardVO.class_coverImagePath}</td>
							<td><a href='/board/read?class_id=${boardVO.class_id}'>${boardVO.class_name}</a></td>
							<td>${boardVO.class_pricePerHour}</td>
							<td>${boardVO.tutorvo.tutor_id}</td>
							<!-- 튜터이름 -->
							<td></td>
							<!-- 튜터프로필 -->
							<td>${boardVO.class_type}</td>
							<td>${boardVO.class_score}</td>
							<!-- 평점, 리뷰개수 -->
							<td>장소</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr><td colspan="9">등록된 수업이 없습니다.</td></tr>
				</c:otherwise>
			</c:choose>
		</table>
		<br><br>
	</div>
	<!-- /.body -->



	<div class="footer">
		<!--  
		<div class="pagination">
			<ul class="pagination">
				<c:if test="${pageMaker.prev}">
					<li><a href="listPage${pageMaker.makeQuery(pageMaker.startPage - 1) }">&laquo;</a></li>
				</c:if>

				<c:forEach begin="${pageMaker.startPage }"
					end="${pageMaker.endPage }" var="idx">
					<li
						<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
						<a href="listPage${pageMaker.makeQuery(idx)}">${idx}</a>
					</li>
				</c:forEach>

				<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
					<li><a href="listPage${pageMaker.makeQuery(pageMaker.endPage +1) }">&raquo;</a></li>
				</c:if>
			</ul>
		</div>
		-->
		
		<div class="info">
			<h5>알몸주식회사</h5>
		</div>
	</div>
	<!-- /.footer-->
</section>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	var result = '${msg}';
	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
	
	$(".pagination li a").on("click", function(event) {

		event.preventDefault();

		var targetPage = $(this).attr("href");

		var jobForm = $("#jobForm");
		jobForm.find("[name='page']").val(targetPage);
		jobForm.attr("action", "/board/listPage").attr("method", "get");
		jobForm.submit();
	});
</script>


<form id="jobForm">
  <input type='hidden' name="page" value=${pageMaker.cri.perPageNum}>
  <input type='hidden' name="perPageNum" value=${pageMaker.cri.perPageNum}>
</form>