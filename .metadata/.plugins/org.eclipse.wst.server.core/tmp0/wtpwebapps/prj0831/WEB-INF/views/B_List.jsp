<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="prj0831.bucketList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<bucketList> b= (ArrayList<bucketList>)request.getAttribute("bb");
for(bucketList bb: b ){
	out.println(bb+"<br>");
}

%>
</body>
</html>