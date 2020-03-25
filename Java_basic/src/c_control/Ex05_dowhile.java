package c_control;

import java.util.Scanner;

public class Ex05_dowhile {

	public static void main(String[] args) {
		/*while(true)	//false면 한번도 실행하지 않음 조건을 먼저 봄
		{
			Scanner put = new Scanner(System.in);
			System.out.println("숫자하나 입력하기");
			int n = put.nextInt();

			//구구단 출력

			int su=0;
			for(int i=1;i<=9;i++)
			{
				System.out.println(n*i+"="+n+"*"+i);
				i++;
			}
			System.out.println("구구단 다시할까요?");
			String result = put.next();
			if(result.equals("N")|result.equals("n"))
				break;		//블럭 벗어나는 문장

		}*/
		
		String result ="";
		do					//조건이 맞지 않아도 한번은 실행함, 조건은 명령문 나중에 실행
		{
			

			//구구단 출력
			Scanner put = new Scanner(System.in);
			System.out.println("숫자하나 입력하기");
			int n = put.nextInt();

			int su=0;
			for(int i=1;i<=9;i++)
			{
				System.out.println(n*i+"="+n+"*"+i);
				
			}
			System.out.println("구구단 다시할까요?");
			result = put.next();
			
			
		}while(result.equals("Y")|result.equals("y"));
	}

}
