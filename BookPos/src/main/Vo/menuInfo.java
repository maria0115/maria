package main.Vo;

public class menuInfo {

	String name; //메뉴이름
	String type; //음료/간식
	int menupri; //메뉴가격
	int menuCnt; //메뉴수량
	
	public menuInfo() {
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMenupri() {
		return menupri;
	}

	public void setMenupri(int menupri) {
		this.menupri = menupri;
	}

	public int getMenuCnt() {
		return menuCnt;
	}

	public void setMenuCnt(int menuCnt) {
		this.menuCnt = menuCnt;
	}
	
	
	
}
