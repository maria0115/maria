package b_operator;

import java.util.Scanner;

public class Ex09_samhang2 {

	public static void main(String[] args) {
		//학생 점수를 입력받아 80점이상이면 "합격" 출력하고 그렇지 않으면 "불합격"출력
		// 삼항연산자 이용
		
		int su=0;
		Scanner put = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		su = put.nextInt();
		
		String a="합격",b="불합격";
		
		String result = (su>=80)?a:b; //다이렉트로 "합격":"불합격" 해도됨
		System.out.println("결과는 "+result);
			

	}

}
