 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a=3;
		//ShortCircuitLogic : 일반논리
		//if(3&4) - 이진논리
		//if(3>1&4>1) - 일반논리 대신 이진논리
		//하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		
//		if(a>3 && ++a>3)//( False*true )and= false
//		{
//			System.out.println("조건을 만족했습니다");
//		}
//		System.out.println("A="+a);
//		if(a>3 || ++a>3)//( False*true )or= true
//		{
//			System.out.println("조건을 만족했습니다2");
//		}
//		System.out.println("A="+a);
		
		if(a>3 & ++a>3)//( False*true )and= false이지만 하나짜리 비트연산자로 조건 실행
		{
			System.out.println("조건을 만족했습니다");
		}
		System.out.println("A="+a);
		if(a>3 | ++a>3)//( False*true )or= true
		{
			System.out.println("조건을 만족했습니다2");
		}
		System.out.println("A="+a);
		
		/*  
		 *  결과
		 *  A=4
			조건을 만족했습니다2
			A=5 */

		

		
	}

}
