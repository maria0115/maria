package h_inherit;

public class Introduce extends Lang{
	Lang lan=new Lang();
	public Introduce()
	{
		//System.out.println("Introduce 기본생성자");
	}
	//else if(massage==2)
	//{
		public Introduce(int lan)
		{
			if(lan == 1)
			{
				System.out.println("소개합니다");
			}
			else if(lan==2)
			{
				System.out.println("introduce");
			}
			else if(lan==3)
			{
				System.out.println("소개데스요");
			}
			//System.out.println("introduce 인자생성자");
		}
	
	
	
}
