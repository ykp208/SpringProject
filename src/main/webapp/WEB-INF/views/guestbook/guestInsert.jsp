<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<title>Insert title here</title>
<script>
$(document).ready(function(){
	$("#send").click(function(){//전송버튼
		var name =$("#name").val();
		var content=$("#content").val();
		var grade=$("input:radio[name=grade]:checked").val();
		var postString= "name="+name+"&content="+content+"&grade="+grade;
		$.ajax({
			type:"post",
			url:"insert.do",
			data:postString,
			success:function(data){
				$("#results").html(data);
				$("#name").val("");
				$("#content").val("");
				$("#name").focus();
				
			},
			beforeSend:showRequest
		
		
		});
		
	});
	
	
	$("#btnSearch").click(function(){
		
		getSearch(1,"","");
		
	});
	
	
	getSearch(1,"","");//바로 실행하는 함수
	
});

//검색찾기
function getSearch(pageNum,field,word){
	var field = (field=="")?$("#field").val():field;
	var word = (word=="")?$("#word").val():word;
	var pageNum = (pageNum=="")?$("#pageNum").val():pageNum;
	$("#results").load("list.do",		
					{"pageNum":pageNum,"field":field,"word":word},
					function(data){
						$("#results").html(data);
					})
	
	
}




function fview(num){
	$.ajax({
		type:"post",
		url:"guestview.do",
		data:{"num":num},
		success:function(data){
			
			alert(JSON.stringify(data));
			
			var htmlStr="";
			
				htmlStr+=data.name+"<br>";
				htmlStr+=data.content+"<br>";
				htmlStr+=data.grade+"<br>";
				htmlStr+=data.created+"";
				htmlStr+="<hr>";
			
			$("#view").html(htmlStr);
		},

	})	
}

function fdelete(num, name){
	if(confirm("["+name+"]의 게시물을 삭제할까요?")){
		$.ajax({
			type:"post",
			url:"delete.do",
			data:{"num":num},
			success:function(data){
				
				alert(data);
				
				$("#results").html(data);
			},

		})	
			
		}
		
}
	
		
	



function getData(pageNum){
	$("#results").load("list.do",{"pageNum":pageNum},function(data){
		$("#results").html(data);
	})

	
}



function showRequest(){
	if(!$("#name").val()){
		alert("글쓴이를 입력하세요");
		$("#name").focus();
		return false;
	}
	if(!$("#content").val()){
		alert("내용을 입력하세요");
		$("#content").focus();
		return false;
	}
	if($("input:radio[name=grade]:checked").length==0){
		alert("평가를 해주세요");
		
		return false;
	}
	return true;
}





function textCount(obj,target){
	var len= obj.value.length;
	if(obj.size<len){
		alert("글자 수 초과");
		return;
	}
	$("#"+target).text(len);
}



</script>



</head>
<body>

<div align="right" >
<jsp:include page="memo.jsp"></jsp:include>

</div>

<form >
글쓴이 <input type="text" size="20" id="name" name="name" onkeyup="textCount(this,'nameCount')"> *20글자 이내(
		<span id="nameCount" style="color: red">0</span>
	)<br>



내용 <input type="text" size="70" id="content" name="content" onkeyup="textCount(this,'contentCount')"> *70글자 이내(
		<span  id="contentCount" style="color: red">0</span>
	)<br>


평가 <input type="radio" name="grade" value="excellent">아주 잘함(excellent)
	<input type="radio" name="grade" value="good">잘함(good)
	<input type="radio" name="grade" value="normal">보통(normal)
	<input type="radio" name ="grade" value="fail">노력(fail)
	<br>

<input type="button" value="전송" id="send">
</form>

<br>
<div align="right">
<form name="search" id="search">
	<select name="field" id="field">
		<option value="name">이름</option>
		<option value="content">내용</option>
	</select>
	
	<input type="text" name="word" id="word">
	<input type="button" value="찾기" id="btnSearch">
</form>


</div>






<br><br><br>

<br>
<!-- 방명록 결과 출력 부분 -->
<div id="results" align="center"></div><br><br><br>
<!-- 상세보기 결과 출력부분 -->
<div id="view" align="center"></div>
</body>
</html>