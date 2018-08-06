<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${sessionScope.userid!=null }">

<a href="memopage">memo</a>
<a href="productList">상품 리스트</a>
</c:if>

<c:if test="${sessionScope.userid==null }">
<a href="login.jsp">로그인</a></c:if>
<c:if test="${sessionScope.userid!=null }">
${login.name} (${ login.userid})<a href="logout">로그아웃</a>
</c:if>



</body>
</html>