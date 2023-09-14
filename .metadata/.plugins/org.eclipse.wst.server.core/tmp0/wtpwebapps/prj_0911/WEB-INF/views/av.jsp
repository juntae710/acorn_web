<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="acorn.ah"%>
<%@page import="acorn.ac"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ah h = (ah) request.getAttribute("h");
	ArrayList<ac> list = (ArrayList<ac>) request.getAttribute("list");
	%>
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
		</tr>
		<%
		for (ac a : list) {
		%>
		<tr>
			<td><%=a.getId()%></td>
			<td><%=a.getPw()%></td>
			<td><%=a.getName()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	int index = h.getGrpStartPage();
	if (h.getCurrentPage() > 1) {
	%>
	<a href="/prj_0911/a?p=<%=index - 1%>">[이전]</a>
	if(handler.getGrpEngPage() < handler.getTotalPage()){%>
	<a href="/prj_0911/a?p=<%=h.getGrpEngPage() + 1%>">[다음]</a>
	<%
	}
	while (index <= h.getGrpEngPage()) {
		%>
		<a href="/prj_0911/a?p=<%=index%>">[<%=index%>]</a>
		
		<%
		index++;
		}
	%>

	
</body>
</html>