package h_inherit;

public class Iwantsaytoyou extends Lang {

	public Iwantsaytoyou()
	{
		//System.out.println("iwantsaytoyou 기본생성자");
	}
	//else if(massage==3)
	//{
		public Iwantsaytoyou(int lan)
		{
			if(lan == 1)
			{
				System.out.println("해적왕이 될거야");
			}
			else if(lan==2)
			{
				System.out.println("i will be captain");
			}
			else if(lan==3)
			{
				System.out.println("해적왕데스");
			}
			//System.out.println("iwantsaytoyou 인자 생성자");
		}
	//}
	
	
}
