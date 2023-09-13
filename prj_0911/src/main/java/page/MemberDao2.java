package page;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao2 {
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

	public int getTotalCnt() {

		Connection con = dbcon();
		String sql = "select count(*) from member_tbl_11";
		int totalCnt = 0;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			if (rs.next()) {
				totalCnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return totalCnt;

	}

	public ArrayList<Member> selectAll() {
		Connection con = dbcon();
		String sql = "select * from member_tbl_11";
		ArrayList<Member> list = new ArrayList<>();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String m_id = rs.getString(1);
				String m_pw = rs.getString(2);
				String m_name = rs.getString(3);
				String m_tel = rs.getString(4);
				String m_birthday = rs.getString(5);
				int m_point = rs.getInt(6);
				String m_grade = rs.getString(7);

				Member m = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
				list.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(con, pst, rs);
		return list;

	}

	// 현재페이지에 대한 목록 가져오기
	// 입력 : int page, int pageSize (현재페이지번호 , 페이지size크기)
	// 반환 : ArrayList<Member> (고객목록)

	public ArrayList<Member> getListPage(int page, int pageSize) {

		int startPage = 0, endPage = 0;
		startPage = (page - 1) * pageSize + 1;
		endPage = page * pageSize;

		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<>();
		Connection con = dbcon();
		String sql = "SELECT * from(SELECT rownum num,m_id,m_pw,m_name,m_tel,m_birthday,m_point,m_grade\r\n"
				+ " from MEMBER_TBL_11) where num BETWEEN ? and ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);

			rs = pst.executeQuery();
			while (rs.next()) {
				String m_id = rs.getString(2);
				String m_pw = rs.getString(3);
				String m_name = rs.getString(4);
				String m_tel = rs.getString(5);
				String m_birthday = rs.getString(6);
				int m_point = rs.getInt(7);
				String m_grade = rs.getString(8);

				Member m = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst, rs);
		return list;

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

	public static void main(String[] args) {
		MemberDao2 dao = new MemberDao2();
		/*
		 * if (dao.dbcon() != null) { System.out.println("ok"); }
		 */
		/*
		 * int result = dao.getTotalCnt(); System.out.println(result);
		 */
		/*
		 * ArrayList<Member> list = dao.selectAll(); for(Member s : list) {
		 * System.out.println(s); }
		 */
		ArrayList<Member> list = dao.getListPage(3, 5);
		for (Member s : list) {
			System.out.println(s);
		}
	}
}
