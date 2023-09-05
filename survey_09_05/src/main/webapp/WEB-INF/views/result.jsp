<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String flower =  (String) request.getAttribute("flower");
String animal =  (String) request.getAttribute("animal");
%>
<h2>설문조사결과</h2>
<h2>당신이 좋아하는것은</h2>
좋아하는 동물은 ? <%= animal %> <br>
좋아하는 꽃은 ? <%=flower %>

</body>
</html>