<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
}

table {
	margin: 0 auto;
	margin-top: 50px;
	width: 800px;
	border: 1px solid black;
}

td:nth-child(1) {
	width: 200px;
	height: 30px;
	border: 1px solid black;
	text-align: center;
}

td:nth-child(2) {
	padding-left: 10px;
	width: 600px;
	height: 30px;
	border: 1px solid black;
	width: 600px;
}
</style>
<link href="../css/index.css" rel="stylesheet" />
<script>
	function check() {
		//return false;
		let frm = document.frm;
		let JOIN_ID = frm.JOIN_ID;
		let JOIN_NM = frm.JOIN_NM;
		let TO_date_y = frm.TO_date_y;
		let TO_date_m = frm.TO_date_m;
		let TO_date_d = frm.TO_date_d;
		let SPECIALTY = frm.SPECIALTY;
		let CHARM = frm.CHARM;
		let GENDER = frm.GENDER;

		if (JOIN_ID.value == "") {
			alert("참가자ID입력");
			JOIN_ID.focus();
			return false;
		} else if (JOIN_NM.value == "") {
			alert("참가자이름입력");
			JOIN_NM.focus();
			return false;
		} else if (TO_date_y.value == "") {
			alert("연도입력");
			TO_date_y.focus();
			return false;
		} else if (TO_date_m.value == "") {
			alert("월입력");
			TO_date_m.focus();
			return false;
		} else if (TO_date_d.value == "") {
			alert("일입력");
			TO_date_d.focus();
			return false;
		} else if (SPECIALTY.value == "") {
			alert("실력무대선택");
			SPECIALTY.focus();
			return false;
		} else if (CHARM.value == "") {
			alert("매력무대입력");
			CHARM.focus();
			return false;
		} else if (GENDER.value == "") {
			alert("성별선택");

			return false;
		}
		return true;

	}
</script>
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
		<form name="frm" action="전송중.jsp" method="post"
			onsubmit="return check()">
			<table>
				<caption>
					<strong>참가자 등록</strong>
				</caption>

				<tr>
					<td>참가자ID</td>
					<td><input type="text" name="JOIN_ID"></td>
				</tr>
				<tr>
					<td>참가자이름</td>
					<td><input type="text" name="JOIN_NM"></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input type="text" name="TO_date_y">년 <input
						type="text" name="TO_date_m">월 <input type="text"
						name="TO_date_d">일</td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="radio" name="GENDER">남 <input
						type="radio" name="GENDER">여</td>
				</tr>
				<tr>
					<td>실력무대</td>
					<td><select name="SPECIALTY">
							<option value="선택하기">선택</option>
							<option>[V] 보컬</option>
							<option>[D] 댄스</option>
							<option>[R] 랩</option>
					</select></td>
				</tr>
				<tr>
					<td>매력무대</td>
					<td><input type="text" name="CHARM"></td>
				</tr>
				<td colspan="2">

					<button>저장</button>

					<button>
						<a href="택시예약.jsp">취소</a>
					</button>

				</td>
			</table>
	</section>
	<footer></footer>

	<!-- 태그 : 쌍으로 (열리는태그 , 닫히는 태그) <h2></h2>
단독으로 사용되는 태그:
<img src =""/> -->
</body>
</html>