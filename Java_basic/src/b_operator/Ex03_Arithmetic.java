package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		int a=0,b=0;
		
//		Scanner put = new Scanner(System.in);
//		System.out.println("a를 입력하세요");
//		a = put.nextInt();
//		System.out.println("b를 입력하세요");
//		b = put.nextInt();
//		
//		System.out.println("a*b = "+(a*b));
//
//		System.out.println("a-b = "+(a-b));
//
//		System.out.println("a+b = "+(a+b));
//
//		System.out.println("a/b = "+(a/b));
//		System.out.println("a^2 = "+Math.pow(a,2));
		
		//Scanner 선언
		Scanner put = new Scanner(System.in);
		//화면에 "정수를 입력하세요" 출력
		System.out.println("a를 입력하세요");
		//입력받은 정수를 a 변수에 저장
		a = put.nextInt();
		System.out.println("b를 입력하세요");
		b = put.nextInt();
//		//입력받은 수가 홀/짝수 구하기
//		if(a%3==0)
//		{
//			System.out.println("a는 3의 배수입니다");
//		}else
//		{
//			System.out.println("아닙니다.");
//		}
//		if(b%3==0)
//		{
//			System.out.println("b는 3의 배수입니다");
//		}else
//		{
//			System.out.println("아닙니다.");
//		}
		//입력받은 수가 3의 배수인지 아닌지
		if(a%2==0)
		{
			System.out.println("a는 짝수입니다");
		}else
		{
			System.out.println("홀수.");
		}
		if(b%2==0)
		{
			System.out.println("b는 짝수입니다");
		}else
		{
			System.out.println("홀수.");
		}

	}

}
