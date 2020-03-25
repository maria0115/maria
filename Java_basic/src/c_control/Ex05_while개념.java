package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념 {

	public static void main(String[] args) {
		// 1~10까지의 합을 출력
//		int sum =0 ;
//		int i=0;
//		while(i<=10)
//		{
//			
//			sum+=i;
//			i++;
//			System.out.println(sum);
//			System.out.print(sum+"+"+i+"=");
//		}
//		System.out.println("총합은"+sum);
		
		// 숫자 하나 입력받기
//		Scanner put = new Scanner(System.in);
//		System.out.println("숫자하나 입력하기");
//		int n = put.nextInt();
		
		//구구단 출력
//		INT I=1;
//		INT J=1;
//		INT SU=0;
//		WHILE(I<=9)
//		{
//			SYSTEM.OUT.PRINTLN(N*I+"="+N+"*"+I);
//			I++;
//		}
		
		//문장을 입력받아 단어로 나눠서 출력
		//"빨리 코로나 끝났으면 좋겠습니다"
//		Scanner put = new Scanner(System.in);
//		System.out.println("문자열 입력하기");
//		String line = put.nextLine();
//		StringTokenizer st = new StringTokenizer(line);	//빨리, 코로나, 등등 끊어주는 함수
//		
//		while(st.hasMoreTokens())	//next 토큰이 남아있을 때 true, false이면 반복문 벗어남
//		{
//			String temp = st.nextToken();
//			System.out.println(temp);
//			
//		}
		
//		Scanner put = new Scanner(System.in);
//		System.out.println("점수 입력하기(ex. 90/80/70/60)");
//		String line = put.nextLine();
//		StringTokenizer st = new StringTokenizer(line,"/");	//빨리, 코로나, 등등 끊어주는 함수
		
//		while(st.hasMoreTokens())	//next 토큰이 남아있을 때 true, false이면 반복문 벗어남
//		{
//			String temp = st.nextToken();
//			int su = Integer.parseInt(temp);	//String을 int형식 변환하는 법
//			System.out.println(++su);	//91 81 71 61
//			
//		}
		
		Scanner put = new Scanner(System.in);
		System.out.println("점수 입력하기(ex. 90 80 70 60)");
		String line = put.nextLine();
		StringTokenizer st = new StringTokenizer(line);	// 단어씩 끊어줌(90,80,70,60)
		int i=0,j=0;
		while(st.hasMoreTokens())	//다음 단어가 더 있는지 찾고, 있을 때까지 반복
		{
			String temp = st.nextToken();	//하나하나씩 끊긴 토큰들을 첫 음절부터 temp에 저장
			//첫번째 순환시 temp에 "90"저장
			//두번째 순환시 temp에 "80"저장
			//세번째 순환시 temp에 "70"저장

			int su = Integer.parseInt(temp);	//String의 내용 그대로를 숫자로 변환
			
			if(su%2==0)
			{
				i++;
			}
			else if(su%2==1)
			{j++;}
			
			
		}
		System.out.println("짝수 : "+i);
		System.out.println("홀수 : "+j);
		
	}

}
