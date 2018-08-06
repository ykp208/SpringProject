<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<table>
		<tr>
			<td colspan="2">마이페이지</td>
			
		</tr>
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" id="userid" name="userid" value="${userid}">
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="text" id="pwd" name="pwd" value="${pwd }">
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" id="name" name="name" value="${name }">
			</td>
		</tr>
		<tr>
			<td>권한</td>
			<td>
				<input type="text" id="admin" name="admin" value="${admin }">
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="text" id="email" name="email" value="${email }">
			</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>
				<input type="text" id="phone" name="phone" value="${phone }">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수정" id="btn">
				<input type="reset" value="취소">
			</td>
			
		</tr>
	
	
	</table>
