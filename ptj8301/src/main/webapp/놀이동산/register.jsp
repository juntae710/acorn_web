<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	String userid = request.getParameter("userid");

	String username="";
	String usertel="";
	String userage="";
	
%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>

<link href="./register.css" rel="stylesheet"/>


</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵회원가입🔵</h2>
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
		
		<form name="frm" action="register_action.jsp" method="post">
	
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid" placeholder="숫자 최대 4자리"></td>
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
						<button>가입</button>
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
</body>
</html>