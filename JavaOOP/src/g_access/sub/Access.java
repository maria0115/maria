package g_access.sub;

public class Access {
	private	  String a = "프라이빗 데이타";		//동일패키지 접근불가, 다른패키지 , 상속클래스 접근불가
	public    String b = "퍼블릭 데이타";		//동일패키지, 다른패키지 , 다른패키지에서 상속클래스 접근가능
	protected String c = "프로텍티드 데이타";	//다른 패키지에 상속클래스까지 접근 가능, 동일패키지 접근불가
		  String d = "디폴트 데이타";			//동일패키지까지 접근가능,
	
	public void output(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);
	}

}
