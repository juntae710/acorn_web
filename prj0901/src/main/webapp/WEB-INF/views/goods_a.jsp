<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>전체조회완료</h2><br>

<% ArrayList<String> all = (ArrayList<String>)request.getAttribute("all"); 
for(int i=0; i<all.size(); i++){
	out.println(all.get(i)+"<br>");
}


%>
</body>
</html>