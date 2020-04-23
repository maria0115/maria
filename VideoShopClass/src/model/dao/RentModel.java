package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import model.RentDao;
import model.vo.Customer;


public class RentModel implements RentDao{
	String url="jdbc:oracle:thin:@192.168.0.10:1521:orcl";
	String user="video";
	String pass = "1234";
	
	Connection con;
	
	public RentModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

	public String selectBytel(String tel) throws Exception {

		String data="";
		try {
		
		con = DriverManager.getConnection(url,user,pass);
		String sql = "select NAME\r\n" + 
				"from CUSTOMER\r\n" + 
				"where tell = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		//5. 전송		
		ResultSet rs = st.executeQuery();

		while(rs.next())	
		{
			data = rs.getString("NAME");
			
		}
		
			//ArrayList의 ArrayList 리턴
		st.close();}
		finally {
		con.close();}
		
		
		return data;
		
		
	}

	/**
	 * 함수명 : rentVideo
	 * 인자 : 전화번호 (String), 비디오번호(int)
	 * 리턴값 : void
	 * 역할 : 대여테이블에 정보를 입력
	 */
	public void rentVideo(String tel, int vnum) throws Exception {

		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			System.out.println("성공");
			//3. SQL 문장
			String sql = "INSERT INTO RESERVATION(RE_NUM,TELL,VIDEO_NUM,RENT_DAY)\r\n" + 
					"values(sq_reservation_num.nextval,?,?,sysdate)";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tel);
			st.setInt(2, vnum);


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


	public int returnVideo(int vnum) throws Exception {
		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			System.out.println("성공");
			//3. SQL 문장
			String sql = "update RESERVATION\r\n" + 
					"set RETURN_YN = sysdate\r\n" + 
					"where VIDEO_NUM=? And RETURN_YN is null ";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, vnum);

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
		return 0;
	}

	public ArrayList selectList() throws Exception {

		ArrayList data = new ArrayList();		
		ArrayList temp = new ArrayList();
		try {
		
		con = DriverManager.getConnection(url,user,pass);
		String sql = "select r.VIDEO_NUM VIDEO_NUM, v.TITLE TITLE ,c.NAME NAME,r.tell tell, r.RENT_DAY+3 RETUEN_DAY,'미납' \"미납\"\r\n" + 
				"from RESERVATION r inner join VIDEO v\r\n" + 
				"on  r.VIDEO_NUM= v.VIDEO_NUM\r\n" + 
				"inner join CUSTOMER c\r\n" + 
				"on c.TELL = r.TELL\r\n" + 
				"where r.return_yn is null";
		PreparedStatement st = con.prepareStatement(sql);

		//5. 전송		
		ResultSet rs = st.executeQuery();

		while(rs.next())	
		{						
			temp.add(rs.getString("VIDEO_NUM"));
			temp.add(rs.getString("TITLE"));
			temp.add(rs.getString("NAME"));
			temp.add(rs.getString("tell"));
			temp.add(rs.getString("RETUEN_DAY"));
			temp.add(rs.getString("미납"));
			data.add(temp);
			
		}
		
			//ArrayList의 ArrayList 리턴
		st.close();}
		finally {
		con.close();}
		
		
		return data;
	}



	
	
}
