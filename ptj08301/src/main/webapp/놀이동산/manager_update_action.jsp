<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>

 <%
    
    // 1. 
    request.setCharacterEncoding("UTF-8");
    
    // 2.
   String userid  =request.getParameter("userid");
	String username = request.getParameter("username");
	String usertel  = request.getParameter("usertel");
	String userage  = request.getParameter("userage");

	System.out.println(userid);
	System.out.println(username);
	System.out.println(usertel);
	System.out.println(userage);
    
    // 데이터베이스 연결, sql, update 실행
    Connection con=null;
    PreparedStatement st = null;
	
	try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		

		Class.forName(driver); 
	
		con= DriverManager.getConnection(url, user, password); 
		
		 
		
		String sql =" update t_customer";
			sql+=	" set name=?,";
			sql+=	" tel=?,";
			sql+=	" age=?";
			sql+= " where id=? ";
				
		st = con.prepareStatement(sql);
				
		st.setString(1,username);
		st.setString(2, usertel);
		st.setString(3, userage);
		st.setString(4, userid);
				
		// 실행
		 st.executeUpdate() ;
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( st != null) st.close();
		if( con != null) con.close();
	}
    
    
    // 
    response.sendRedirect("manager_update_finish.html");
    
    %>