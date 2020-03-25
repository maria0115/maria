package c_control;

public class QuMultiple2And7 {

	public static void main(String[] args) {
		// 1000이하의 자연수 중에서 2의배수이면서 
		//7의배수인 숫자를 출력하고 그 숫자들의 합을 구하여 출력해보자.
		
		int i=1;
		int sum=0;
			do {i++;
			
				if(i %2==0&i%7==0)
				{
					System.out.println(i);
					sum=sum+i;
				}
				
			} while (i<=1000);
		System.out.println("총합은 ? "+sum);

	}

}
