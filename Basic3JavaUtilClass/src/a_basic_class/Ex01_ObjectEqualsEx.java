package a_basic_class;

public class Ex01_ObjectEqualsEx
{
	public static void main(String[] args)
	{
		 StudentA  a = new StudentA("012345", "송혜교");
		 StudentA  b = new StudentA("012345", "송혜교");
		 //Object의 equals() : ==
		 if( a.equals(b)) {	//student에 오브젝터가 소속이 되어있기 때문에 equals가 있음
			 System.out.println("객체 a와 b는 같다");
		 }else {
			 System.out.println("객체 a와 b는 다르다");
		 }

		 System.out.println( a  );//=(a.toString())
		 System.out.println( b  );
	}
}

class StudentA //자동으로 estends Object
{
	String  hakbun, name;
	StudentA( String  hakbun, String name)
	{
		this.hakbun = hakbun;
		this.name = name;
	}	
	public  String toString()
	{
		return hakbun + "/" + name;
	}

}


	









