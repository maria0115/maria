package b_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_OX문제 {

	public static void main(String[] args) {
		// OX문제

		Scanner put = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n1=put.nextInt();
		put.nextLine();				//숫자입력
		int total[]=new int[n1];
		char [][]ch2=new char[n1][];
		for(int j=0; j<n1;j++)
		{
			Scanner put1 = new Scanner(System.in);
			System.out.println("OX퀴즈의 결과를 입력하시오");
			
			char []ch=put1.nextLine().toCharArray();
				
			for(int jj=0; jj<ch.length;jj++)	
			{	put.nextLine();
				ch2[j][jj]=ch[jj];
			}
		}
		
				
			int jum=0;
			int count=0;
			for(int i=0; i<ch2.length;i++)
			{
			for(int ii=0; ii<ch2[i].length;ii++)
			{			
					//OX입력
				//System.out.println(ch[i]);
				if(ch2[i][ii]=='O')
				{				
					count++;				
					for(int j=1; j==ch2.length;j++)
					{				
						if(ch2[i][ii]==ch2[i][j])
						{
							count++;
						}
					}				
				}
				else
				{
					count=0;
				}
				total[ii]=total[ii]+count;
			}	
			}
		
		
		
		for(int  ii=0;ii<n1;ii++)
		{
			System.out.println(total[ii]);	
		}
		

	}

}
