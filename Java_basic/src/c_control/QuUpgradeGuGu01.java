package c_control;

public class QuUpgradeGuGu01 {

	public static void main(String[] args) {
		// 아래와 같은 출력결과를 보이는 
		//업그레이드 구구단 프로그램을 작성하시오.
//		2x1=2 2x2=4
//				3x1=3 3x2=6 3x3=9
//				4x1=4 4x2=8 4x3=12 4x4=16
//				5x1=5 5x2=10 5x3=15 5x4=20 5x5=25
//				6x1=6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36
//				7x1=7 7x2=14 7x3=21 7x4=28 7x5=35 7x6=42 7x7=49
//				8x1=8 8x2=16 8x3=24 8x4=32 8x5=40 8x6=48 8x7=56 8x8=64
//				9x1=9 9x2=18 9x3=27 9x4=36 9x5=45 9x6=54 9x7=63 9x8=72 9x9=81

		
		
		
		for(int i=2; i<=9;i++)
		{
			
				System.out.println(i+"단"+"\n");
				for(int j=1; j<=i;j++)
				{
					System.out.print(" "+i+"*"+j+"="+(i*j));
					
				}
				System.out.println("\n");
			
		}


	}

}
