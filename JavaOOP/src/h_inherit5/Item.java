package h_inherit5;

public abstract class Item {	//나도 미완성이야

	protected String bunho, jemok;
	public Item()
	{
		System.out.println("Item 기본 생성자");
	}
	public Item(String bunho,String jemok)
	{
		this.bunho=bunho;
		this.jemok=jemok;
		System.out.println("Item 인자 생성자");
	}
	// privat < defalt < protected < public
	public abstract void output();	//overriding	
	//구현이 없어 선언만 했어 나 미완성이야
	
//	{
////		System.out.println(bunho);
////		System.out.println(jemok);
//		
//	}
}
