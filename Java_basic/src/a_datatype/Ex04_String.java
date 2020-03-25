package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		

		String a;
		a=new String("홍길동");
		
		String b = new String("홍길동"); //new안쓰면 축약형 자바가 머릴 써서 똑같은 번지수를 사용해서 출력
		
		if(a==b)
		{
			System.out.println("동일");
			
		}
		else
		{
			System.out.println("다름");//
		}
		
		if(a.equals(b))	
		{
			System.out.println("동일2");
			
		}
		else
		{
			System.out.println("다름2");//
		}
		String s ="";
		long l=1L;
		float fff =l;
		System.out.println(+fff);
		
		char chhh='글';
		int i=chhh;
		System.out.println(i);
		
		byte aaa = 64;

		byte bbb = 100;

		byte result = (byte)(aaa + bbb);

		System.out.println("result = " + result );
		
		byte aa = 64;

		byte bb = 64;

		byte result1 = (byte)(aa + bb);

		System.out.println("result = " + result1 );
		
		
	}

}
