<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="ct_0907.acorn2.a_c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<a_c> list = (ArrayList<a_c>)request.getAttribute("list");

for(a_c a_c : list){
	out.println(a_c+"<br>");
}
%>
</body>
</html>