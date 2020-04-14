package basic;

import java.sql.*;
import java.lang.*;

public class TestUpdate2 {

	public static void main(String[] args) {	
		
		int deptno = 20;
		int salInc = 500;
	
		try {
			//1.드라이버 메모리에 로딩
			//new oracle.jdbc.driver.OracleDriver();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","scott","tiger");
			//3. SQL 문장
			String sql = "UPDATE emp SET sal=sal+? WHERE deptno=?";
			//4. 전송객체 얻어오기
			
			PreparedStatement st =con.prepareStatement(sql);
			st.setInt(1, salInc);
			st.setInt(2, deptno);
			//5. 전송
			//	- int executeUpdate() : INSERT/UPDATE/DELETE
			//	- ResultSet executeQuery() : SELECT
			int result = st.executeUpdate();
			System.out.println(result+"행을 실행함");
			//6. 닫기
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		} 
		
		
	}

}
