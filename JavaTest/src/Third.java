

public class Third {
		/*
		 * 3. 다음 요구사항을 만족하는 은행 계좌 클래스를 정의하여 소스코드와 결과화면 
		  스크린 샷을 제출하시오
		   [요구사항]
		   가. 속성으로 예금주,계좌번호,잔액을 갖는다.
		      예금주는 String,계좌번호 String,잔액은 int로 정의하여라
		   나. 메소드로 인출 및 입금 메소드를 갖는다.
		       인출 메소드는 인자로 인출할 금액을 받고 잔액이 부족시에는
		       “잔액이 부족합니다”라는 메시지를 잔액이 충분할때는 인출한 금액을 출력하는 
		       메소드이다
		       입금 메소드는 인자로 입금할 금액을 받고 입금액을 잔액에 더하고
		       입금한 금액을 출력하는 메소드이다
		   다. toString()메소드를 오버라이딩하여 계좌정보 즉 얘금주,계좌번호,잔액을
		      출력하는 메소드를 정의하여라
		      예 예금주:자바맨, 계좌번호:123-456, 잔액:1000원*/
	 String name;
	 String number;
	 int total;
	
		public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  String getNumber() {
		return number;
	}

	public  void setNumber(String number) {
		this.number = number;
	}

	public  int getTotal() {
		return total;
	}

	public  void setTotal(int total) {
		this.total = total;
	}

		public Third()
		{
			
		}

		public void inchul(int inchul)
		{

			if(total-inchul>0)
			{
				total-=inchul;
				System.out.println("잔액은"+total+"입니다");
			}			
			else
			{
				System.out.println("잔액이 부족합니다");
			}						
		}
		public void ipgum(int ipgum)
		{
			total+=ipgum;
			System.out.println("잔액은 "+total+"입니다");
		}
		
		public String toString()
		{			
			return "예금주:"+name+"계좌번호"+number+total;
		}

		
	




}
