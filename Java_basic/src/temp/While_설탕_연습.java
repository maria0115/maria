package temp;

import java.util.Scanner;

public class While_설탕_연습 {
	
	public static void main (String[] args) {
		//while문을 벗어난 후 sum의 값이 
		//1부터 10까지 더한 55가 출력되도록 밑줄에 들어갈 알맞은 연산자는?
		/*int n = 1;
		  int sum = 0;
		  while( true ){
		     sum += n;
		     if ( ++n   >   10 ) break;
		  }
		  System.out.println("SUM = " + sum ); */
		
		//입력받은 값에 5로 나눈 나머지가 또 5로 나눌 수 없다면  3으로 나누어봄
		//if 문=5 continue; if문=3 
		
		Scanner put = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int n = put.nextInt();
		int count =0;
		while(!(n==0))
		{
			if(n-5>=5|n==5)
			{
				count++;
				n=n-5;
				
			}
			else if(n-3>=3|n==3)
			{
				count++;
				n=n-3;
			}
			else if(n==0|n<3)
			{
				
				break;
			}
			else
			{
				break;
			}
		}
		
		if(n==0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("-1");
		}
		
		
		  
		  
		
		
	}

}
