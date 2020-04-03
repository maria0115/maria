package h_inherit;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner put = new Scanner(System.in);
		System.out.println("언어를 선택하세요 1. 한국어  2. 영어  3. 일본어");
		int lan = put.nextInt();
		System.out.println("메세지를 선택하세요 1.인삿말, 2.자기소개, 3.하고픈말");
		int massage = put.nextInt();
		
		Lang lan1 =new Lang(lan,massage);
		if(massage == 1)
		{
			Insa insa = new Insa(lan);
		}
		else if(massage == 2)
		{
			Introduce intro = new Introduce(lan);
		}
		else if(massage == 3)
		{
			Iwantsaytoyou iwant = new Iwantsaytoyou(lan);
		}

	}

}
