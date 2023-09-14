<%@page import="page.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="page.PageHandler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="page.PageHandler"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="page.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	PageHandler handler = (PageHandler) request.getAttribute("handler");
	ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");
	%>

	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>주민번호</td>
			<td>포인트</td>
			<td>등급</td>
		</tr>
		<%
		for (Member m : list) {
		%>
		<tr>
			<td><%=m.getM_id()%></td>
			<td><%=m.getM_pw()%></td>
			<td><%=m.getM_name()%></td>
			<td><%=m.getM_tel()%></td>
			<td><%=m.getM_birthday()%></td>
			<td><%=m.getM_point()%></td>
			<td><%=m.getM_grade()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<p>페이징</p>

	<%
	int index = handler.getGrpStartPage();
	if(handler.getCurrentGrp() > 1){%>
		<a href="/prj_0911/list3.page?p=<%=index-1%>">[이전]</a>
	<%}
	while (index <= handler.getGrpEngPage()) {
	%>
	<a href="/prj_0911/list3.page?p=<%=index%>">[<%=index%>]</a>
	
	<%
	index++;
	}
	if(handler.getGrpEngPage() < handler.getTotalPage()){%>
	<a href="/prj_0911/list3.page?p=<%=handler.getGrpEngPage()+1%>">[다음]</a>
<%}
	
	%>
</body>
</html>