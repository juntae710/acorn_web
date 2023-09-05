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
String id =  (String) request.getAttribute("id");
String name =  (String) request.getAttribute("name");
String tel =  (String) request.getAttribute("tel");
String age =  (String) request.getAttribute("age");

%>
<h2>회원가입 확인</h2>
아이디: <%= id %> <br>
이름: <%= name %> <br>
전화번호: <%= tel %> <br>
나이: <%= age %> 

</body>
</html>