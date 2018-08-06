<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html>
<script>
function deleteOn(num){
	
	
	if($("#pwd").val()!=""){
		$.ajax({
			type:"post",
			url:"deleteOn",
			data:{"num":num,"pwd":$("#pwd").val()},
			success:function(data){
	
			
			}
		
		})
	}else{
		alert("비밀번호를 입력하세요");
	}
	
	
}

</script>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>


	<tr>
		<td><b>비밀번호를 입력해 주세요</b></td>
		
	</tr>
	<tr>
		<td>
			비밀번호: <input type="text" id="pwd">
		</td>
	</tr>
	<tr>
		<td>
			<input type="button" value="글삭제" onclick="deleteOn(${num})">
			<input type="button" value="글목록" onclick="location.href='index.jsp'">
     	</td>
     </tr>
	
	
</table>
</body>
</html>