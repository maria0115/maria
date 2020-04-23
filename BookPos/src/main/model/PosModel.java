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



public class PosModel implements PosDao{
	
	String url="jdbc:oracle:thin:@192.168.0.50:1521:orcl";
	String user="kangda";
	String pass = "1234";
	
	
	
	//회원가입
	public int insert(customerVo vo) throws SQLException {
		Connection con= null;

		try {		
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);

			//3. SQL 문장
			String sql = "INSERT INTO CUSTOMER(NAME,tel)\r\n" + 
					"select ?,?\r\n" + 
					"FROM DUAL\r\n" + 
					"WHERE NOT EXISTS\r\n" + 
					"(select *\r\n" + 
					"from CUSTOMER\r\n" + 
					"where tel=?)";
			//4. 전송객체 얻어오기

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getName());
			st.setString(2, vo.getTel());
			st.setString(3, vo.getTel());


			int i=st.executeUpdate();

			if(i==0)
			{
				
				st.close();
				con.close();
				return 0;
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
		return 1;
	}
	
	
	//책 입고
	public int bookInsert(BookInfo vo) throws Exception {

		Connection con = null;

		try {

			con = DriverManager.getConnection(url, user, pass);

			String booksql = " INSERT INTO BOOK ( BOOKNUM, TITLE , GENRE , WRITER, PRICE,CNT ) "
					+ " VALUES(SQ_BOOK_NUM.nextval,?,?,?,?,?) ";
			PreparedStatement bookst = con.prepareStatement(booksql);
			bookst.setString(1, vo.getTitle());
			bookst.setString(2, vo.getGenre());
			bookst.setString(3, vo.getWriter());
			bookst.setInt(4, vo.getPrice());
			bookst.setInt(5, vo.getCnt());

			int bookrs = bookst.executeUpdate();
			if (bookrs == 0) {
				con.rollback();
				return -1; // 메세지 띄워주기위한 return값
			}
			bookst.close();

			String manasql = " INSERT INTO MANAGEBOOK (manabooknum , booknum) "
					+ " VALUES (sq_manageBook_num.nextval , SQ_BOOK_NUM.CURRVAL) ";
			PreparedStatement manast = con.prepareStatement(manasql);

			int manars = manast.executeUpdate();
			if (manars == 0) {
				con.rollback();
				return -2;
			}
			manast.close();
			con.commit();

		} finally {
			con.close();
		}
		return 0;
	}
	
	// 포인트 적립
	public void PointSave(String name, String tel) throws Exception {
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);

		String sql = "UPDATE customer \r\n"
				+ " SET point=(select sum(o.orderprice)*0.1 point from bookorder o, customer c WHERE o.tel = c.tel AND c.name='"
				+ name + "') \r\n" + " WHERE tel='" + tel + "'";

		PreparedStatement st = con.prepareStatement(sql);

		st.executeUpdate();

		st.close();
		con.close();

