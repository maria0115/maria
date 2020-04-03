package h_inherit3;

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
		
		public void output()
		{
			System.out.println(bunho);
			System.out.println(jemok);
			System.out.println(singer);
		}
	

}
