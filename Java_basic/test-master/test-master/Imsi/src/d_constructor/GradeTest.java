package d_constructor;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		GradeExpr[] jumsu = new GradeExpr[] {};
		
		
		
		int su; //입력받기 위한 수 변수
		System.out.println("점수를 입력해주세요");
		su = input.nextInt();
		
		for(int i=0 ; i<su ; i++) {
			
			jumsu[i] = new Student();
		}
		
		for(int i=0 ; i<g.jumsu.length ; i++) {
			System.out.print("점수들: "+g.jumsu[i]);
		}
		
		System.out.println("총점: "+g.getTotal());
		System.out.println("평균 : "+g.getAverage());
		System.out.println("최고 점수 : "+g.getGoodScore());
		System.out.println("최저 점수: "+g.getBadScore());
		

	}

}
