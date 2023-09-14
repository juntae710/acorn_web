<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0;
}

header {
	width: 1920px;
	height: 100px;
	border: 1px solid black;
	text-align: right;
}

nav {
	width: 1920px;
	height: 50px;
	border: 1px solid black;
}

section {
	width: 1920px;
	height: 600px;
	border: 1px solid black;
}

.s_wrap {
	width: 1510px;
	height: 300px;
	margin: 0 auto;
	margin-top: 100px;
}

.s_Ticketing,.s_check {
	width: 750px;
	height: 40px;
	
	text-align: center;
	display: inline-block;
	border-radius: 15px 15px 0px 0px;
}
.s_Ticketing{
border-right: 1px solid black;
	border-left: 1px solid black;
	border-top: 1px solid black;
}
.s_check{
border: 1px solid black;
}
.s_Ticketinginfo{
width: 100%;
height: 250px;
	border-right: 1px solid black;
	border-left: 1px solid black;
	border-bottom: 1px solid black;
text-align: center;
}
.s_Ticketinginfo div{
padding-top:50px; 
}

footer {
	width: 1920px;
	height: 100px;
border: 1px solid black;
}
</style>
</head>
<body>
	<header> 로그인/회원가입 </header>
	<nav></nav>
	<section>
		<div class="s_wrap">
			<div class="s_Ticketing">예매</div>
			<div class="s_check">조회</div>
			<div class="s_Ticketinginfo" ><div>예매내용</div></div>
		</div>
	</section>
	<footer>
		<h2>항공사 만들기(footer)</h2>
		조원 준태 윤정 나정 예진 재혁
	</footer>
</body>
</html>