<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>


<c:set var="i" value="${empty  id ? '로그인하시겠습니까?' : '로그아웃하시겠습니까?' }"/>
${i }

</body>
</html>