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
<h2>회원 전체 조회</h2>
<p><a href="/pkprj/home">홈으로</a></p>
<%
int j=0;
ArrayList<String> list =(ArrayList<String>) request.getAttribute("list");
for(int i=0; i<list.size(); i++){

	out.println(list.get(i));
	j++;
	if(j==4){
		out.println("<br>");
		j=0;
	}
	
}

%>
</body>
</html>