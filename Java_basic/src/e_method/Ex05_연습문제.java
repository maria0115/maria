package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Ex05_연습문제 {

	public static void main(String[] args) {	//main함수에 return값은 없다		
		Scanner put = new Scanner(System.in);		
		System.out.println("후보자수를 입력하세요");
		int n=put.nextInt();		
		put.nextLine();			
		System.out.println("1부터 "+n+"까지의 후보들중에 100명이하의 투표자들은 한명씩 후보를 입력하세요");
		//String votes="";
		int votes[]=new int[100];
		for(int i=0; i<100;i++){
			votes[i] = put.nextInt();
			if(votes[i]>n&votes[i]<1)
			{
				i--;
				System.out.println("다시 1부터"+n+"까지의 후보들 중에 입력해라");
			}			
			if(votes[i]==0)
				break;			//System.out.println(votes[i]);
		}				
		//후보자 별 투표수
		int count[]=new int[n];
		for(int i=0; i<n;i++){
			for(int j=0; j<votes.length;j++){
			if(i+1==votes[j]){
				count[i]++;
			}
			}
		}		
		for(int i=0; i<count.length; i++){
		System.out.println(count[i]);
		}		
		int max1=0;
		for(int i=0; i<count.length;i++){
			if(count[i]>max1){
				max1=count[i];				
			}
		}
		int max[]=new int[n];
		for(int i=0; i<count.length;i++){
			if(max1==count[i]){
				max[i]=max1;}
		}		
		for(int i=0; i<count.length;i++){
			if(max[i]==max1){
		System.out.println("최다 특표자는?"+(i+1)+"님입니다~!");
			}
		}
		//votes = put.nextLine();
			
//		StringTokenizer st = new StringTokenizer(votes);
//		int count=st.countTokens();
//		int votes1[]= new int[count];
//		for(int i =0; i<count;i++)
//		{
//			String temp = st.nextToken();
//			votes1[i]=Integer.parseInt(temp);
//			System.out.println(votes1[i]);
//		}
		
		
		
		
		
	}

}
