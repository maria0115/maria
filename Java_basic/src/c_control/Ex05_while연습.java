package c_control;

import java.util.Scanner;

public class Ex05_while연습 {

	public static void main(String[] args) {
		
//		// 369게임
//		 1부터 50까지 숫자 중에서 3.6.9 게임처럼
//		 3, 6, 9 숫자를 포함하면  그 갯수만큼 "짝" 글자를 출력하고
//		 그렇지 않으면 그 숫자를 출력한다.
		
		
//		for(int i=1; i<=33;i++)
//		{
////			if(i==3|i==6|i==9)
////			{
////				System.out.println("짝");
////			}
////			else
////			{
////			System.out.println(i);
////			}
//			int su=i;
//			
//			boolean su369=false;	//if문이 아닐때만 숫자 출력하고 싶은 변수
//			
//			while(su!=0)
//			{
//				int na = su%10;
//				
//				if(na==3|na==6|na==9)
//				{				
//					System.out.print("짝");
//					su369 = true;
//				}
//				su = su/10;
//			
//			}
//			if(su369)System.out.println();
//			else System.out.println(i);
		
		
		int count=0;
		for(int i= 1; i<10000;i++)
		{
			int su = i;		
			
			while(su!=0)
			{
				int na = su %10;
				
				if(na==8)
				{
					count++;
				}
				su=su/10;
			}
		}
		System.out.println(count);
			
			
		}
		

	}

