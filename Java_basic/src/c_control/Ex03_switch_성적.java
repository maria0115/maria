package c_control;

import java.util.Scanner;

public class Ex03_switch_성적 {

	public static void main(String[] args) {
				//0. 국,영,수 점수 입력받아서 총점, 평균 출력
				//1. 평균을 보고 학점 매기기(A~F)
				// switch 문 이용
		
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
		String sungjuk="";
		int avr2 = (int)avr;
		switch(avr2/10)	//문자,정수,변수, 문자열(수행될 수도 안될수도)
		{
		case 10:
		case 9:sungjuk="A"; break;
		case 8:sungjuk="B"; break;
		case 7:sungjuk="C"; break;
		case 6:sungjuk="D"; break;
		case 5:sungjuk="E"; break;
		case 4:sungjuk="F"; break;
		default :sungjuk= "다시 재수강"; break;
		
		
		}
		System.out.println(sungjuk);


	}

}
