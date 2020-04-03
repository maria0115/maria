package h_inherit4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ch="";
		do {
		Scanner put = new Scanner(System.in);
		System.out.println("언어를 선택하세요 1. 한국어  2. 영어  3. 일본어");
		int lan = put.nextInt();
		System.out.println("메세지를 선택하세요 1.인삿말, 2.자기소개, 3.하고픈말");
		int massage = put.nextInt();
		Lang lang = new Lang();
		
		if(lan==1)
		{lang = new Kor();
		}
		else if(lan==2)
		{lang = new Eng();
		}
		else if(lan ==3)
		{lang = new Jap();
		}
		
		if(massage==1)
		{
			lang.hi();
		}
		if(massage==2)
		{
			lang.introduce();
		}
		if(massage==3)
		{
			lang.wish();
		}

		System.out.println("다시 시작하겠습니까?");
		ch = put.next();
	}while(ch.equals("y"));
	}
}
