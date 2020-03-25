package c_control;

public class Switch_practice {

	public static void main(String[] args) {
		 int i =2, j=0;
		  switch ( i ) {
		      case 2 : j += 6;
		   case 4 : j += 1;
		   default : j += 2; //break없을시 다음으로 빠져나감 꼭써주기
		   case 0 : j += 4;
		  }
		  System.out.println( j );
	}

}
