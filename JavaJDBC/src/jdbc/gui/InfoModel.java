package jdbc.gui;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InfoModel {

	void insert(InfoVO vo) throws SQLException;//(public abstract)인터페이스에는 기본적으로 붙어있음
	public abstract ArrayList<InfoVO> selectAll() throws SQLException;
	
	InfoVO selectByTel(String tel) throws SQLException;
	
	void modify(InfoVO vo) throws SQLException;
	void delete(String tel) throws SQLException;
	
}
