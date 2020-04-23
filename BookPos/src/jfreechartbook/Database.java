package jfreechartbook;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@192.168.0.50:1521:orcl";
	String USER ="kangda";
	String PASS = "1234";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			String sql = "SELECT b.genre genre , sum(o.orderprice) sum_price\r\n" + 
					"FROM bookorder o, book b, managebook m \r\n" + 
					"WHERE o.manabooknum = m.manabooknum AND b.booknum = m.booknum\r\n" + 
					"group by b.genre";
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();
			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getString("genre"));				//****************
				temp.add( rset.getInt("sum_price"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
