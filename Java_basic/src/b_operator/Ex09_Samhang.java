package b_operator;

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		
		int max=(a>b)?a:b; //()조건이 true면 a실행, false면 b실행
		//삼항연산자는 크기비교할때 주로 사용
		System.out.println(+max+"가 큰수");
		
	}

}
