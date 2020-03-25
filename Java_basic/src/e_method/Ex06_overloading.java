package e_method;
/*
 * 오버로딩(overloading)
 * 	- 인자의 자료형과 갯수가 다른 동일한 함수들
 * 	- drawRect1,drawRect2,drawRect3
 * 	- 이 셋 각각의 인자가 다르면 drawRect로 동일하게 함수이름 지정해도
 * 		다른 함수로 인식해줌
 *  - 리턴형만 다른 함수는 오버로딩이 아닙니다.
 *  
 *  
 */
public class Ex06_overloading {

	public static void main(String[] args) {
		// 각각의 자료형 변수의 값에 "화이팅!!" 더하여 출력
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char [] ch = new char[] {'홍','길','이'};
		
		fighting(str);
		fighting(sb);
		fighting(ch);
		
	}
	
	static void fighting(String str)
	{
		System.out.println(str+"화이팅!!");
	}
	static void fighting(StringBuffer sb)
	{
		System.out.println(sb.append("화이팅!!"));	//println이라는게 문자열로 처리해서 먹힘 //sb + "화이팅!!"
	}
//	static void fighting(char ch[])
//	{
//		for(int i =0 ;i<ch.length;i++)
//		{
//			System.out.print(ch[i]);	//StringBuffer쓰는게 나을듯 문자열의 변화가 심할때는 쓰레기가 남지 않은 StringBuffer가 적격
//		}
//		System.out.print("화이팅!!");
//	}
	static void fighting(char ch[])
	{
		StringBuffer str = new StringBuffer();
		for(int i =0 ;i<ch.length;i++)
		{
			str.append(ch[i]);
		}
		System.out.print(str+"화이팅!!");
	}
/*
 * void add (int a, int b)
 * {}						//같은함수로 취급, 충돌일어남
 * int add (int x, int y)
 * {}
 * 
 */
}
