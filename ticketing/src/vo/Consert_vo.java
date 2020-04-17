package vo;

public class Consert_vo {

	String name, tel, conname,seat;
	int count; 
	String bill;
	
	public Consert_vo(){}
	
	public Consert_vo(String name, String tel, String conname, String seat, int count)
	{
		this.name = name;
		this.tel = tel;
		this.conname = conname;
		this.seat = seat;
		this.count = count;
		
	}

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

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


}
