<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>Insert title here</title>


</head>
<body>

<form action="updateAction">
<input type="hidden" name ="num" value="0">
<input type="hidden" name ="ref" value="1">
<input type="hidden" name ="re_step" value="0">
<input type="hidden" name ="re_level" value="0">
	<table border="1">
		<tr>
			<td colspan="3" align="right">
				<a href="index.jsp">글목록</a>
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td colspan="2" >
				<input type="text" size="20" name="writer">
			</td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="2">
			
				
				<input type="text" size="20"  name="subject">
				
			</td>
		</tr>
		<tr>
			<td>Email</td>
			<td colspan="2">
				<input type="text" size="20" name="email">
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="2">
				<textarea rows="20" cols="50" name="content"></textarea>
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td colspan="2">
				<input type="text" size="20" name="passwd">
			</td>
		</tr>
		<tr>
			<td colspan="3" align="center">
				<input type="submit" value="글쓰기" onclick="">
				<input type="reset" value="다시작성">
				<input type="button" value="목록보기">
			</td>
		</tr>

	</table>
</form>	
</body>
</html>