package c_control;

public class QuPrintReverse {

	public static void main(String[] args) {
//		 1부터 100까지 출력하고 난 다음에, 
//		다시 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자.
//		 do~while문을 한번만 사용해서 구현한다.
		int i=1;
		do {
			System.out.print((i++) +" ");
			
		} while (i<=100);
		
		--i;
		--i;
		System.out.println("\n");
		do {
			
			System.out.print(+(i--) +" ");
			
		} while (i>=1);
		
		

	}

}
