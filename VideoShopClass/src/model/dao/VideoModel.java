package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.Video;

public class VideoModel implements VideoDao{
	String url="jdbc:oracle:thin:@192.168.0.10:1521:orcl";
	String user="video";
	String pass = "1234";
	public VideoModel() throws Exception{
		

		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	
	public void insertVideo(Video vo, int count) throws Exception{
		Connection con =null;
		
		try {
		//2. 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);
		//3. SQL 문장
		String sql = " INSERT INTO video  "
				+ " Values(sq_video_num.NEXTVAL, ?,?,?,?,?,?) ";
		
		//4. 전송객체 얻어오기
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, vo.getGenre());	
		st.setString(2, vo.getVideoName());		
		st.setString(3, vo.getDirector());
		st.setString(4, vo.getActor());
		st.setString(5, vo.getExp());
		st.setInt(6, count);
		//5. 전송
		st.executeUpdate();
		//6. 닫기
		st.close();}
		finally {
		con.close();}
	}
	


	public ArrayList selectVideo(int index, String word) throws Exception {
		Connection con =null;
		ArrayList data = new ArrayList();
		ArrayList temp = new ArrayList();
		try {
		
		con = DriverManager.getConnection(url,user,pass);
		String []colName = {"TITLE","ACTOR"};
		String sql = "select VIDEO_NUM,TITLE,ACTOR\r\n" + 
				"from video\r\n" + 
				"where " + colName[index] + " like ('%"+word+"%')";
		Statement st = con.createStatement();
		//5. 전송		
		ResultSet result = st.executeQuery(sql);	
		
		while(result.next())	
		{
			temp.add(result.getString("VIDEO_NUM"));
			temp.add(result.getString("TITLE"));
			temp.add(result.getString("ACTOR"));
			data.add(temp);
			
		}
		
			//ArrayList의 ArrayList 리턴
		st.close();}
		finally {
		con.close();}
		
		
		return data;
	}
	public Video selectByPK(String vnum)throws Exception
	{
		Connection con =null;
		Video vo = new Video();
		try {
		
		con = DriverManager.getConnection(url,user,pass);
		
		String sql = "select *\r\n" + 
				"from video\r\n" + 
				"where VIDEO_NUM = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, vnum);
		//5. 전송		
		ResultSet result = st.executeQuery();	
		
		while(result.next())	
		{
			vo.setVideoNo(result.getInt("VIDEO_NUM"));
			vo.setGenre(result.getString("GENRE"));
			vo.setVideoName(result.getString("TITLE"));
			vo.setDirector(result.getString("DIRECTOR"));
			vo.setActor(result.getString("ACTOR"));
			vo.setExp(result.getString("DESCRIPTION"));
		}
		
			//ArrayList의 ArrayList 리턴
		st.close();}
		finally {
		con.close();}
		
		
		return vo;
	}



	public void updateVideo(Video vo, int count) throws Exception {
		Connection con =null;
		
		try {
		//2. 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);
		//3. SQL 문장
		String sql = "update video\r\n" + 
				"set GENRE = ?,TITLE=?,DIRECTOR=?,ACTOR=?,DESCRIPTION=?,COUNT=?\r\n" + 
				"where video_num=?";
		
		//4. 전송객체 얻어오기
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, vo.getGenre());	
		st.setString(2, vo.getVideoName());		
		st.setString(3, vo.getDirector());
		st.setString(4, vo.getActor());
		st.setString(5, vo.getExp());
		st.setInt(6, count);
		st.setInt(7, vo.getVideoNo());
		//5. 전송
		st.executeUpdate();
		//6. 닫기
		st.close();}
		finally {
		con.close();}
		
	}


	public void deleteVideo(Video vo) throws Exception {
		
Connection con =null;
		
		try {
		//2. 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);
		//3. SQL 문장
		String sql = "delete from video\r\n" + 
				"where video_num=?";
		
		//4. 전송객체 얻어오기
		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, vo.getVideoNo());
		//5. 전송
		st.executeUpdate();
		//6. 닫기
		st.close();}
		finally {
		con.close();}
	}
	

}