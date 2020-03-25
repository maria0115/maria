package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		
		/*
		// [1]
		System.out.println("a="+a+",b="+b);
		System.out.println("a="+(a+1)+",b="+(b+1));
		
		
		// [2]
		a=++a;
		b=--b;
		System.out.println("a="+a+",b="+b);
		
		++a;
		--b;
		System.out.println("a="+a+",b="+b);
		*/
		/*
		//[3] 위치중요
		int result = ++a;
		System.out.println("결과: "+result);//6
		int result1 = b--;//7
		System.out.println("결과: "+result1);
		System.out.println("b: "+b);
		*/
		//[4]
		System.out.println("a="+ ++a + ",b=" +  --b); //6 6
		System.out.println("a="+ a++ + ",b=" +  b--); //6 6
		System.out.println("a="+ a + ",b=" +  b); //7 5
		
	}

}
