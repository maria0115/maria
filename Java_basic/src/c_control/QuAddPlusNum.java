package c_control;

public class QuAddPlusNum {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과
		int sum=0;
		for(int i=1;i<10;i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}
		System.out.println("총합은"+sum);
	}

}
