package c_control;

import java.util.Scanner;

public class QuIfMerge {

	public static void main(String[] args) {
		
//양수이면서 짝수
//출력 완료 (1초 경과) - 정상 종료
		int i=0;
		Scanner put = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		i = put.nextInt();
		
		if(i>0)
		{
			if(i%2==0)
			{
				System.out.println("양수이면서 짝수는"+i);
			}
			else
			{System.out.println("양수이면서 짝수가 아님");}
		}
		
		

	}

}
