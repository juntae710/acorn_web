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
	String str = "EL조아요";
	out.println(str);
	%>
	<%
	if (str.equals("EL조아요")) {
	%>
	<div>맞아요 EL 진짜 좋아요</div>
	<%
	}
	%>
	<h3>str 변수의 값은 EL 표현식으로 사용할 수 없다 : 저장소에 담긴 것들만 EL표현식을 사용할 수 있기 떄문</h3>
	${str }
	<h3>JSTL과 EL 사용 코드</h3>
	
	<!-- c:set으로 변수를 선언하면 pageContext 저장소에 담긴다. 그래서 EL 표현식을 사용할 수 있다 -->
	<C:set var="str2" value ="EL좋아요"/>
	
	<C:if test="${ser2 eq 'EL좋아요' }">
	<div>맞아요 EL 진짜 좋아요</div>
	</C:if>
</body>
</html>