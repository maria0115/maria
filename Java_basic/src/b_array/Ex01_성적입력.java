package b_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적입력 {

	public static void main(String[] args) {
		/* 학생 점수를 입력받아 평균과 총점을 출력
		 * 
		 * 입력형식 : 80/88/87
		 * 출력형식 : 
		 * 			총점 : XXX
		 * 			평균 : XXX
		 */
		
		Scanner put = new Scanner(System.in);
		System.out.println("점수 입력하기");
		String line = put.nextLine();
		StringTokenizer st = new StringTokenizer(line,"/");
		
		
		
		/*
		 * int score[]= new int[3];
		 * 
		 * for(int i=0; st.hasMoreTokens(); i++)
		 * {
		 * 		String token = st.nextToken();
		 * 		score[i] = Integer.parseInt(token);
		 * }
		 */
	
		
		int ss = st.countTokens();

		String score[]=new String[ss];
		for(int i=0; i<ss;i++)		//for(int i=0; st.hasMoreTokens(); i++)
		{
			score[i]= (String) st.nextToken();
		}
		
		int score2[]=new int[ss];
		int  total=0;
		for(int j=0; j<ss;j++)
		{
			score2[j] = Integer.parseInt(score[j]);
			total += score2[j];
		}
		System.out.println("총점은"+total);
		
		double avg=0;
		
		avg=(double)total/ss;
		System.out.println("평균은"+avg);
		
		
		
		
		
		
		
		
					

	}

}
