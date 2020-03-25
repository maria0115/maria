package e_method;

public class Ex03_2CallByRef {
	/**
	 *  메소드의 인자가 참조형인 경우
	 *  		-> 주소 복사됨
	 *  		call by reference 
	 */
	
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("안녕");	//StringBuffer class형
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("A=" + a + ", B=" + b );
		 
	}
	
	static void add(StringBuffer a,StringBuffer b) //같은 주소값때문에 원본이 수정됨
	{
		// a+=b
		a.append(b);	// 주소값 변경하지 않고 같은 번지수에 글자 추가 
		System.out.println("A=" + a + ", B=" + b );
	}

}
