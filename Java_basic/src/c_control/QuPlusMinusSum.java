package c_control;

public class QuPlusMinusSum {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
		//몇까지 더해야 총합이 100이상이 되는지를 구하는 프로그램을 작성하시오.
		
		
		int sum=0;
		int i=0;
		while(sum<100)
		{
			i++;
				
			if(i%2==0)
			{		
				i=-(i);
					
			}
			sum=sum+i;
			if(i<0)
			{
				i=-(i);
			}
			
			
			System.out.println(i);
			
		}
		System.out.println("총합은 ? "+sum);

	}

}
