package basic;

import java.sql.*;
import java.lang.*;

public class TestUpdate {

	public static void main(String[] args) {		
		try {
			//1.드라이버 메모리에 로딩
			//new oracle.jdbc.driver.OracleDriver();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","scott","tiger");
			//3. SQL 문장
			//String sql = "9001번 사원의 이름은 '홍길숙이고 급여는 4500로 변경하기'";
			//String sql = "UPDATE emp SET ename='홍길숙', sal=4500 WHERE empno='9001'";			
			//String sql = "DELETE FROM emp_copy";	//기본적인 커밋
			//String sql = "20번 부서의 사원들 급여를 500 인상"
			String sql = "UPDATE emp SET sal=sal+500 WHERE deptno='20'";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송
			//	- int executeUpdate() : INSERT/UPDATE/DELETE
			//	- ResultSet executeQuery() : SELECT
			int result = st.executeUpdate(sql);
			System.out.println(result+"행을 실행함");
			//6. 닫기
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		} 
		
		
	}

}
