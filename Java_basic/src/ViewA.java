
public class ViewA {
	
	DBConnect db;	//null안써도 초기화됨
	
	public ViewA()	//생성자 함수
	{
		db = new DBConnect();
	}
	
	public void use()
	{
		System.out.println("디비 작업중");
	}

}
