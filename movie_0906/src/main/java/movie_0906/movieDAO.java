package movie_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class movieDAO {
	
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";	 
	  ;	
	
	
	public Connection dbcon(){	 
		Connection con =null;
		try {
			Class.forName(driver);
			con  =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public ArrayList<movie>  getmovieList(){		
		
		 Connection con  =dbcon();		 
		 String sql=" select  * from  movietbl ";
		 ArrayList<movie> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){				
				 String name=rs.getString(1);
				 String time= rs.getString(2);
				 
				 movie movie = new movie(name, time);
				 list.add(movie);						 
			   //  list.add(  new Food(rs.getString(2) , rs.getString(3), rs.getInt(4) ) );  	
			}	
			rs.close();
			pst.close();
			con.close();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	 
		return list;	 
		
	}
	
	

	public static void main(String[] args){
		  movieDAO m = new movieDAO();
	//	  f.dbcon();
		  ArrayList<movie> list  = m.getmovieList();	  
		  System.out.println( list);
		  
	}
	
	
}
