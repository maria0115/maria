package basic;

import java.sql.*;
import java.lang.*;

public class Testinsert {

	public static void main(String[] args) {		
		Connection con= null;
		//입력값 들어왔다고 생각하기
		int empno=9010;
		String ename="하이루";
		int sal=2000;
		try {
			//1.드라이버 메모리에 로딩
			//new oracle.jdbc.driver.OracleDriver();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection 얻어오기
			 con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","scott","tiger");
			System.out.println("성공");
			//3. SQL 문장
			String sql = "INSERT INTO emp(empno,ename,sal) VALUES(?,?,?)";
			//4. 전송객체 얻어오기
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, empno);
			st.setString(2,ename);
			st.setInt(3,sal);
			//5. 전송(**********)
			//st.executeUpdate(sql);
			st.executeUpdate();
			//6. 닫기
			st.close();
			
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		} finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				
			}
		}
		
		
	}

}
