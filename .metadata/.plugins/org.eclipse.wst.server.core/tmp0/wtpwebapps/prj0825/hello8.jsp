<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
	width: 50px;
	height: 50px;
	border: 1px solid black;
}
</style>
</head>
<body>
	<%
	String su_=request.getParameter("su");
	int su= Integer.parseInt(su_);
	%>
	<h2>입력된 만큼 네모 만들기</h2>
	<%
	for (int i = 1; i <= su; i++) {
	%>
	<div><%=i%></div>
	<%
	}
	%>



</body>
</html>