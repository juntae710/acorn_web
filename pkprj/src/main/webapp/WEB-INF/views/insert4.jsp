<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/pkprj/insert5" method="get">
<h2>아이디 입력하기</h2>
나이: <select name="age">
        <option >선택하세요</option>
        <option  value="어린이">어린이</option>
        <option  value="청소년">청소년</option>
        <option  value="성인">성인</option>
    </select>
<button>다음</button>
</form>
</body>
</html>