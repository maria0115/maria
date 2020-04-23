package main.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.Vo.BookInfo;
import main.Vo.customerVo;
import main.Vo.orderlistInfo;

public class SnackModel implements SnackDao{
	
	String url = "jdbc:oracle:thin:@192.168.0.50:1521:orcl";
	String user = "kangda";
	String pass = "1234";
	
	public SnackModel() throws Exception{
		
		//드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	//간식&음료 주문하기 
	public void insert(orderlistInfo vo) throws SQLException{
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,user,pass);
			
			String sql = " INSERT INTO ORDERLIST (ORDERNUM, MENUNAME, ORDERCNT, ORDERPRI,ORDERDATE) Values "
					+ " (sq_orderlist_num.NEXTVAL,?,?,?,sysdate)  ";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,vo.getMenuname()); //메뉴이름
			st.setInt(2, vo.getOrderCnt()); //수량
			st.setInt(3,vo.getOrderPri()); //가격
			
			
			st.executeUpdate();
			st.close();
			
		}finally {
			con.close();
		}
		
	}
	
	//날짜,메뉴이름별로 매출 표 보여주기 
	public ArrayList selectList() throws Exception{
		Connection con = null;
		ArrayList data = new ArrayList();
		
		
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			
			String sql = " SELECT to_char(o.orderdate,'YYYY-MM-DD'), m.menuname , sum(o.orderpri) sum " + 
					" FROM ORDERLIST o , menu m " + 
					" WHERE o.menuname =  m.menuname AND to_char(o.orderdate,'YYYY-MM-DD') IN (SELECT to_char(orderdate,'YYYY-MM-DD') " + 
					" From orderlist " + 
					" GROUP BY to_char(orderdate,'YYYY-MM-DD'))  " + 
					" GROUP BY m.menuname, to_char(o.orderdate,'YYYY-MM-DD') " + 
					" ORDER BY to_char(o.orderdate,'YYYY-MM-DD')";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				ArrayList temp = new ArrayList();
				
				
				temp.add(rs.getString("to_char(o.orderdate,'YYYY-MM-DD')"));
				temp.add(rs.getString("menuname"));
				temp.add(rs.getString("sum"));
				
				data.add(temp);
				
			}
			st.close();
			rs.close();
			
		}finally {
			con.close();
		}
		
		return data;
		
	}

}
	