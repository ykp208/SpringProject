<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>

<form action="guestlogin" method="post">
<p><a href ="guestInsert.jsp">[홈으로 돌아가기]</a></p>
ID:<input type="text" name="userid" id ="userid"><br>
PWD:<input type="password" name="pwd" id="pwd"><br>

<input type="submit" value="로그인">
<input type="reset" value="취소">

</form>

${str }
</body>
</html>