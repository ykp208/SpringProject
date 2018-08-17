<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<script>
$(document).ready(function(){
	start();

})

//리스트
function start(){
	$("#result").load(
		"boardlist",
		function(data){
			$("#result").html(data);
		}
	
	)	
	
	
}




//상세보기


	



//삭제
function boarddelete(num){
	$.ajax({
		type:"post",
		url:"boarddelete",
		data:{"num":num},
		success:function(data){
			
			$("#result").html(data);
		}
	
	})
	
	
}
</script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 글쓰기 이동 -->
<div align="right"><a href="write.jsp">글쓰기</a></div>



<!-- 글개수 -->
<div align="left">
글목록(전체글:<span></span>)
</div>



<!-- 리스트 화면 -->
<div id="result">

</div>


<!--페이지  -->
<div>페이지</div>







</body>
</html>