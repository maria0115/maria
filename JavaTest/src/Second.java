
public class Second {

	public static void main(String[] args) {
		/*
		 * 2. 1부터 100까지 숫자 중 3의 배수 이거나 5의 배수인 숫자의 합을 구하는 
			   소스코드와 결과화면 스크린 샷을 제출하시오
			    [요구사항] 
			   가. 단, 3와 5의 공배수인 경우 제외
			   나, while문 버전과  for문 버전으로 두가지 소스코드를 작성하시오
		 * 
		 * */
		int i=0, sum=0;
		while(i<100)
		{
			if(i%3==0|| i%5==0)
			{
				if(!(i%3==0 && i%5==0))
				{sum+=i;}				
			}
			i++;
		}
		System.out.println("while문 결과 "+sum);
		
		int sum2=0;
		for(int j=1; j<100;j++)
		{
			if(j%3==0|| j%5==0)
			{
				if(!(j%3==0 && j%5==0))
				{sum2+=j;}				
			}

		}
		System.out.println("for문 결과 "+sum2);
		
		
	}

}
