package h_inherit5;

public class Dvd extends Item{

	
		protected String baeu, gamdok;
		public Dvd()
		{
			
		}
		public Dvd(String bunho,String jemok,String baeu,String gamdok)
		{
			this.baeu= baeu;
			this.gamdok=gamdok;
			super.bunho=bunho;
			super.jemok=jemok;
		}

	
	
		public void output()
	{
		System.out.println(bunho);
		System.out.println(jemok);
		System.out.println(baeu);
		System.out.println(gamdok);
	}

}
