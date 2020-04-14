package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect3 {

	public static void main(String[] args) {
		try
		{
			//1. 드라이버를 메모리 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","hr","hr");
			//3. SQL문장(*)
			//String sql = "hr 계정에서 사원번호, 사원 전체이름, 부서명을 출력하되
			//급여가 3000이상인 사원 목록을 출력하시오";			
			String sql = "select e.EMPLOYEE_ID id,e.FIRST_NAME||LAST_NAME name, d.DEPARTMENT_NAME dept\r\n" + 
					"from employees e inner join  DEPARTMENTS d\r\n" + 
					"on e.DEPARTMENT_ID = d.DEPARTMENT_ID\r\n" + 
					"where SALARY>=3000\r\n"+
					"order by EMPLOYEE_ID";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송		
			ResultSet result = st.executeQuery(sql);			
			//6. 결과를 확인(####)
			while(result.next())	//다음레코드가 있으면 true, 없으면 false
			{
				System.out.print(result.getInt("ID") + "\t");
				System.out.print(result.getString("NAME") + "\t");
				System.out.println(result.getString("DEPT") + "\t");
				
				
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
