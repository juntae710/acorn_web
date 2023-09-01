<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="prj0901.goods.goods"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>조회완료</h2>
	<%
	goods g = (goods)request.getAttribute("g");
	%>
	Id :<%= g.getId()%><br>
	Name :<%= g.getName()%><br>
	Price :<%= g.getPrice()%><br>
</body>
</html>