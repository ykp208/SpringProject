<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html>
<script>
function tt(){
	
	$.ajax({
		type:"post",
		
		url:"guestlogin_hash",
		success:function(data){
			
			alert($('#userid').val());
			alert($('#pwd').val());
			//char 형으로 가저 온다. 아스키 값으로 변환 
			/* 
			if (len >= 2) ret += (the_str.charCodeAt(1) & 0xff) <<  8;
   			if (len >= 3) ret += (the_str.charCodeAt(2) & 0xff) << 16;
   			if (len >= 4) ret += (the_str.charCodeAt(3) & 0xff) << 24; */
			
			
			
			var userid = ($('#userid').val().charCodeAt(0) & 0xff) <<  0 ;
			var pwd = ($('#pwd').val().charCodeAt(0) & 0xff) <<  0 ;
			userid = userid*10;
			pwd = pwd*10;
			$.ajax({
				type:"post",
				data:{"userid":userid,"pwd":pwd},
				url:"guestlogin",
				success:function(data){
					
					$("#uu").html(data);
					
				}
			})
		}
	})
	
}
	
</script>
<div id="uu">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>


<p><a href ="guestInsert.jsp">[홈으로 돌아가기]</a></p>
ID:<input type="text" name="userid" id ="userid"><br>
PWD:<input type="password" name="pwd" id="pwd"><br>

<input type="button" value="로그인" onclick="tt()">
<input type="reset" value="취소">



${str }
</body>
</html>
</div>