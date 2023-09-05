<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="pkprj.Pk" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 정보</h2>
<%
Pk id =(Pk) request.getAttribute("id");

	out.println(id);


%>
</body>
</html>