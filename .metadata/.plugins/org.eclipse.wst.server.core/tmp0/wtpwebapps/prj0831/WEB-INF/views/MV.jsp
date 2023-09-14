<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="prj0831.MV" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<MV> mv =(ArrayList<MV>)request.getAttribute("mv");
for(MV m :mv){
	out.println(m+"<br>");
}
%>
</body>
</html>