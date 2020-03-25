package c_control;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {
		Scanner put1 = new Scanner(System.in);
		System.out.println("값을 입력하세요");
//		int i= put1.nextInt();
//		
//		//1~N까지 숫자 출력
//		for(int a=1; a<=i;a++)	//
//		{
//			System.out.print(a);
//			System.out.print(" ");
//			if(a%5==0)
//			{System.out.println();}
//		}
		
		//2번문제
		/*문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
		N이 대문자이면 문자 N부터  Z까지 출력하라
		그 밖의 문자가 입력되면 Error 를 출력하라

		입력  출력
		f       abcdef
		X       XYZ
		6       Error*/
		/*System.out.println("영어입력");
		String nn=put1.next();
		char app=nn.charAt(0);

		if((app>=65) && (app<=92))		//if('A'<=app&&app<='Z')
		{
			for(int i=65; i<=app;i++)
			{
				//String i1=Integer.toString(i);	//코드를 바꾸고 싶다면 캐스팅
				char h =(char)i;
				System.out.println(h);
			}
		}
		else if(app>=95 & app <=122)	//if('a'<=app&&app<='z')
		{
			for (int j=app; j<=122; j++ )
			{
				//String j1=Integer.toString(j);	//그내용 그대로 출력되게
				char u=(char)j;
				System.out.println(u);
			}
		}
		
		else
		{System.out.println("Error");}*/
		
		//3번문제
		 /*[예]  입력     출력
		  
	     안녕 친구   구친 녕안
	     CarpeDiem   meiDepraC
	     
	   [힌트] 문자열의 길이 구할 때   length() 이용*/
		
		/*
		String an = put1.nextLine();
		
		int i =0;
		i= an.length();
		
		for (int j=i-1;j>=0;j--)
		{
			System.out.print(an.charAt(j));
		}
		
		*/
		
		int n=0;
		n=put1.nextInt();
		int hul=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				System.out.print(hul%10);
				//System.out.print("#");
				hul+=2;
			}
			System.out.println();
		}

		
	}

	private static int length(String an) {
		// TODO Auto-generated method stub
		return 0;
	}

}
