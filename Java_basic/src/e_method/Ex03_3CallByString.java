package e_method;

public class Ex03_3CallByString {
	

		public static void main(String[] args) {
			String a = new String("안녕");	//StringBuffer class형
			String b = new String("하이");
			
			add(a, b);
			System.out.println("A=" + a + ", B=" + b );
			 
		}
		
		static void add(String a,String b) //같은 주소값때문에 원본이 수정됨
		{
			// a+=b
			a+=b;	// 주소값 변경하지 않고 같은 번지수에 글자 추가 
			System.out.println("A=" + a + ", B=" + b );
		}
	
}
