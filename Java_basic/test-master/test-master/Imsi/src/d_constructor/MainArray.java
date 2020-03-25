package d_constructor;

import java.util.Scanner;

public class MainArray {
	
	/**
	 * 	3명의 학생 정보를 입력받아 각 학생별 총점 평균을 구한다면
	 */
	
	public static void main(String[] args) {
	
				
		// 추가적으로 각 과목별 총점을 구한다면?
		Scanner input = new Scanner(System.in);
		
		Student[] s = new Student[3];
		
		System.out.println("학생이름을 입력해주세요");
		String name = input.next();
		System.out.println("국,영,수 입력해주세요");
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		
		
		for(int i=0; i<s.length ; i++) {
			s[i] = new Student(name, kor, eng, math);
			s[i].setName(name);
			s[i].setKor(kor);
			s[i].setEng(eng);
			s[i].setMath(math);
			
			System.out.println((i+1)+"번째학생 이름: "+s[i].getName());
			System.out.println("총점: "+s[i].calTotal()+" 평균: "+s[i].calAverage());
		}
		
		
		
	}

}
