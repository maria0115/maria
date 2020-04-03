package e_static_sam;


public class DBConnect {

	static DBConnect con;		//class명으로 멤버변수 사용가능	//하나의 통로
	
	private DBConnect()//"생성자 함수" class와 동일한 이름, public대신 private 일부로 생성자 함수에 안불릴려고
	{
		System.out.println("실제로 db연결");	//데이터베이스랑 연결하는 작업
	}
	
	public static DBConnect getInstance()		//return값 con의 자료형을 써줌(DBConnect), single top패턴(web에서 자원을 아끼고 줄이기 위해 하나의 통로 생성)
	{
		if(con==null) con = new DBConnect();	//DBConnect에 아무것도 연결되어있지 않으면 그때 불러올수있는 함수
		//메모리에 단하나뿐으로 올릴수있는 방법
		return con;
	}
}
