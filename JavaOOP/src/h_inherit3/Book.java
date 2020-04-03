package h_inherit3;

/*
 * this : 자신 객체를 지칭하는 레퍼런스
 * super : 부모 객체를 지칭하는 레퍼런스
 * -------------------
 * this() : 다른 생성자 함수를 호출할 때
 * super() : 부모 생성자 함수를 호출할 때 
 */

public class Book extends Item{

	
	protected String juja, chul;
	public Book()
		{
			System.out.println("Book 기본생성자");
		}
	public Book(String bunho,String jemok,String juja,String chul)
		{
//			super.bunho=bunho;
//			super.jemok=jemok;
			super(bunho,jemok);	//무조건 첫번째 라인에 작성
			this.juja = juja;
			this.chul=chul;
			
			System.out.println("Book 인자 생성자");
		}
		
		//private < default < protected < public
		public void output()	//overriding
		{
			System.out.println(bunho);
			System.out.println(jemok);
			System.out.println(juja);
			System.out.println(chul);
		}
	

}
