package ct_0907.acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
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
	
	public ArrayList<AcornClass> selectAll (){
		Connection con = dbcon();
		ArrayList<AcornClass> list = new ArrayList<>();
		String sql = "select * from acorntbl";
		ResultSet rs = null;
		PreparedStatement pst = null;
		
		
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String id_temp = rs.getString(1);
				String pw_temp = rs.getString(2);
				String name_temp = rs.getString(3);
				
				AcornClass a =new AcornClass(id_temp,pw_temp,name_temp);
				
				list.add(a);
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
}
