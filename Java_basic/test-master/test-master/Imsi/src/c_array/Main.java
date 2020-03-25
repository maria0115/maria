package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Student [] s = new Student[3];		// 학생 수 3은 배열의 갯수를 의미한다.
			//배열을 위한 new 객체생성
		
		for(int i =0 ; i<s.length ; i++) {
			s[i] = new Student();
		}
		
		// 각 학생의 이름과 국영수 점수를 입력받아 이름과 총점, 평균 출력
//		s[0].setName(in.next());
		
		//System.out.println("1번째 학생 : "+s[0].getName());
		for(int i=0 ; i<s.length ; i++) {
			System.out.println("학생의 이름을 입력해주세요");
			s[i].setName(in.next());
			System.out.println("국,영,수 점수를 입력해주세요");
			s[i].setKor(in.nextInt());
			s[i].setEng(in.nextInt());
			s[i].setMath(in.nextInt());

			
			System.out.println((i+1)+"번째학생 이름: "+s[i].getName());
			System.out.println("총점: "+s[i].calTotal()+" 평균:"+s[i].calAverage());

		}
			
		
		
			
		}
		
		
	}


