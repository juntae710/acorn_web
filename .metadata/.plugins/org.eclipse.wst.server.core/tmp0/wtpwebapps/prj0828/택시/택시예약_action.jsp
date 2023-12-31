<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>


<%

//jsp  내장객체 
// request, response , out 

//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값들 꺼내기 

String regno  =request.getParameter("regno");
String regtime = request.getParameter("regtime");
String rddate  = request.getParameter("rddate");
String cusno  = request.getParameter("cusno");
String startpoint  = request.getParameter("startpoint");
String destination  = request.getParameter("destination");
String taxino  = request.getParameter("taxino");
String state  = request.getParameter("state");

System.out.println(regno);
System.out.println(regtime);
System.out.println(rddate);
System.out.println(cusno);
System.out.println( startpoint);
System.out.println( destination);
System.out.println(taxino);
System.out.println( state);
//2. 데이터베이스에 연결하고  테이블에  insert 쿼리 실행하기 

 
	Connection con=null;
	PreparedStatement st = null;
	 
	try{ 
		//데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password);
		 //3. statement 얻어오기
		String sql ="insert into tblcall_list values( ?,?,?,?,?,?,?,?) "; 		
		st = con.prepareStatement(sql);
		
		st.setString(1, regno);
		st.setString(2, regtime);
		st.setString(3, rddate);	
		st.setString(4, cusno);
		st.setString(5, startpoint);
		st.setString(6, destination);		
		st.setString(7, taxino);
		st.setString(8, state);	
			 
		
	    st.executeUpdate();	 
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납		 
		if( st != null) st.close();
		if( con != null) con.close();
	}


//3. 특정페이지로 재요청할 수 있도록 한다 (  웹브라우저가  sendRedirect("url") 응답받으면 다시 지정된  url로 자동요청한다.)
//   
   response.sendRedirect("list.jsp");
%>


 