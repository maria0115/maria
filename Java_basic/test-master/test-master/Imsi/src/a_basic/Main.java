package a_basic;

public class Main {

	public static void main(String[] args) {
	
		/*
			클래스 안에 멤버를 찾기위해서는 변수. 으로 불러내줘야한다.
		 */
		
		//변수선언
		//Student s;
		
		//객체생성 (메모리에 확보)
		//s = new Student();
		Student s = new Student();
		
		s.kor =70;
		s.eng =88;
		s.math = 99;
		
		System.out.println("총점 : "+s.caltotal());
		
		//s.total = 100;
		System.out.println("평균 : "+s.calAve());
		
	}

}
