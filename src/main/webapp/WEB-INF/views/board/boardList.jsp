<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>


<table border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회</td>
		<td>ip</td>
	</tr>
	<c:forEach var="i" items="${dto }">
		<tr>
			<td><a href="boardview?num=${i.num}">${i.num}</a></td>
			
			
			<td>${i.subject}</td>
			<td>${i.writer}</td>
			<td>${i.re_date}</td>
			<td>${i.readcount}</td>
			<td>${i.ip}</td>
		</tr>
	</c:forEach>



</table>

