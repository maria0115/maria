package e_method;

public class Ex04_변수의범위 {	//계속 반환하기 힘드니까
	//멤버변수
	static int a,b;		//참조하는 변수도 static사용해줘야함
	static int sum=0;	//멤버변수는 heap (초기화)
	public static void main(String[] args) {	
		int a=10;		//지역변수는 stack(초기화안됨)
		b=20;	
		add();
		System.out.println("입력받은 데이터의 합"+sum);
	}
	
	static void add()	
	{		
		int sum=a+b;		
	}


}
