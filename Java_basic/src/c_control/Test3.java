package c_control;

public class Test3 {

	public static void main(String[] args) {
//		 int i = 0, j = 0, k = 0;
//
//	      OUTER : for( i=0; i < 10 ; i++ )
//
//	           MIDDLE : for ( j=0; j < 3; j++ )
//
//	               INNER : for ( k=0; k < 4; k++ ) {
//
//	                    if( i==4 && j ==2 ) break OUTER;
//
//	               }
//
//	           System.out.println( i );
//
//	System.out.println( j );
//
//	System.out.println(k );
	
	  int  x = 1;

      while(  x++ < 3 )

           System.out.println(x);
	
	
	
//	 int i = 0, j = 0;
//
//     for( i = 0 ; i < 5 ; i++ ) {
//
//        for( j = 0 ; j < 4 ; j++ ) {
//
//            if( i == 2 && j == 1 ) break;
//
//            if( i == 3 && j == 2 ) continue;
//
//        }
//
//     }
//
//          System.out.println(“i = “ + i + “ , j = “ +  j );
	/*  1. 0으로 시작 해서    (0) 이 된 후명령 실행
		2. 0일때 조건을 읽고 (1) 이 된 후 명령 실행
		3. 1일때 조건을 읽고 (2) 이 된 후 명령 실행
		4. 2일때 조건을 읽고 (3) 이 된 후 명령 실행
		5. 3일때 조건을 읽고 (4) 이 된 후 명령 실행은 안하는데 j는 어쨋든 4*/

	}

}
