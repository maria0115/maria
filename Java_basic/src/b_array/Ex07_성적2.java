package b_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_성적2 {

	public static void main(String[] args) {
		// 학생수를 입력받기
		
		Scanner put = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int n= put.nextInt();	
		put.nextLine();
		
		int score[][]=new int [n][3];
	
		//입력
		for(int i=0; i<score.length;i++)
		{
			System.out.println("과목 입력하기");
			
			String line = put.nextLine();
			StringTokenizer  st = new StringTokenizer(line,"/");	//빨리, 코로나, 등등 끊어주는 함수
			
			
			int tokensu=st.countTokens();
			for(int j=0; j<tokensu;j++)
			{
				String temp = st.nextToken();
				int su = Integer.parseInt(temp);
				score[i][j] = su;
			}
			
		}
		
		//계산
		String gua[] = new String[]{"국어","영어","수학"};
		int []sum=new int[score.length];	//학생별 2명
		double []avg=new double[score.length];		
		for(int i=0; i<score.length;i++)
		{
			for(int j=0; j<score[i].length;j++)
			{
				sum[i]+=score[i][j];	//학생별 2명
				
			}
			avg[i]=(double)sum[i]/3;
			System.out.println(i+1+"번째 학생 총점"+sum[i]+"평균은"+avg[i]);
		}
		int []sum1=new int[3];	//과목별 3개
		double []avg1=new double[3];
		for(int i=0; i<3;i++)	//3열
		{
			for(int j=0; j<n;j++)	//2행
			{				
				sum1[i]+=score[j][i];	//과목별 3개
				avg1[i]=(double)sum1[i]/n;	//과목별
			}			
			System.out.println(gua[i]+"과목 총점"+sum1[i]+"평균은"+avg1[i]);
		}
		
		
		//출력
		//String gua[] = new String[]{"국어","영어","수학"};
		
		for(int i=0; i<score.length;i++)
		{
			for(int j=0; j<score[i].length;j++)
			{
				//System.out.println(i+1+"번째 학생의 점수는 "+score[i][j]);
				
			}
			//System.out.println(i+1+"번째 학생 총점"+sum[i]+"평균은"+avg[i]);
			//System.out.println(gua[i]+"과목 총점"+sum1[i]+"평균은"+avg1[i]);
		}
	}

}
