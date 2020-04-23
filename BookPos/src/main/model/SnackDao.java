package main.model;

import java.sql.SQLException;
import java.util.ArrayList;

import main.Vo.orderlistInfo;

public interface SnackDao {

	void insert(orderlistInfo vo) throws SQLException;//간식&음료 주문하기
	ArrayList selectList() throws Exception;//날짜,메뉴이름별로 매출 표 보여주기
	
	
}
