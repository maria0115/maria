package main.Vo;

public class customerVo {

	String name; //회원이름
	String tel; //회원전화번호
	int point;  //회원포인트점수
	
	public customerVo(){}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getCount() {
		return point;
	}

	public void setCount(int count) {
		this.point = count;
	}


}
