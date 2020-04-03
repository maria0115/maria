package j_final;

final class Parent{
	 final String field = "부모님꺼";
	 final public void jib (){
	  System.out.println("부모님이 만드신거");
	 }
	} 
//class Child extends Parent{
//
//	Child()
//	{
//		super.field = "내꺼";
//	}
//	public void jib ()
//	{
//		System.out.println("내가 만든거");
//	}
//}

//public class Test {
//	 public static void main(String[] args) {
//		 Child p = new Child();
//		  System.out.println(p.field);
//		  p.jib();
//	 }
//	}


//class Parent {
//
//int  i = 7;
//
//public int get() {  return i ; }
//
//}
//
//class Child extends Parent {
//
//int  i = 5 ;
//
//public int get() {  return i ; }
//
//}
//
//public class Test {
//
//public static void main ( String [] args ) {
//
//   Parent  p = new Parent ();
//
//   System.out.println("---------------------1---------------------");
//
//   System.out.println( p.i );
//
//   System.out.println( p.get( ) );
//
//Child  c = new Child ();
//
//   System.out.println("---------------------2---------------------");
//
//   System.out.println( c.i );
//
//   System.out.println( c.get( ) );
//
//   Parent  p2 = new Child ();
//
//   System.out.println("---------------------3---------------------");
//
//   System.out.println( p2.i );
//
//   System.out.println( p2.get( ) );
//
//}
//
//}
