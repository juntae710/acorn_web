<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/list.css"  rel="stylesheet" /> 
<link href="../css/index.css" rel="stylesheet" />
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
}

table {
	margin: 0 auto;
	margin-top: 50px; width : 400px;
	border: 1px solid black;
	width: 1200px;
}

td {
	width: 200px;
	height: 30px; border : 1px solid black;
	text-align: center;
	border: 1px solid black;
}
</style>
</head>
<body>
	<header> HY라우드 오디션 Ver 1.0 </header>
	<nav>
		<ul>
		<li><a href="참가자등록.jsp">참자가등록</a></li>
			<li><a href="참가자목록조회.jsp">참자가 목록조회</a></li>
			<li><a href="참가자점수조회.jsp">참가자점수 조회</a></li>
			<li><a href="참가자등수조회.jsp">참가자등수 조회</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>

	</nav>
	<section>
		<table>
		<caption>
			<h2>참가자 조회</h2>
		</caption>
<tr>
	<td>참가자ID</td>
	<td>참가자이름</td>
	<td>종합점수</td>
	<td>평균점수</td>
	<td>순위</td>
</tr>

<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql ="  select j.JOIN_ID , j.JOIN_NM , sum(s.SCORE), ";
				sql += "  TRUNC(avg(s.SCORE),2) , rank() over(order by sum(s.SCORE) desc) ";
				sql += " from  tbl_score_200 s join tbl_join_200 j on s.ARTISTID = j.JOIN_ID ";
				sql += " join tbl_mentor_200 m on s.MENTORID = m.MENTOR_ID ";
				sql += " group by  j.JOIN_ID,j.JOIN_NM ORDER by sum(s.SCORE) DESC ";
		      //5. 최종적으로 실행
		      System.out.println(sql);
		      rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
%>
<!-- db연동후 데이터 조회부분 -->
<tr>
	<td> <%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
</tr>
<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
%>
</table>
	</section>
	<footer></footer>



</body>
</html>