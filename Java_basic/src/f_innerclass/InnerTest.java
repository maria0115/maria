package f_innerclass;

class Outer
{
	//멤버변수 처럼 취급
	 class Inner
	{
		 void naJabara(){
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.naJabara();
		
//		Outer.Inner in = new Outer.Inner();	//static 유무차이
//		in.naJabara();
		
		//Outer.Inner.naJabara();	////static 유무차이
	}
}

