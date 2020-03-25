package c_control;

public class QuThirdOperation {

	public static void main(String[] args) {
		
		 int num1=50, num2=100;
         int big, diff;
//         
//         big = (num1>num2)? num1:num2; //조건?참:거짓;
//         System.out.println(big);
//         
//         diff = (num1>num2)? num1-num2: num2-num1;
//         System.out.println(diff); 
		if(num1>num2)
		{
			System.out.println(num1);
		}
		else
		{
			System.out.println(num2);
		}
		
		if(num1>num2)
		{
			System.out.println("차이는? "+(num1-num2));
		}
		else
		{
			System.out.println("차이는? "+(num2-num1));
		}

	}

}
