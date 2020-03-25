package e_method;

import java.util.Scanner;

public class Ex02_연습2 {

	public static void main(String[] args) {
		/*
		 * 영문자를 입력하여 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오.
			  함수명 : checkUpper
			  인자 : char
			  리턴(반환) : char
		 * */
		Scanner put= new Scanner(System.in);
		System.out.println("영문자를 입력해주세요");
		char ch = put.next().charAt(0);
		
		char ch2 = checkLower(ch);
		System.out.println(ch2);
	

	}
	
	static char checkLower(char ch)
	{	//넘겨받은 인자 ch가 소문자라면 return true
		//그렇지 않으면 return false
		
		if(ch>='a'&ch<='z')
		{
			ch=(char) (ch-32);
			return ch;
		}
		else if(ch>'A'&ch<'Z')
		{
		return ch; 
		}
		return ch;
		
		
	}
	
	

}
