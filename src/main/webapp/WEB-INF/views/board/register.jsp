<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">수업을 등록하세요.</h3>
				</div>
				<!-- /.box-header -->

<form role="form" method="post">
	<div class="box-body">
		<div>
			수업 제목(20자 이내)
			<input type="text"
				name='class_name' class="form-control" placeholder="제목에서부터 튜터님의 매력을 마음껏 뿜어내 주세요.">
				<br>
				ex. 엑셀, 인턴/입사 전에 배워가자!<br>
				저렴이를 고렴이처럼 메이크업 해보자~<br>
				캐리어 챙기는 것보다 쉬운 여행영상 만들기<br>
		</div>
		<div>
			수업 카테고리
  			<select name="class_category">
			    <option value="fitness">휘트니스</option>
			    <option value="pilates">필라테스</option>
			    <option value="aerobic">에어로빅</option>
			 	<option value="yoga">요가</option>
  			</select>
  			
  			수업 형태
			<input type="radio" name="class_type" value="manToMan" checked>1:1수업<br>
			<input type="radio" name="class_type" value="group">그룹수업<br>
			<input type="radio" name="class_type" value="oneDay">원데이<br>
			
			그룹수업이지만 1:1수업도 가능한 경우 최소인원을 1로 설정해주세요.<br>
  			<select name="class_category">
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
  			<select name="class_category">
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
			
			커버 사진등록
			<input type="button" value="이미지등록"><br>
			<input type="text" name='class_coverImagePath' placeholder="커버사진 주소 string입력">
			<br><br>
			
			사진 등록(권장 6장)<br>
			<input type="button" value="사진등록"><br><br>
			
			비디오 추가(선택)
			<input type="text" name='video_path' placeholder="유투브 링크를 입력하세요"><br>
			<input type="text" name='video_path' placeholder="유투브 링크를 입력하세요">
			<br><br>
		</div>
		
		<div>
			튜터소개<br>
			<textarea name="class_tutorIntroduce" rows="10"></textarea><br><br>
			수업소개<br>
			<textarea name="class_classIntroduce" rows="10"></textarea><br><br>
			수업대상<br>
			<textarea name="class_target" rows="10" placeholder="어떤분들을 대상으로 하는 수업인가요?"></textarea><br><br>
			
			커리큘럼등록
			1회차<br>
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			2회차<br>
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			3회차<br>
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			4회차<br>
			<input type="button" value="이미지등록"><br>
			<textarea name="curriculum_content" rows="10" placeholder="튜터님 수업을 간단히 설명해주세요."></textarea><br><br>
			
			<input type="button" value="+ 추가"><br><br>	
		</div>
		
		<div>
			시간당 가격 <input type="text" name="class_pricePerHour"> 원<br>
			기본수업시간 <select name="class_category">
  				<option>선택하세요</option>
			    <option value="1">1시간</option>
			    <option value="2">2시간</option>
			    <option value="3">3시간</option>
			 	<option value="4">4시간</option>
			 	<option value="5">5시간</option>
			    <option value="6">6시간</option>
  			</select> / 1회<br>
			총 수업(한달기준) <input type="text" name="class_dayPerMonth"> 회<br>
			총 수업 가격 <textarea name="curriculum_content" rows="10" placeholder="총 0원<br>연결수수료<br> 0원"></textarea><br><br>
		</div>
		
		<div>
			장소1(대표)
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
  			</select><br>
  			장소 및 기타비용이 있나요?  
  			<input type="radio" name="place_detailOption" value="manToMan" checked>예, 있습니다.
			<input type="radio" name="place_detailOption" value="group">아니요, 없습니다.<br>
			<input type="text" name="place_detail" placeholder="ex) 1일 1만원">
			<br><br>
			
			수업장소 코멘트
			<textarea name="class_placeComment" rows="10" placeholder="신청자분들이 수업장소와 시간에 대해 알면 좋은 사항들이 있나요?"></textarea><br><br>
			신청 학생에게 보낼 메시지
			<textarea name="class_notice" rows="10" placeholder="수강생과 수업 연결 시에 메시지가 전달됩니다."></textarea><br><br>
		</div>
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<button type="submit" class="btn btn-primary">임시저장</button>
		<button type="submit" class="btn btn-primary">승인요청</button>
	</div>
</form>
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