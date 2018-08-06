<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  
  
  
  
  
  			<div align="right">총계시물수:${s}</div>
	<table border="1">
		<tr>
			<td>넘버</td>
			<td>이름</td>
			<td>내용</td>
			<td>득점?</td>
			<td>시간</td>
			<td>아이피</td>
			<td>삭제</td>
		</tr>
		<c:forEach var="ab" items="${a}">
			<tr>
			
				
				<td>${ab.num }</td>
				<td><a href="javascript:fview(${ab.num})">${ab.name }</a></td>
				<td>${ab.content }</td>
				<td>${ab.grade }</td>
				<td>${ab.created }</td>
				<td>${ab.ipaddr }</td>
				<td><a href="javascript:fdelete(${ab.num},'${ab.name }')">삭제</a></td>
				
			</tr> 
		</c:forEach>
	</table>
	<div align="center">
	
	
	
	<!-- 이전 -->
	<c:if test="${startpage > blockpage}">
		<%-- <a href="javascript:getData(${startpage -blockpage})">[이전]</a> --%>
		<a href="javascript:getData(${startpage -blockpage},'${field}','${word }' )">[이전]</a>
	</c:if>
	
	
	
	
	<!-- 페이지번호(for) -->
	<c:forEach begin="${startpage }" end="${endpage}" var ="i">
	
		<c:if test="${i==currentPage }">
			${i}
		</c:if>
		
		<c:if test="${i!=currentPage }">
			<%-- <a href="javascript:getData(${i})">${i}</a> --%>
			<a href="javascript:getData(${i},'${field}','${word }')">${i}</a>
		</c:if>
	
	</c:forEach>
	
	
	
	
	<!-- 다음 -->
	<c:if test="${endpage < totpage}">
		<%-- <a href="javascript:getData(${endpage+1})">[다음]</a> --%>
		<a href="javascript:getData(${endpage+1},'${field}','${word }')">[다음]</a>
	</c:if>
	</div>
	
	
	
	