package e_static_sam;


public class ViewA {
	
	DBConnect db;	//null안써도 초기화됨, new를 못쓰는 이유는 DBConnect에 private때문에 안불려와서
	
	
	public ViewA()	//생성자 함수
	{
		//db = new DBConnect();	//화면에서 dbconnect에 연결하는 함수
		db= DBConnect.getInstance();
	}
	
	public void use()
	{
		System.out.println("디비 작업중");	//화면에 올릴 작업중
	}

}
