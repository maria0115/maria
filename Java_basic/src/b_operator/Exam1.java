package b_operator;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		
		int a=0;
		int avr=0;
		
		Scanner put = new Scanner(System.in);
		System.out.println("a점수 입력");
		a = put.nextInt();
		
		System.out.println("a점수는 : "+a);
		
		
		if(a >= 80 && a<90)
		{
			System.out.println("평균");
		}else {System.out.println("평균 ㄴㄴ");}

	}

}
