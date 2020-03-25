package b_array;

public class Ex06_동적크기 {

	public static void main(String[] args) {
		// 5*5배열
		
		
		
		char star[][]=new char [5][];
		
		for(int i=0;i<star.length;i++)
		{
			star[i]=new char[i+1];	//메모리 잡을때부터 낭비 없게끔
			for(int j=0; j<star[i].length;j++)
			{
				if(i>=j)
				star[i][j]='*';
			}
		}
		
		for(int i=0;i<star.length;i++)
		{
			for(int j=0; j<star[i].length;j++)
			{
				System.out.print(star[i][j]+" ");
			}
			System.out.println();
		}

	}

}
