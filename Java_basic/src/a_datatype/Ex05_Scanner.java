package a_datatype;

import java.util.Scanner;
//or import java.util.*;
//or ctlr+shift+o


public class Ex05_Scanner {

	public static void main(String[] args) {
		
		// 1 .국, 영, 수 점수를 저장할 변수를 선언하고 값을 지정
		// 2. 총점 구하기
		// 3. 평균 구하기
		
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
		
		System.out.print("오늘도\t");
		System.out.print("우리는\t");
		System.out.print("행복이\t");
		
		
	}

}

///*
//# next() 와 nextLine() 차이점
//
//	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
//	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
//	
//	[ 예 ] 오늘도 우리는 행복이 의무다
//	
		
//	
//	next()는 4개의 토큰으로 인식하지만
//	nextLine()은 한 줄로 인식한다.
//*/