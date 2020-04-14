import java.util.Calendar;
import java.util.Scanner;

/*
 * 3번에서 정의한 클래스를 사용하여 
   아래 요구사항을 만족하도록 프로그래밍을 하여 소스코드와 결과화면 스크린 샷을
   제출하시오
   [요구사항]
   가. 은행계좌 클래스를 사용하여 객체를 생성한다
   나. 객체의 멤버(예금주,계좌번호,잔액)를 아래처럼 초기화 하여라
      예금주: 자바맨
      계좌번호: 123-456
      잔액:10000

   다. 15000원을 입금하도록 메소드를 호출하여라
   라. 30000원을 출금하도록 메소드를 호출하여라
 * */
public class FOUR {

	
//	Third third = new Third();
	public void main(String[] args) {
		System.out.println("aa");
		Third third = new Third();
		third.setName("자바맨");
		third.setTotal(10000);
		third.setNumber("123-456");
		//FOUR four = new FOUR();
		//init();
		System.out.println(third.getName());
		third.inchul(20000);
		third.ipgum(15000);
		System.out.println(third.toString());
		

	}
	void init()
	{
//		third.setName("자바맨");
//		third.setTotal(10000);
//		third.setNumber("123-456");
	}
		}
//			public String toString(String name,String number, int total)
//			{
//				this.total = total;
//				this.name = name;
//				this.number = number;
//				return "예금주:"+name+"계좌번호"+number+total;
//			}


