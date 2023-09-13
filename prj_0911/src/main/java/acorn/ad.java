package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ad {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public void close(AutoCloseable... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public ArrayList<ac> selectall(){
		Connection con = dbcon();
		String sql="select * from acorntbl";
		ArrayList<ac> list= new ArrayList<ac>();
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			 pst = con.prepareStatement(sql);
			 rs=pst.executeQuery();
			while(rs.next()) {
				String id=rs.getString(1);
				String pw=rs.getString(2);
				String name=rs.getString(3);
				ac a=new ac(id,pw,name);
				list.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con,rs,pst);
		return list;
	}
	public ArrayList<ac> getListPage(int page, int pageSize){
		Connection con = dbcon();
		String sql="select * from(select rownum num, id, pw , name from acorntbl) acorntbl where num between ? and ?";
		ArrayList<ac> list= new ArrayList<ac>();
		int start=0, end=0;
		start=(page-1)*pageSize+1;
		end=page*pageSize;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			 pst = con.prepareStatement(sql);
			 pst.setInt(1, start);
			 pst.setInt(2, end);
			 rs=pst.executeQuery();
			while(rs.next()) {
				String id=rs.getString(2);
				String pw=rs.getString(3);
				String name=rs.getString(4);
				ac a=new ac(id,pw,name);
				list.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con,rs,pst);
		return list;
	}
	public int getTotalCnt() {
		Connection con = dbcon();
		String sql="select count(*) from acorntbl";
		PreparedStatement pst=null;
		ResultSet rs=null;
		int count=0;
		
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			if(rs.next()) { 
			count = rs.getInt(1);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con,rs,pst);
		return count;
	}
}
