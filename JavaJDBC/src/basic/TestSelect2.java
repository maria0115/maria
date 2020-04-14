package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect2 {

	public static void main(String[] args) {
		try
		{
			//1. 드라이버를 메모리 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","scott","tiger");
			//3. SQL문장(*)
			//String sql = "사원테이블의 총 사원수";			
			String sql = "SELECT count(empno) count FROM emp";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송		
			ResultSet result = st.executeQuery(sql);			
			//6. 결과를 확인(####)
			while(result.next())	//다음레코드가 있으면 true, 없으면 false
			{
				System.out.print(result.getInt("COUNT") + "\t");;
				
			}
			
			
			//7. 닫기
			result.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("실패"+e.getMessage());
		}

	}

}
