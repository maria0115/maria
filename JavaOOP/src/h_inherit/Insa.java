package h_inherit;

public class Insa extends Lang{

	Lang lan=new Lang();
	
	public Insa()
	{
		//System.out.println("insa 기본생성자");
	}
	
//	public Insa(int n)
//	{
//		
//	}
	
	//if(massage==1)
	//{
		public Insa(int lan)
		{
			if(lan == 1)
			{
				System.out.println("안녕하세요");
			}
			else if(lan==2)
			{
				System.out.println("hi");
			}
			else if(lan==3)
			{
				System.out.println("곤니찌와");
			}
		}
	//}
	
	
	
}
