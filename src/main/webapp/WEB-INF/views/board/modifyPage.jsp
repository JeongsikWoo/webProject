<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" action="modifyPage" method="post">
	<input type='hidden' name='page' value="${cri.page}">
	<input type='hidden' name='perPageNum' value="${cri.perPageNum}">
	<input type='hidden' name='class_id' value="${boardVO.class_id}">

	<div class="box-body">
		<div>
			<b>status</b><br>
			<input type="text" name='class_status' style="width:100px" value="${boardVO.class_status}"><br><br>
			
			<b>튜터 아이디를 입력하세요</b><br>
			<input type="text" name='TUTOR_tutor_id' style="width:100px" value="${boardVO.TUTOR_tutor_id}"><br><br>
			
			<b>튜터 유저아이디를 입력하세요</b><br>
			<input type="text" name='TUTOR_USER_user_id' style="width:100px" value="${boardVO.TUTOR_USER_user_id}"><br><br>
			
			<b>수업 제목(20자 이내)</b><br>
			<input type="text" name='class_name' style="text-align:center; width:300px" placeholder="제목에서부터 튜터님의 매력을 마음껏 뿜어내 주세요." value="${boardVO.class_name}"><br>
				ex. 엑셀, 인턴/입사 전에 배워가자!<br><br>
				
			<b>수업 카테고리</b><br>
  			<select name='class_category'>
			    <option value="1">휘트니스</option>
			    <option value="2">필라테스</option>
			    <option value="3">에어로빅</option>
			 	<option value="4">요가</option>
  			</select>
  			<br><br>
  			<b>수업 형태</b><br>
			<input type="radio" name='class_type' value="1" checked>1:1수업
			<input type="radio" name='class_type' value="2">그룹수업
			<input type="radio" name='class_type' value="3">원데이<br>
			
			그룹수업이지만 1:1수업도 가능한 경우 최소인원을 1로 설정해주세요.<br>
  			<select name='class_minStudentNum'>
  				<option>최소인원수</option>
			    <option value="1">1</option>
			    <option value="2">2</option>
			    <option value="3">3</option>
			 	<option value="4">4</option>
			 	<option value="5">5</option>
			    <option value="6">6</option>
			    <option value="7">7</option>
			 	<option value="8">8</option>
			 	<option value="9">9</option>
  			</select>
  			<select name='class_maxStudentNum'>
  				<option>최대인원수</option>
			    <option value="1">1</option>
			    <option value="2">2</option>
			    <option value="3">3</option>
			 	<option value="4">4</option>
			 	<option value="5">5</option>
			    <option value="6">6</option>
			    <option value="7">7</option>
			 	<option value="8">8</option>
			 	<option value="9">9</option>
  			</select>
			<br><br>
			
			<b>커버 사진등록</b><br>
			<input type="button" value="이미지등록">
			<input name='class_coverImagePath' type="text" name='class_coverImagePath' style="width:300px" placeholder="커버사진 주소 string입력" value="${boardVO.class_coverImagePath}">
			<br><br>
			
			<b>사진 등록(권장 6장)</b><br>
			<input type="button" value="사진등록"><br><br>
			
			<b>비디오 추가(선택)</b><br>
			비디오_1 <input type="text" name='video_path' style="width:300px" placeholder="유투브 링크를 입력하세요"><br>
			비디오_2 <input type="text" name='video_path' style="width:300px" placeholder="유투브 링크를 입력하세요">
			<br><br>
		</div>
		
		<div>
			<b>튜터소개</b><br>
			<textarea name='class_tutorIntroduce' rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;" value="${boardVO.class_tutorIntroduce}"></textarea><br><br>
			<b>수업소개</b><br>
			<textarea name='class_classIntroduce' rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;" value="${boardVO.class_classIntroduce}"></textarea><br><br>
			<b>수업대상</b><br>
			<textarea name='class_target' rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;"placeholder="어떤분들을 대상으로 하는 수업인가요?" value="${boardVO.class_target}"></textarea><br><br>
			
			<b>커리큘럼등록</b><br>
			1회차
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;"placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			2회차
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;"placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			3회차
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;"placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			4회차
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;"placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			<input type="button" value="+ 추가"><br><br>	
		</div>
		
		<div>
			<b>시간당 가격</b> <input type="text" name='class_pricePerHour' value="${boardVO.class_pricePerHour}"> 원<br>
			<b>기본수업시간</b>
			<select name='class_timePerDay'>
  				<option>선택하세요</option>
			    <option value="1">1시간</option>
			    <option value="2">2시간</option>
			    <option value="3">3시간</option>
			 	<option value="4">4시간</option>
			 	<option value="5">5시간</option>
			    <option value="6">6시간</option>
  			</select> / 1회<br>
			<b>총 수업(한달기준)</b> <input type="text" name="class_dayPerMonth" value="${boardVO.class_dayPerMonth}"> 회<br>
			<b>총 수업 가격</b><br> <textarea name="class_price" rows="10" style="text-align:center; width:300px; height:100px; letter-spacing: 1px;" placeholder="총 0원, 연결수수료 0원" value="${boardVO.class_price}"></textarea><br><br>
		</div>
		
		<div>
			<b>장소1(대표)</b><br>
			<select name="place_city">
  				<option>수업 개설 지역을 선택해주세요</option>
			    <option value="1">서대문 마포 은평</option>
			    <option value="2">성북 동대문</option>
			    <option value="3">강남 서초</option>
			 	<option value="4">관악 동작</option>
  			</select>
  			<select name="place_district">
  				<option>장소 2</option>
			    <option value="1">홍대</option>
			    <option value="2">홍대</option>
			    <option value="3">홍대</option>
			 	<option value="4">홍대</option>
  			</select>
  			<br>
  			
  			장소 및 기타비용이 있나요?  
  			<input type="radio" name="place_detailOption" value="manToMan" checked>예, 있습니다.
			<input type="radio" name="place_detailOption" value="group">아니요, 없습니다.
			<input type="text" name="place_detail" placeholder="ex) 1일 1만원">
			<br><br>
			
			<b>수업장소 코멘트</b><br>
			<textarea name="class_placeComment" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;" placeholder="신청자분들이 수업장소와 시간에 대해 알면 좋은 사항들이 있나요?" value="${boardVO.class_placeComment}"></textarea><br><br>
			<b>신청 학생에게 보낼 메시지</b><br>
			<textarea name="class_notice" rows="10" style="text-align:center; width:500px; height:200px; letter-spacing: 1px;" placeholder="수강생과 수업 연결 시에 메시지가 전달됩니다." value="${boardVO.class_notice}"></textarea><br><br>
		</div>
	</div>
	<!-- /.box-body -->
</form>


<div class="box-footer">
	<button type="submit" class="btn-save">SAVE</button>
	<button type="submit" class="btn-cancel">CANCEL</button>
</div>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var formObj = $("form[role='form']");

		$(".btn-cancel").on("click", function() {
			self.location = "/board/listAll";
		});
		$(".btn-save").on("click", function() {
			formObj.submit();
		});
	});
</script>

			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->