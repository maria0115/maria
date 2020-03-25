package e_method;

import java.util.Scanner;

public class Ex02_연습 {

	public static void main(String[] args) {
		// (문제 1) 영문자를 입력하여 이 문자가 
		//소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오.
		/*
		 *     함수명 : checkLower
				  인자 : char
				  리턴(반환) : boolean
		 */
		Scanner put= new Scanner(System.in);
		System.out.println("영문자를 입력해주세요");
		char ch = put.next().charAt(0);
		
		boolean result = checkLower(ch);
		//System.out.println(result);

		if(result)
		{System.out.println("소문자");}
		else
		{
			System.out.println("소문자 아님");
		}
	}
	static boolean checkLower(char ch)
	{	//넘겨받은 인자 ch가 소문자라면 return true
		//그렇지 않으면 return false
		if(ch>='a'&ch<='z')
		{
			return true;
		}
		else
		{
		return false; 
		}
		
		
	}
	
	

}
