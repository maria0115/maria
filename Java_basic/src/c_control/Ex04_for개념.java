package c_control;

public class Ex04_for개념 {

	public static void main(String[] args) {
//		for(int i=0; i<5;i++)
//		{
//			System.out.println("안녕하세요");
//		}
		
		//1~10까지의 합 구하기
//		int sum=0;
//		for(int i=0; i<101;i++)
//		{
//			sum+=i;
//			System.out.print(i+"+");
//			System.out.println("="+sum);
//		}
		
//		int even=0, odd=0;
//		for(int i=0; i<101;i++)
//		{
//			if(i%2==0)
//			{
//				even+=i;								
//			}
//			
//			if(i%2==1)
//			{
//				odd+=i;			
//			}
//			
//		}
//		System.out.println("짝수는="+even);
//		System.out.println("홀수는="+odd);
		
		//3. a부터 z까지 출력
		
		for (char a='A';a<='z';a++)
		{
			System.out.print(a);
		}
		System.out.println();
		for (char ch='A';ch<='z';ch++)
		{
			if(ch%2==1)
			{
			System.out.print(ch);
			}
		}
		System.out.println();
		for (char ch='A';ch<='z';ch+=2)
		{			
			System.out.print(ch);
			
		}
		System.out.println();
		for (char b='Z';b>='A';b--)
		{
			System.out.print(b);
		}
		
		
	}

}
