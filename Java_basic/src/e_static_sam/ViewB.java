package e_static_sam;


public class ViewB {
	
	DBConnect db;	//null안써도 초기화됨
	
	public ViewB()	//생성자 함수
	{
		//db = new DBConnect();		//new를 쓰면 안되겠구나
		db= DBConnect.getInstance();
	}
	
	public void use()
	{
		System.out.println("디비 작업중");
	}

}
