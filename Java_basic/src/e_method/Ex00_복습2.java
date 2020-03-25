package e_method;

import java.util.Scanner;

public class Ex00_복습2 {
	static int jumsu;
	public static void main(String[] args) {
		// 여기서 합격 여부를 출력하려면?
		String line = func();
		System.out.println(line);
	
		char result = method();
		System.out.println(result);
	}

	/** 
	 * method1
	 *  	- 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static  String func() {
		Scanner in = new Scanner(System.in);		
		jumsu = in.nextInt();
		if( jumsu >= 80) return "합격";
		else return "불합격";
		
	}
	
	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
	static char method() {
		char result=0;
		if(jumsu>=90)
		{
			result= 'A';
		}
		else if(jumsu>=80)
		{
			result= 'B';
		}
		else if(jumsu>=70)
		{
			result= 'C';
		}
	return result;
	}

}
