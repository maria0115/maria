package temp;

import java.util.Scanner;

public class Test_연습반복문 {

	public static void main(String[] args) {
		//숫자사각형1(정울-1303)
//		Scanner put = new Scanner(System.in);
//		System.out.println("높이를 입력하세요");
//		int n= put.nextInt();
//		System.out.println("넓이를 입력하세요");
//		int m=put.nextInt();
//		int h=1;
//		if(n<100&m<100)
//		{
//		for(int i =0; i<n;i++)
//		{
//			for(int j=0; j<m;j++)
//			{
//				System.out.print(h++);
//			}
//			System.out.println();
//		}
//		}
//		else
//		{System.out.println("입력오류");}
		
		//숫자 사각형 3(정울-1304)
		/*Scanner put = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n= put.nextInt();
		
		
		int p=1;
		int h=1;
		if(n<100)
		{
		for(int i =0; i<n;i++)
		{
			
			h=1;
			h+=i;
			for(int j=0; j<n;j++)
			{
				System.out.print(h +" ");
				h+=n;
			}
			
			System.out.println();
		}
		}
		else
		{System.out.println("입력오류");}*/
		
		
		//숫자 사각형 2(정울-1856)
		Scanner put = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		int n= put.nextInt();
		System.out.println("넓이를 입력하세요");
		int m=put.nextInt();
		int h=1;
		int b=n;
		if(n<100&m<100)
		{
		for(int i =1; i<=n;i++)
		{
			
			
			if(h%m==0)
			{
				h=h+m;
				h++;
			}						
			for(int j=1; j<=m;j++)
			{
				
				//m마다 거꾸로 숫자 출력되게 하는 if 함수
				if(i%2==1)
				{
				System.out.print(h++ + " ");
					if(h%m==1)
					{--h;}
				}
				else
				{
					System.out.print(--h + " ");
					if(h%m==1)
					{--h;}					
				}
				
			}
			System.out.println();			
		}
		}
		else
		{System.out.println("입력오류");}

	}

}
