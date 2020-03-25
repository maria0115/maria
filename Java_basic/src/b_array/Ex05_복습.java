package b_array;

public class Ex05_복습 {

	public static void main(String[] args) {
		// 3 * 4의 char형 이차원 배열 선언
		int i=3,j=4;
		char [][]ch=new char[i][j];
		
		//값입력
//		for(int k=0;k<ch.length;k++)
//		{
//			for(int h=0;h<ch[k].length;h++)
//			{
//				ch[k][h]='Z';
//			}
//		}
		char al='A';
		for(int k=0;k<ch.length;k++)
		{
			for(int h=0;h<ch[k].length;h++)
			{				
				ch[k][h]=(al);
				al++;	
			}
		}
		//출력
		for(int k=0;k<ch.length;k++)
		{
			for(int h=0;h<ch[k].length;h++)
			{
				System.out.print(ch[k][h]);
			}
			System.out.println();
		}
	}

}
