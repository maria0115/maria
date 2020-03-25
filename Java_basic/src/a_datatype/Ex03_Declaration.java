package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		
//		국어점수를 저장할 변수 선언 - 값 대입
		int kor;
		kor = 90;
//		
//		// 초기화 : 변수 선언시 값 대입
		int eng=90;
				
		//  kor와 eng 두개 이상의 변수를 한 번에 선언
//		int kor=100,eng=100;
		System.out.println("" +kor + " " +eng);
		System.out.printf("국어: %d 영어: %d ",kor,eng);
		System.out.printf("국어: %d 영어: %d \n",kor,eng);
		System.out.printf("국어: %d 영어: %d \n",kor,eng);
	

		
		//---------------------------------------------------
		// 점수바꾸기 - swap
		
		int swap=0;
		swap = kor;
		kor=eng;
		eng=swap;
		System.out.printf("국어: %d 영어: %d \n",kor,eng);
		
		if(kor==eng)
		{
			System.out.println(" 점수는 : "+kor);
		}
		else if(kor<=eng)
		{
			System.out.println("국어가 더큼 ");
			
		}
		else
		{
			System.out.println("영어가 더큼");
		}

		
	}

}
