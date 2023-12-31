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
	width: 400px;
	border: 1px solid black;
	width: 400px;
}

td {
	width: 200px;
	height: 30px;
	border: 1px solid black;
	text-align: center;
	border: 1px solid black;
}
</style>
<link href="../css/index.css" rel="stylesheet" />
<script>
	function check() {
		//return false;
		let frm = document.frm;
		let regno = frm.regno;
		let regtime = frm.regtime;
		let rddate = frm.rddate;
		let cusno = frm.cusno;
		let startpoint = frm.startpoint;
		let destination = frm.destination;
		let taxino = frm.taxino;
		let state = frm.state;

		if (regno.value == "") {
			alert("예약번호입력");
			regno.focus();
			return false;
		} else if (regtime.value == "") {
			alert("예약시간입력");
			regtime.focus();
			return false;
		} else if (rddate.value == "") {
			alert("예약날짜입력");
			rddate.focus();
			return false;
		} else if (cusno.value == "") {
			alert("고객아이디입력");
			cusno.focus();
			return false;
		} else if (startpoint.value == "") {
			alert("출발지입력");
			startpoint.focus();
			return false;
		} else if (destination.value == "") {
			alert("목적지입력");
			destination.focus();
			return false;
		} else if (taxino.value == "") {
			alert("택시번호입력");
			taxino.focus();
			return false;
		} else if (state.value=="선택하기") {
			alert("배차상태입력");
			state.focus();
			return false;
		}
		return true;

	}
</script>
</head>
<body>
	<header> 택시예약 프로그램 Ver 1.0 </header>
	<nav>
	<ul>
			<li><a href="택시예약.jsp">택시예약</a></li>
			<li><a href="list.jsp">택시현황</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>


	</nav>
	<section>
		<form name="frm" action="택시예약_action.jsp" method="post" onsubmit="return check()">
			<table>
				<caption>
					<strong>택시 예약 등록</strong>
				</caption>

				<tr>
					<td>예약번호</td>
					<td><input type="text" name="regno"></td>
				</tr>
				<tr>
					<td>예약시간</td>
					<td><input type="text" name="regtime"></td>
				</tr>
				<tr>
					<td>예약날짜</td>
					<td><input type="text" name="rddate"></td>
				</tr>
				<tr>
					<td>고객아이디</td>
					<td><input type="text" name="cusno"></td>
				</tr>
				<tr>
					<td>출발지</td>
					<td><input type="text" name="startpoint"></td>
				</tr>
				<tr>
					<td>목적지</td>
					<td><input type="text" name="destination"></td>
				</tr>
				<tr>
					<td>택시번호</td>
					<td><input type="text" name="taxino"></td>
				</tr>
				<tr>
					<td>베차생태</td>
					<td><select  name="state">
							<option value = "선택하기">선택하기</option>
							<option value = "P">[P] 배차완료</option>
							<option value = "R">[R] 배차준비</option>
							<option value = "X">[X] 배차미정</option>
					</select></td>
				</tr>
				<tr>

					<td colspan="2">

						<button>등록</button>

						<button>
							<a href="택시예약.jsp">다시입력</a>
						</button>

					</td>
				</tr>

			</table>
		</form>
	</section>
	<footer></footer>


</body>
</html>