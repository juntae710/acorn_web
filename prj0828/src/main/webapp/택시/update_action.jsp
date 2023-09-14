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
String cusno  =request.getParameter("cusno");
String startpoint = request.getParameter("startpoint");
String destination  = request.getParameter("destination");
String taxino  =request.getParameter("taxino");
String state = request.getParameter("state");


out.println(regno);
out.println( regtime);
out.println( rddate);
out.println(cusno);
out.println( startpoint);
out.println( destination);
out.println(taxino);
out.println( state);
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
		 
		 if( con != null)  System.out.println(" db ok");
		 //3. statement 얻어오기
		String sql ="update tblcall_list set regtime= ?, rddate= ?, cusno= ?, startpoint= ?, destination= ?, taxino= ?, state= ? where regno= ?";
		System.out.println(sql); 
		 
		st = con.prepareStatement(sql);
		
	
		
		
		st.setString(1, regtime);
		st.setString(2, rddate);	
		st.setString(3, cusno);
		st.setString(4, startpoint);
		st.setString(5, destination);		
		st.setString(6, taxino);
		st.setString(7, state);	
		st.setString(8, regno);
		
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


 