package h_inherit3;

public class Item {

	protected String bunho,  jemok;
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
	public void output()	//overriding
	{
		System.out.println(bunho);
		System.out.println(jemok);
	}
}
