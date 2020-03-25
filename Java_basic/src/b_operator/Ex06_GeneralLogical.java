package b_operator;

import java.util.Scanner;

/*
 *  논리연산자의 상태를 먼저 확인
 *  일반논리 : &&(and) ||(or)
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
//		int a = 75;
//		char b = 'A';
//		//우등생 : 성적이 80점 이상이거나 태도가 'A'조건
//		if(a>=80||b=='A')
//		{
//			System.out.println("우등생입니다");
//			
//		}
//		else
//		{
//			System.out.println("우등생이 아닙니다");
//		}
//		
//		//성적향상반 : 성적은 80점 이상이고 태도가 'A'조건
//
//		if(a>=80&&b=='A')
//		{
//			System.out.println("성적향상반입니다");
//			
//		}
//		else
//		{
//			System.out.println("성적향상반이 아닙니다");
//		}
//		
//		
//		
		
		
//		//윤년
//		int nyn=0;
//		
//		Scanner put =new Scanner(System.in);
//		System.out.println("년도를 입력하세요");
//		nyn=put.nextInt();
//		
//		if(nyn%4==0)
//		{
//			if(nyn%100==0)
//			{
//				if(nyn%400==0)
//				{
//					System.out.println("윤년");
//				}
//				else {
//				System.out.println("평년");}
//			}else {
//			System.out.println("윤년");}
//		}else
//		{System.out.println("평년");}
//		
//	
		
		
		
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
 		 */
		char a;
		Scanner put =new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		a=put.next().charAt(0);
		int b=0;
		b=(int)a;
		if(b>=65&&b<=90)
		{
			System.out.println("대문자");
		}
		else if(b>=97&&b<=122)
		{
			System.out.println("소문자");
		}
		
		
		



	}

}
