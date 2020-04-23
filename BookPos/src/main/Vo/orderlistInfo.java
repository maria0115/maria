package main.Vo;

import java.util.ArrayList;

public class orderlistInfo {

	int orderCnt; //주문한 수량
	int orderPri; //주문한 가격
	String menuname; //주문한 메뉴 이름
	String date; //주문일자


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOrderCnt() {
		return orderCnt;
	}

	public void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}

	public int getOrderPri() {
		return orderPri;
	}

	public void setOrderPri(int orderPri) {
		this.orderPri = orderPri;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

}
