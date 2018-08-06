<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.nano1{
		widows: 200px;
		height: 400px;
		float: left;
	}
	.nano1_ul{
		list-style: none;
		text-align: center;
		width: 155px;
		height: 350px
	}
	.nano2{
		widows: 400px;
		height: 400px;
		float:left;
	}
	.nano2_ul{
		list-style: none;
		
	}



</style>

</head>
<body>

	<div class="nano1">
		<ul class="nano1_ul">
			<li>memo</li>
		</ul>
	</div>
	<div class="nano2">
		<ul class="nano2_ul">
			<li>
				<textarea rows="20" cols="50" placeholder="memo"></textarea>
			</li>
			<li>
				<div align="right">
					<input type="button" value="추가">
				
					<input type="button" value="취소">"
				</div>
			</li>
		</ul>
	</div>
</body>
</html>