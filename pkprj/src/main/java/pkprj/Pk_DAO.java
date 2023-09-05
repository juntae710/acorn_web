package pkprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Pk_DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	public Connection dbcon() {
		//데이터 베이스 연결
		Connection  con=null;
	
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) System.out.println("ok");
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
		// 닫기
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<String> selectAll(){
		//연결
		Connection con =dbcon();
		//sql
		String sql = "Select * from t_customer";
		//sql실행
		PreparedStatement pst = null;
		ResultSet rs=null;
		
		ArrayList<String> list = new ArrayList<>();
		try {
			pst=con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
				list.add(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//해제
		close(rs,pst,con);
		return list;
	}
	

	public Pk selectOne (String id) {
		//db연결
		Connection con = dbcon();
		//sql
		String sql = "select * from t_customer where id = ?";
		PreparedStatement pst = null;
			ResultSet	rs = null;
			Pk c = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			//sql 실행
			//sql 싱행 결과 Customer 객체로 만들기
			rs=pst.executeQuery();
			if(rs.next()) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				String tel_tmp = rs.getString(3);
				String age_tmp = rs.getString(4);
				 c = new Pk(id, name_tmp, tel_tmp,age_tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//자원해제
		close(rs,pst,con);
		
		return c;
		
	}
	
	

	
	public void insertMember(String id, String name ,String tel,String age) {
		//db연결
		Connection con =dbcon();
		//sql작성
		String sql ="insert into t_customer values(?,?,?,?)";
		PreparedStatement pst =null;
		try {
			//sql 실행
			pst =con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setString(3, tel);
			pst.setString(4, age);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//연결해제
		close(pst,con);
		
		
	}
	public void insertMember3(Pk t) {
		
		
		
		//db연결
		Connection con =dbcon();
		//sql작성
		String sql ="insert into t_customer values(?,?,?,?)";
		PreparedStatement pst =null;
		try {
			//sql 실행
			pst =con.prepareStatement(sql);
			pst.setString(1, t.getId());
			pst.setString(2, t.getName());
			pst.setString(3, t.getTel());
			pst.setString(4, t.getage());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//연결해제
		close(pst,con);
		
		
	}
	
	//삭제
	
	public void deleteOne (String id) {
		//연결
	
		//sql 작성
		
		//sql 실행
		
		//연결해제
		Connection con =dbcon();
		String sql ="delete from t_customer where id=?";
		PreparedStatement pst=null;
		try {
			pst =con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		close(pst,con);
	}
	

	
	public void updateMember(Pk p) {
		//연결
		//변경 sql작성
		//실행
		//자원반납
		Connection con =dbcon();
		PreparedStatement pst = null;
		String sql = "update t_customer set age=? where id=?";
		try {
			pst =con.prepareStatement(sql);
			pst.setString(1, p.getage());
			pst.setString(2, p.getId());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
	}
	
	public static void main (String[] arge) {
		//AcornDAO dao = new AcornDAO();
		//ArrayList<String> list = dao.selectAll();
		//System.out.println(list);
		
		//dao.insertMember(c);
		
		//dao.insertMember2("tset10","0914","준태");
		
		//Customer c = new Customer("tset11","0914","준태");
		//dao.insertMember3(c);
		
		//Customer  c= dao.selectOne("dy");
		//System.out.println(c);
		
		//dao.deleteOne("tset10");
		
		//dao.updateMember(new Customer("tset11","0710"));
		
	}

}