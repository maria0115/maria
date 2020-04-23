package main.model;

import java.sql.SQLException;
import java.util.ArrayList;

import main.Vo.BookInfo;
import main.Vo.customerVo;

public interface PosDao {

	int insert(customerVo vo) throws SQLException;//회원가입
	int bookInsert(BookInfo vo) throws Exception;//책 입고
	ArrayList selectList() throws Exception;//이전 구매목록 보여주기 
	ArrayList selectTitle(String word) throws SQLException;//책제목으로 검색
	ArrayList selectList(String cu) throws Exception;//전화번호 회원목록 보여주기 
	ArrayList selectByPK(String vnum) throws Exception;//제목검색해서 나온 제목눌러서 가운데 Jtable에 보여주기 
	String selectByTel(String tel) throws Exception;//전화번호검색으로 회원존재 유/무 확인 
	customerVo selectCustomer(String tel) throws Exception;//전화번호 검색으로 회원정보 가져오기
	int bookpay(ArrayList data, String tel) throws Exception;
	void PointSave(String name, String tel) throws Exception;
}
