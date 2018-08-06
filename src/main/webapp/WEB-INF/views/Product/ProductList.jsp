<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul{
		list-style: none;
		width:800px;
		height: 900px;
		
	}
	.table1{
		border-bottom: solid black 1px;
		float: left;
		width: 60px;
	}
	.table2{
		border-bottom: solid black 1px;
		float: left;
		width: 400px;
	}
	.table3{
		border-bottom: solid black 1px;
		float: left;
		width: 100px;
	}
	.table4{
		border-bottom: solid black 1px;
		float: left;
		width: 100px;
	}
	.table5{
		border-bottom: solid black 1px;
		float: left;
		width: 100px;
	}
	 a:link { color: red; text-decoration: none;}
	 a:visited { color: black; text-decoration: none;}
	 a:hover { color: blue; text-decoration: underline;}



</style>
<script>
function pView(num){
	$.ajax({
		type:"post",
		data:{"num":num},
		url:"pView",
		success:function(data){
			$("#view").html(data);
		}
	})
	
}
	
</script>

</head>
<body>
	<div id="view">
		<h1 align="center">상품 리스트 -관리자 페이지</h1>
	
		<div align="right"> 
			<a href="pInsertpage">상품등록</a>
		</div>
	
		<ul>
			<li class="table1">
				<div align="center">번호</div>
			</li>
			<li class="table2">
				<div align="center">이름</div>
			</li>
			<li class="table3">
				<div align="center">가격</div>
			</li>
			<li class="table4">
				<div align="center">수정</div>
			</li>
			<li class="table5">
				<div align="center">삭제</div>
			</li>
		<c:forEach var="a" items="${pdto}">
			<li class="table1">
				<div align="center">
					${a.num }
				</div>
			</li>
			<li class="table2">
				<div align="left">${a.name }</div>
			</li>
			<li class="table3">
				<div align="center">${a.price}</div>
			</li>
			<li class="table4">
				<div align="center">
					<a href="javascript:pView(${a.num})">수정</a>
				</div>
			</li>
			<li class="table5">
				<div align="center">
					<a href="javascript:pDelete(${a.num})">삭제</a>
				</div>
			</li>
		
		</c:forEach>
			
		</ul>
	</div>
</body>
</html>