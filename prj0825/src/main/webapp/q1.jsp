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
	String su1_ = request.getParameter("su1");
	String su2_ = request.getParameter("su2");

	int su1 = Integer.parseInt(su1_);
	int su2 = Integer.parseInt(su2_);
	int sum1 = su1 + su2;
	int sum2 = su1 - su2;
	int sum3 = su1 * su2;
	int sum4 = su1 / su2;
	%>

	<%=sum1 %>
	<br>
	<%=sum2 %>
	<br>
	<%=sum3 %>
	<br>
	<%=sum4 %>
</body>
</html>