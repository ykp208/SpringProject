<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<style>
	.f{
		width: 200px;
		height: 300px;
		border: solid black 1px;
		float: left;
	}
	.sc{
		width: 600px;
		height:300px;
		border: solid black 1px;
		float: left;
	}
	ul{
		list-style: none;
		width: 590px;
		height: 300px;
	}
	
	.li1{
		width: 100px;
		height: auto;
		float: left;
		background-color: red;
	}
	
	.li2{
		width:450px;
		height: auto;
		float: left;
	}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">상품 등록 - 관리자 페이지</h1>


	
	<div class="sc">
	<form action="pInsert" method="post">
		<ul>
			<li class="li1">
				상품명
			</li>
			<li class="li2">
				<input type="text" size="40"  name="name">
			</li>
			<li class="li1">
				가격
			</li>
			<li class="li2">
				<input type="text" size ="10"  name="price">
			</li>
			<li class="li1">
				사진
			</li>
			<li class="li2">
				<input type="file" value="파일선택" name="url">
				주의사항: 이미지를 변경하고자 할때만 선택하시오
			</li>
			<li class="li1">
				설명
			</li>
			<li class="li2">
				<textarea rows="10" cols="60" name="bview"></textarea>
				
			</li>
		</ul>
	
	<div>
		<input type="submit" value="입력">
		<input type="reset" value="다시작성">
		<input type="button" onclick="location.href='productList'" value="목록">
	</div>
	</form>
	</div>
</body>
</html>