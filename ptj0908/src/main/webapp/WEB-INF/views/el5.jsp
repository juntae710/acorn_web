<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>저장소에서 저장된 값을 꺼내올때 어떤 순서대로 찾는지 알아두자!</h2>
pageContext > request > session > application 순으로 찾는다.

<h2>저장소에 담고 꺼내기 예시</h2>
<%
pageContext.setAttribute("test", "test1");
request.setAttribute("test", "test2");
session.setAttribute("test", "test3");
application.setAttribute("test", "test4");
%>

${test }
${requestScope.test }
${pageScope.test }
${sessionScope.test }
${applicationScope.test }
</body>
</html>