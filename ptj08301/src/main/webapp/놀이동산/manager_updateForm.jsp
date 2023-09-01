<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>

<%
	String userid = request.getParameter("userid");
	
	String username="";
	String usertel="";
	String userage="";
	
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); 
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql ="select * from t_customer where id='"+userid+"'"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			// out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//  out.print(rs.getString(2));
			// out.print(rs.getString(3)+"<br>");
			
			username=rs.getString(2);
			usertel=rs.getString(3);
			userage=rs.getString(4);
			
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


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manager_updateForm</title>

<link href="./register.css" rel="stylesheet"/>


</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵관리자 수정🔵</h2>
	</header>
	<nav>
		<hr>
		<ul>
		<li><a href="register.jsp">회원가입</a></li>
			<li><a href="결제하기.jsp">결제하기</a></li>
			<li><a href="조회.jsp">사용자조회</a></li>
			<li><a href="manager_list.jsp">관리자조회</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>
		<hr>
	</nav>
	<section>
		<div>
			<img alt="" src="./img/l마스코드.png">
		</div>
		<div class = "b">
		<!-- 바디 내용 -->
		
		<form name="frm" action="manager_update_action.jsp" method="post">
	
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid" readonly="readonly"></td>
				</tr>
				
				<tr>
					<td>이름</td>
					<td><input type="text" name="username"></td>
				</tr>
				
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="usertel" placeholder="010-0000-0000"></td>
				</tr>
				
				<tr>
					<td>나이</td>
					<td>
						<select name="userage">
							<option value="성인">성인</option>
							<option value="청소년">청소년</option>
							<option value="어린이">어린이</option>
						</select>
					</td>
				</tr>
				
				<tr class="last_line">
					<td colspan="2">
						<button>수정</button>
						<input type="reset">
					</td>
					
				</tr>
			
			</table>
		</form>
		
		</div>
		<div>
			<img alt="" src="./img/r마스코드.png">
		</div>
		</section>
	<footer>
	
	
	
	</footer>
	
	<script>
	let frm = document.frm;	
	frm.userid.value="<%= userid%>";
	frm.username.value="<%= username%>";
	frm.usertel.value="<%= usertel%>";
	frm.userage.value="<%= userage%>";
</script>
</body>
</html>