package c_control;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		
		Scanner put = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		a = put.nextInt();
		System.out.println("b를 입력하세요");
		b=put.nextInt();
		System.out.println("c를 입력하세요");
		c = put.nextInt();
		
		if((a>=b) && (a>=c)) 
		{ // a가 b이상이고 a가 c이상
			System.out.println(b>=c?b:c); // 삼항연산자 통해 b가c이상인경우b출력 아닌경우 c출력
		}
		else if((b>=a) && (b>=c))
		{//b가 a이상이고 b가 c이상
			System.out.println(a>=c?a:c); // 삼항연산자 통해 a가c이상인경우a출력 아닌경우 c출력
		}
		else if ((c>=a) && (c>=b)) 
		{//c가 a이상이고 c가 b이상
			System.out.println(a>=b?a:b);
		}// 삼항연산자 통해 a가b이상인경우a출력 아닌경우 b출력

		

		

	}

}
