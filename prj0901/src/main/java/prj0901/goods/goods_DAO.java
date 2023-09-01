package prj0901.goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import prj0901.Customer;

public class goods_DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		// 데이터 베이스 연결
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

	public ArrayList<String> selectAll() {
		// 전체조회

		// 연결
		Connection con = dbcon();
		// sql
		String sql = "Select name from goodstbl";
		// sql실행
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<String> list = new ArrayList<>();
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 해제
		close(rs, pst, con);
		return list;
	}

	public goods selectOne(String id) {
		// 하나조회

		// db연결
		Connection con = dbcon();
		// sql
		String sql = "select * from goodstbl where id = ?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		goods g = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			// sql 실행
			// sql 싱행 결과 Customer 객체로 만들기
			rs = pst.executeQuery();
			if (rs.next()) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				String price_tmp = rs.getString(3);
				g = new goods(id_tmp, name_tmp, price_tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 자원해제
		close(rs, pst, con);

		return g;

	}

	public void insertgoods(goods g) {
		// 등록하기

		// db연결
		Connection con = dbcon();
		// sql작성
		String sql = "insert into goodstbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql 실행
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getId());
			pst.setString(2, g.getName());
			pst.setString(3, g.getPrice());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con);

	}

	public void deleteOne(String id) {
		//하나삭제
		
		// 연결

		// sql 작성

		// sql 실행

		// 연결해제
		Connection con = dbcon();
		String sql = "delete from goodstbl where id=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		close(pst, con);
	}
	
	public void updategoods(goods g) {
		//업데이트 수정
		
		//연결
		//변경 sql작성
		//실행
		//자원반납
		Connection con =dbcon();
		PreparedStatement pst = null;
		String sql = "update goodstbl set price=? where id=?";
		try {
			pst =con.prepareStatement(sql);
			pst.setString(1, g.getPrice());
			pst.setString(2, g.getId());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
	}
	
	
	 public static void main(String[] args) {
		 
		 goods_DAO  d = new goods_DAO();
		 d.deleteOne("c003");
		
	}
}
