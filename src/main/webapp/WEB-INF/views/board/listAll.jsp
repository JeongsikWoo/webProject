<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>


<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- olumn -->
		<div class="col-md-12">
			<!-- general form elements -->

			<div class="box">
				<div class="box-header with-border">
					<h2 class="box-title">CLASS - 11월의 추천강의를 살펴보세요</h2>
				</div>
				<div class="box-body">
				<!-- 대표사진, 클래스이름, 튜터프로필사진, 튜터이름, 시간당 가격, 그룹수업, 평점, 위치 -->
					<table class="table table-bordered">
						
						<tr>
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
							<td style="width: 10px">${boardVO.class_coverImagePath}</td>
							<td><a href='/board/read?class_id=${boardVO.class_id}'>${boardVO.class_name}</a></td>
							<td>${boardVO.class_pricePerHour}</td>
							<td>${tutorVO.tutor_name}</td> <!-- 튜터이름 -->
							<td>${userVO.user_profileImagePath}</td> <!-- 튜터프로필 -->
							<td>${boardVO.class_type}</td>
							<td>${boardVO.class_score}</td><!-- 평점, 리뷰개수 -->
							<td>장소</td>
						</tr>
						</c:forEach>
					</table>
					<br><br>
				</div>
				<!-- /.box-body -->
				<div class="box-footer">
					<h5>알몸주식회사</h5>
				</div>
				<!-- /.box-footer-->
			</div>
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script>
    
    var result = '${msg}';
    
    if(result == 'SUCCESS'){
    	alert("처리가 완료되었습니다.");
    }
    
    </script>