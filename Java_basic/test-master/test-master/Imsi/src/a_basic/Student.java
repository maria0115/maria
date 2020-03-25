package a_basic;

public class Student {

	//멤버변수 (member field)
	String name;
	int kor,eng,math;
	
	private int total; //private 를 지정하면 외부에서 접근 불가 
	private double avg;
	
	//멤버 함수 (member method / member function)
	int caltotal() {
		
		total = kor + eng + math;
		
		return total;
	}
	
	double calAve() {
		
		avg = (double)total /3 ;
		return avg;
	}
	
}
