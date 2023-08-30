<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.sql.*"%>    
<%

request.setCharacterEncoding("UTF-8");

String userid  =request.getParameter("userid");
String username = request.getParameter("username");
String usertel  = request.getParameter("usertel");
String userage  = request.getParameter("userage");

System.out.println(userid);
System.out.println(username);
System.out.println(usertel);
System.out.println(userage);

Connection con=null; 
PreparedStatement st = null;
ResultSet rs = null;

try{ 
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	  
	Class.forName(driver);  
	con= DriverManager.getConnection(url, user, password);  
	 
	
	String searchid="dy";
	String sql ="insert into t_customer values(?,?,?,?) "; 
	st = con.prepareStatement(sql);
	
	st.setString(1,userid);
	st.setString(2,username);
	st.setString(3,usertel);
	st.setString(4,userage);
	
	rs = st.executeQuery( ) ; 
 
if( rs.next() ) {
	out.print(rs.getString(1));  
	out.print(rs.getString(2));
	out.print(rs.getString(3));
	out.print(rs.getString(4));
}}catch(Exception e){
	e.printStackTrace();		
}

	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
response.sendRedirect("register_finish.html");
%>