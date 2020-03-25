package d_constructor;

class MyClass{
	   String name;
	   public MyClass() {
		   this("이름없음");
	       System.out.println("생성자 실행");
	      
	   }
	   public MyClass( String name ) {
	      this.name = name;
	   }  
	public static void main ( String [] args ) {
	      MyClass  my = new MyClass();
	 }
	}
