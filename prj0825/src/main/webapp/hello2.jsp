<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>hello world</h2>

<!--스크립트릿 : 자바 코드 작성함 -->
<%
String name = request.getParameter("name");

if (name == null){
	out.print("누구인가?");
}else{
	out.print(name +"hi~~~");
}

%>
<!-- 표현식 out.print()로 바뀐다 -->
<%=name %>
</body>
</html>