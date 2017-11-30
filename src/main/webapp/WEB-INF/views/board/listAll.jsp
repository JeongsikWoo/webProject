<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>


<!-- Main content -->
<section class="content">



	<div class="header">
		<!-- 검색 기능 -->
		<div id="search">
			<form id="searchForm" action="./list" method="get"
				style="margin: 0; padding: 0;">
				<p style="margin: 0; padding: 0;">
					<input type="hidden" name="class_id" value="${class_id}" />
					<input type="text" name="search" size="100" maxlength="30" placeholder="수업 또는 튜터를 검색해보세요" />
					<button type="﻿submit">검색</button>
				</p>
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
		</table>
		<br><br>
	</div>
	<!-- /.body -->



	<div class="footer">
		<h5>알몸주식회사</h5>
	</div>
	<!-- /.footer-->
</section>

<script>
	var result = '${msg}';
	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
</script>