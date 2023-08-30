<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>>
    
    
<%
// jsp 내장객체
//0. 넘어온 값들에 대해서  encoding
request.setCharacterEncoding("UTF-8");
// 1. 넘어온 값들 꺼내기 
 String userid = request.getParameter("userid");
 String userpw = request.getParameter("userpw");
 String username = request.getParameter("username");
 
 System.out.println(userid);
 System.out.println(userpw);
 System.out.println(username);
 // 2. 테이터베이스 테이블에 insert 
 

	Connection con=null;
	PreparedStatement st = null;
	try{ 
		//데이터 베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password);
		 //3. statement 얻어오기
		String sql ="insert into acorntbl values(?,?,?)"; 
		 //
		st = con.prepareStatement(sql);
		 
		 st.setString(1, userid);
		 st.setString(2, userpw);
		 st.setString(3, username);
		 //4. 필요한 sql 작성
		 st.executeUpdate();
		 //5. 최종적으로 실행
		
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
			out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			out.print(rs.getString(2));
			out.print(rs.getString(3) + "<br>");
			
			
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}


 // 3. 특정 페이지로 재요청할 수 있도록 한다.
 
 //response.sendRedirect("index,jsp")
%>



<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
데이터베이스 연동 코드입력
</body>
</html> -->