<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="prj0825.Myutils"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Myutils u = new Myutils();
	String result = u.getDivisor(12);
	out.print(result);
	String result2 = u.getMessage();
	out.print(result2);
	%>
</body>
</html>