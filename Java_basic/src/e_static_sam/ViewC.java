package e_static_sam;


public class ViewC {
	
	DBConnect db;	//null안써도 초기화됨
	
	public ViewC()	//생성자 함수
	{
		//db = new DBConnect();
		db= DBConnect.getInstance();
	}
	
	public void use()
	{
		System.out.println("디비 작업중");
	}

}
