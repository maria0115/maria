package c_control;

import java.util.Scanner;

public class Ex03_if_성적 {

	public static void main(String[] args) {
		//0. 국,영,수 점수 입력받아서 총점, 평균 출력
		//1. 평균을 보고 학점 매기기(A~F)
		// if 문 이용
		int gu=0, yu=0, su=0;
		
		
		//입력
		Scanner put = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		gu=put.nextInt();
		
		
		System.out.print("영어점수를 입력하세요");
		yu=put.nextInt();
		
		
		System.out.print("수학점수를 입력하세요");
		su=put.nextInt();
		
		double avr=0, sum=0;
		
		sum = gu+yu+su;
		System.out.println("총점은 : "+ sum);
		avr = (double)sum/3; //평균은 소수점까지 나와야함
		System.out.println("평균은 : " +avr);
		
		if(avr>=90)
		{
			System.out.println("A");
		}
		else if(avr>=80)
		{
			System.out.println("B");
		}
		else if(avr>=70)
		{
			System.out.println("C");
		}
		else if(avr>=60)
		{
			System.out.println("D");
		}
		else if(avr>=50)
		{
			System.out.println("E");
		}
		else if(avr>=40)
		{
			System.out.println("F");
		}

	}

}
