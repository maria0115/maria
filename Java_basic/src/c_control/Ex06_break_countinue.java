package c_control;

public class Ex06_break_countinue {

	public static void main(String[] args) {
		
		HERE:
			
		for(int j=0; j<2;j++)
			{
				
				for(int h=0; h<3;h++)
				{
//					if(h==1)
//						break;	//블럭 벗어나는 문장(반복 벗어나기)
//						//continue;	//블럭 끝으로 가기
					if(h==1)
						//break HERE;	//블럭 벗어나는 문장(반복 벗어나기)
						continue HERE;	// 내가 원하는 지점에 가까운 포문으로 나감
					//continue(명령문은 수행하지않고 다시 조건이 맞으면 반복 수행함)
					System.out.printf("< %d, %d>\n",j,h);	//6번 반복실행
				}
				
				System.out.println("data");
			
			} System.out.println("히히 나 나왔당");

	}

}
