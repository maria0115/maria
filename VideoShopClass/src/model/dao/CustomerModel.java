package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{
	String url = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
	String user = "video";
	String pass = "1234";
	
	public CustomerModel() throws Exception{
	 	// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	public void insertCustomer(Customer vo) throws Exception{
		// 2. Connection 연결객체 얻어오기
		// 3. sql 문장 만들기
		// 4. sql 전송객체 (PreparedStatement)		
		// 5. sql 전송
		// 6. 닫기 
		
		Connection con= null;

		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			System.out.println("성공");
			//3. SQL 문장
			String sql = "INSERT INTO CUSTOMER(NAME,TELL,ADDR,EMAIL,ADDTEL) VALUES(?,?,?,?,?)";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getCustName());
			st.setString(2, vo.getCustTel1());
			st.setString(3, vo.getCustAddr());
			st.setString(4, vo.getCustEmail());
			st.setString(5, vo.getCustTel2());

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
	
	public Customer selectByTel(String tel) throws Exception{
		Customer dao = new Customer();
		
		Connection con= null;

		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			System.out.println("성공");
			//3. SQL 문장
			String sql = 
					"select NAME,TELL,ADDR,EMAIL,ADDTEL\r\n" + 
					"from CUSTOMER\r\n" + 
					"where tell = ?";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tel);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next())
			{
			dao.setCustName(rs.getString("NAME"));
			dao.setCustEmail(rs.getString("EMAIL"));
			dao.setCustAddr(rs.getString("ADDR"));
			dao.setCustTel1(rs.getString("TELL"));
			dao.setCustTel2(rs.getString("ADDTEL"));
			}
			
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
		
		
		
		
		return dao;
		
	}
	
	public int updateCustomer(Customer vo) throws Exception{
		
		int result = 0;
		Connection con= null;

		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			//System.out.println("성공");
			//3. SQL 문장
			String sql = 
					"update CUSTOMER\r\n" + 
					"set name = ?,\r\n" + 
					"TELL = ?,\r\n" + 
					"ADDR = ?,\r\n" + 
					"EMAIL = ?,\r\n" + 
					"ADDTEL = ?\r\n" + 
					"where tell = ?";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getCustName());
			st.setString(2, vo.getCustTel1());
			st.setString(3, vo.getCustAddr());
			st.setString(4, vo.getCustEmail());
			st.setString(5, vo.getCustTel2());
			st.setString(6, vo.getTfCustTelSearch());

			st.executeUpdate();
			//6. 닫기
			st.close();
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		} finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				
			}
		}
		
		return result;
	}
}
