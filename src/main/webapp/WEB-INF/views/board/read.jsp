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
					<h3 class="box-title">수업내용보기</h3>
				</div>
				<!-- /.box-header -->

<form role="form" method="post">
	<input type='hidden' name='class_id' value="${boardVO.class_id}">
</form>

<div class="box-body">
	<tr><td>튜터정보</td></tr>
	<tr><td>${boardVO.class_tutorIntroduce}</td></tr>
	<tr><td>수업소개</td></tr>
	<tr><td>${boardVO.class_classIntroduce}</td></tr>
	<tr><td>수업대상</td></tr>
	<tr><td>${boardVO.class_target}</td></tr>
	<tr><td>커리큘럼</td></tr>
	<tr><td>1회차</td></tr>
	<tr><td>2회차</td></tr>
	<tr><td>3회차</td></tr>
	<tr><td>4회차</td></tr>
	<tr><td>리뷰</td></tr>
</div>
<!-- /.box-body -->

<div class="box-footer">
	<button type="submit" class="btn-modify">Modify</button>
	<button type="submit" class="btn-remove">REMOVE</button>
	<button type="submit" class="btn-listall">LIST ALL</button>
</div>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">	
$(document).ready(function(){
	var formObj = $("form[role='form']");
	
	$(".btn-modify").on("click", function(){
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-remove").on("click", function(){
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-listall").on("click", function(){
		self.location = "/board/listAll";
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