		return;
	}
	
	//결제
	public int bookpay(ArrayList data, String tel) throws Exception {

		for (int i = 0; i < data.size(); i++) {
			ArrayList temp = new ArrayList();
			temp = (ArrayList) data.get(i);
			int vnum = 0;
			String title = "";
			String genre = "";
			String writer = "";
			int price = 0;
			for (int j = 0; j < temp.size(); j++) {

				vnum = Integer.parseInt(temp.get(0).toString());
				title = String.valueOf(temp.get(1));
				genre = String.valueOf(temp.get(2));
				writer = String.valueOf(temp.get(3));
				price = Integer.parseInt(temp.get(4).toString());

			}

			Connection con = null;

			try {
				// 2. Connection 얻어오기
				con = DriverManager.getConnection(url, user, pass);

				// 3. SQL 문장
				String sql = "INSERT INTO BOOKORDER ( ORDERNUM, ORDERDATE , ORDERPRICE , TEL, MANABOOKNUM)\r\n"
						+ "					VALUES(sq_Bookorder_num.nextval,sysdate," + price + ",'" + tel
						+ "',(select m.MANABOOKNUM\r\n" + "                    from book b inner join MANAGEBOOK m\r\n"
						+ "                    on  b.BOOKNUM=m.BOOKNUM\r\n" + "                    where title = '"
						+ title + "'))";
				// 4. 전송객체 얻어오기

				PreparedStatement st = con.prepareStatement(sql);

				st.executeUpdate();

				// 6. 닫기
				st.close();

				String cntsql = "update BOOK\r\n" + "set cnt = cnt-1\r\n" + "where title = '" + title + "'";
				PreparedStatement cntst = con.prepareStatement(cntsql);
				cntst.executeUpdate();

				cntst.close();

			} catch (Exception e) {
				System.out.println("실패:" + e.getMessage());
			} finally {
				try {
					con.close();
				} catch (SQLException e) {

				}
			}
		}

		return 0;
	}
	
	// 책 검색 현황 출력
	public ArrayList Bookview() throws SQLException {
		Connection con = null;
		ArrayList data = new ArrayList();

		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * FROM book WHERE cnt > 0";
			PreparedStatement st = con.prepareStatement(sql);
			// 5. 전송
			ResultSet result = st.executeQuery();
			while (result.next()) {
				ArrayList temp = new ArrayList();
				temp.add(result.getString("TITLE"));
				temp.add(result.getString("GENRE"));
				temp.add(result.getString("WRITER"));
				temp.add(result.getString("PRICE"));
				temp.add(result.getString("CNT"));

				data.add(temp);
			}
			// ArrayList의 ArrayList 리턴
			st.close();
		} finally {
			con.close();
		}
		return data;
	}
	
	
	//이전 구매목록 보여주기 
	public ArrayList selectList() throws Exception{
		Connection con = null;
		ArrayList data = new ArrayList();
		
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			String sql = " SELECT o.orderdate , o.orderprice , c.name , b.title " + 
					" FROM bookorder o , customer c , book b , managebook m " + 
					" WHERE o.manabooknum = m.manabooknum AND "
				+ " o.tel = c.tel AND m.booknum = b.booknum ";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				ArrayList temp = new ArrayList();
				
				temp.add(rs.getString("orderdate"));
				temp.add(rs.getString("orderprice"));
				temp.add(rs.getString("name"));
				temp.add(rs.getString("title"));
				
				data.add(temp);
			}
			rs.close();
			st.close();
		}finally {
			con.close();
		}
		return data;		
	}
	
	//책제목으로 검색
	public ArrayList selectTitle(String word) throws SQLException{
		
		Connection con = null;
		ArrayList data = new ArrayList();
		
	      
		try {
			
			con = DriverManager.getConnection(url,user,pass);
		      
		      String sql = "SELECT TITLE, GENRE, WRITER, PRICE , CNT  "
		            + " FROM book WHERE title like ('%"+ word +"%') and cnt > 0 ";
		      
		     PreparedStatement st = con.prepareStatement(sql);
		     ResultSet rs = st.executeQuery();

		      while(rs.next()) {
		         ArrayList temp = new ArrayList();
		         temp.add(rs.getString("TITLE"));
		         temp.add(rs.getString("GENRE"));
		         temp.add(rs.getString("WRITER"));
		         temp.add(rs.getString("PRICE"));
		         temp.add(rs.getString("CNT"));

		         data.add(temp);
		      }
		      st.close();
			
		}finally {
			con.close();
		}
	      
	      
	   
	   return data;
	}
	
	//전화번호 회원목록 보여주기 
	public ArrayList selectList(String cu) throws Exception {
		Connection con = null;
		ArrayList data = new ArrayList();

		try {

			con = DriverManager.getConnection(url, user, pass);

			String sql = "select NAME,TEL,POINT\r\n" + "from CUSTOMER\r\n" + "where TEL like ('%" + cu + "%')";

			PreparedStatement st = con.prepareStatement(sql);
			// 5. 전송
			ResultSet result = st.executeQuery();

			while (result.next()) {
				ArrayList temp = new ArrayList();
				temp.add(result.getString("NAME"));
				temp.add(result.getString("TEL"));
				temp.add(result.getString("POINT"));
				data.add(temp);

			}

			// ArrayList의 ArrayList 리턴
			st.close();
		} finally {
			con.close();
		}

		return data;
	}
	
	// 제목검색해서 나온 제목눌러서 가운데 Jtable에 보여주기
	public ArrayList selectByPK(String vnum) throws Exception {

		Connection con = null;
		ArrayList temp = new ArrayList();
		try {

			con = DriverManager.getConnection(url, user, pass);

			String sql = "select BOOKNUM,TITLE,GENRE,WRITER,PRICE\r\n" + "from BOOK\r\n" + "where TITLE = ? ";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vnum);
			// 5. 전송
			ResultSet result = st.executeQuery();

			while (result.next()) {
				temp.add(result.getString("BOOKNUM"));
				temp.add(result.getString("TITLE"));
				temp.add(result.getString("GENRE"));
				temp.add(result.getString("WRITER"));
				temp.add(result.getInt("PRICE"));

			}

			// ArrayList의 ArrayList 리턴
			st.close();
		} finally {
			con.close();
		}

		return temp;

	}
	
	//전화번호검색으로 회원존재 유/무 확인 
	public String selectByTel(String tel) throws Exception{
		Connection con =null;
		String temp = null;
		try{
			con = DriverManager.getConnection(url,user,pass);
			
			String sql = " SELECT name , tel FROM customer WHERE tel=? ";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tel);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				temp = rs.getString("tel");
			}
			
			st.close();
			rs.close();
		}finally {
			con.close();
		}
		return temp ;
	}
	
	//전화번호 검색으로 회원정보 가져오기
	public customerVo selectCustomer(String tel) throws Exception{
		customerVo vo = new customerVo();
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user,pass );
			
			String sql =" SELECT name , tel FROM customer WHERE tel=? ";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tel);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setTel(rs.getString("TEL"));
			}
			rs.close();
			st.close();
			
		}finally {
			con.close();
		}
		
		return vo;
	}


	

}
