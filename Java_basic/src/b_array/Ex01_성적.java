package b_array;

public class Ex01_성적 {

	public static void main(String[] args) {
		/*1. 배열(array)
			
			자료형
			-기본형
			-참조형:클래스/배열 = 스택 힙
			
			주소를 담는 건 4 byte
			배열의 번지수는 stack에 저장
			배열의 내용은 heap에 저장 [개수] 0번째부터 n-1번째 n개수만큼 */
		
		//int []kor;
		//kor = new int[5];
//		int [] kor = new int [6];
////		kor[0]=90;
////		kor[1]=88;
////		kor[2]=89;
////		kor[3]=99;
//		kor[4]=70;
//		kor[5]=77;
			
//		1번째 학생 점수 : 0
//		2번째 학생 점수 : 0
//		3번째 학생 점수 : 0		//stack에 잡히는 애들은 초기화를 해줘야 하는데
//		4번째 학생 점수 : 0		//heap에 잡히는 애들은 초기화가 되어있음
//		5번째 학생 점수 : 70
//		6번째 학생 점수 : 77	
			//kor[5]=77;	//kor[5]를 입력해 줬기 때문 다섯개까지만 들어감
		// 내용입력은 전부 입력해줘야함
		
		//배열 초기화
		//int []kor = new int[] {98,50,46,77,70};
		int []kor = {98,50,46,77,70};	//앞에 new int[] 생략가능
		
		int total =0;
		//for(int i=0;i<=5;i++)
		for(int i=0;i<kor.length;i++)	//kor의 배열개수 만큼
		{
			System.out.println((i+1) +"번째 학생 점수 : "+kor[i]);
			total+=kor[i];
			
			
		}
		System.out.println("총점은? "+total);
		double total2 = (double)total;
		double avg = 0;
		
		avg = total2/kor.length;
		System.out.println("평균은 ? "+avg);

	}

}
