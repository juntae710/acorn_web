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
	margin-top: 50px; width : 400px;
	border: 1px solid black;
	width: 400px;
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

	<table>
		<caption>
			<strong>택시 예약 등록</strong>
		</caption>
		<tr>
			<td>예약번호</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>예약시간</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>예약날짜</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>고객아이디</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>출발지</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>목적지</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>택시번호</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>바차생태</td>
			<td><select>
					<option>선택하기</option>
					<option>[P] 배차완료</option>
					<option>[R] 배차준비</option>
					<option>[X] 배차미정</option>
			</select></td>
		</tr>
		<tr>

			<td colspan="2">
				<button>등록</button>
				<button>다시입력</button>

			</td>
		</tr>
	</table>
</body>
</html>