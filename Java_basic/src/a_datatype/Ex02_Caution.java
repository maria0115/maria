package a_datatype;

public class Ex02_Caution {

	public static void main(String[] args) {
		
		// (1) 문자형에 정수를 대입하면?
				char c = 1;
				char ch = 'A';
				System.out.println("ch 값 : "+ch);
				
				
		// (2) 정수형에 문자를 대입하면?
		 int a = 'B';
		 int b = 64;
		 char c1 =97;
		 System.out.println(" a 값: "+a);
		 System.out.println(" b 값: "+c1);
		 
		 
		
		// (3) 실수형 float에 실수를 대입하면?
		float aa=0.1f;
		System.out.println(+aa);
		// (4) 실수형에 정수를 대입하면?
		double bb =3;
		System.out.println(+bb);
		
		// (5) 정수형에 실수를 대입하면?

		int ccb = (int)3.6; //(int) = int로 캐스팅 가능 int 형식출력
		System.out.println(+ccb);
		
		// (6) 정수형에 100억 숫자를  대입하면?
		int up = 2000000000;
		long doi = 100000000000L;
		System.out.println(+doi);

	}

}
