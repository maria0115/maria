package h_inherit5;

public class Cd extends Item{

	
	protected String singer;
	public Cd()
		{
			
		}
	public Cd(String singer,String bunho,String jemok)
		{
			this.singer=singer;
			super.bunho=bunho;
			super.jemok=jemok;
		}
		//부모가 미완성인걸 자식이 채워줘야함
		public void output()	//output2를 강제로 overriding시키려고
		{
			System.out.println(bunho);
			System.out.println(jemok);
			System.out.println(singer);
		}
	

}
