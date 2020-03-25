
public class Test {
	public static void main ( String  [] args ) {

		byte  b = 127;

        char  ch = '글';

        int    i = 20000000;

    long  l =  1L;


//
       //(1)
       b = ( byte ) i;
       //b = i; //생략불가능
       System.out.println(b);	
//
//        (2)
       i = ( int ) ch;
       i = ch; //생략가능
//
//        (3)
       int  var = ( int ) b;
       int  var1 = b; //생략가능
//
//        (4)
       float  f = (float) l;
       float  f1 = l; //생략가능하지만 계산해야하기 때문에 권장하지 않음, double과 구조자체가 다르기 때문에
//
//(5) 
       l = (long)i;
       l = i; //생략가능 큰 범위에 작은 수는 문제되지 않음
       
       float ff = (float)3.5; // or
       float ff1 = 3.5f;




		}

}
