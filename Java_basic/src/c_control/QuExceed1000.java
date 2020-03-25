package c_control;

public class QuExceed1000 {

	public static void main(String[] args) {
//		자연수 1부터 시작하여 모든 홀수와 3의 배수인 짝수를 더해 나간다. 
//		그리고 그 합이 언제 1000을 넘어서는지 그리고 1000을 넘어서 
//		값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
//		단 while 문을 이용한다.
		
		int i=0;
		int sum=0;
		do {
			
			
			if(i%2==1 | i%3==0)
			{
				sum+=i;
				System.out.println(i);
			}
			i++;
			
		} while (sum<1000);
		System.out.println("총합은"+sum);
	}

}
