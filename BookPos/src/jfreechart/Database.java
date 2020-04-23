package jfreechart;

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
			String sql = "SELECT menuname menu, sum(ordercnt) sum_cnt\r\n" + 
					"FROM ORDERLIST\r\n" + 
					"group by menuname";
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();
			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getString("menu"));				//****************
				temp.add( rset.getInt("sum_cnt"));		//****************		
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
