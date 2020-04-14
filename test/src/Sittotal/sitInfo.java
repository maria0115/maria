package Sittotal;

public class sitInfo {

	String number ;
	int price ;
	
	sitInfo() {}
	
	
	sitInfo(String number , int price) {
		
		this.number = number;
		this.price = price;
	}

	

	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
