package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr();
		String ch = " ";
		
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("숫자 두개 입력해주세요");
//			int num1 = input.nextInt();
//			int num2 = input.nextInt();
			// 입력값들을 멤버변수에 저장하기
//			c.setNum1(num1);
//			c.setNum2(num2);
			
			c.setNum1(input.nextInt());
			c.setNum2(input.nextInt());
			
			// 사칙연산 메소드 호출하여서 출력
			System.out.println("덧셈"+c.getAddtion());
			System.out.println("뺄셈"+c.getSubtraction());
			System.out.println("곱셈"+c.getMultplication());
			System.out.println("나눗셈"+c.getDivision());
			
			System.out.println("다시 하시겠습니까?");
			ch = input.next();
			
		}while(ch.equals("y")|ch.equals("Y")); //.equals는 문자열 내용비교
			
		
	}

}
