<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String result = (String) request.getAttribute("data"); %>
<%= result %>

<h2>El 사용 : 정장소에 저장된 내용을 꺼내올수 있다.</h2>
${data}
${10+20}
${20/10}
${20-10}
${true && true}
${true && false}
${true || false}

<h2>empty</h2>

<%
pageContext.setAttribute("title", "EL연산자");
%>
${empty title}
${not empty title }
</body>
</html>