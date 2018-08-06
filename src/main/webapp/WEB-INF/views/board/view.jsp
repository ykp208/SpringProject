<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script>
    $(document).ready(function(){
    	$("").click(function(){
    		
    	
    	})
    	
    })
    
    
    </script>
    
    
    
<h1>상세보기</h1>
    <table>
    	<tr>
    		<td>글번호</td>
    		<td>${dto.num }</td>
    		<td>조회수</td>
    		<td>${dto.readcount }</td>
    	
    	</tr>
    	
    	<tr>
    		<td>작성자</td>
    		<td>${dto.writer }</td>
    		<td>작성일</td>
    		<td>${dto.re_date }</td>
    	
    	</tr>
    	
    	<tr>
    		<td >글제목</td>
    		<td colspan="3">${dto.subject }</td>
    		
    	
    	</tr>
    	<tr>
    		<td>글내용</td>
    		<td colspan="3">${dto.content }</td>
    		
    	
    	</tr>
    	<tr>
    		<td colspan="4">
    			<input type="button" value="글수정">
    			<input type="button" value="글삭제" onclick="location.href='boarddelete?num=${dto.num}'">
    			<input type="button" value="글답글쓰기">
    			<input type="button" value="글목록" onclick="location.href='index.jsp'">
    			<input type="button" value="코멘트">
    			
    		</td>
    		
    	
    	</tr>
    
    
    
    
    </table>
    