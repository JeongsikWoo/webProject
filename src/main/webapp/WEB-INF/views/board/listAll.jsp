<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>


<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->

			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">LIST ALL PAGE</h3>
				</div>
				<div class="box-body">
				
					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">class_id</th>
							<th>class_name</th>
							<th>tutor_id</th>
							<th>class_regdate</th>
						</tr>

						<c:forEach items="${list}" var="boardVO">
						<tr>
							<td>${boardVO.class_id}</td>
							<td><a href='/board/read?class_id=${boardVO.class_id}'>${boardVO.class_name}</a></td>
							<td>${boardVO.tutor_id}</td>
							<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
									value="${boardVO.class_regdate}" /></td>
						</tr>
						</c:forEach>
					</table>

				</div>
				<!-- /.box-body -->
				<div class="box-footer">Footer</div>
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