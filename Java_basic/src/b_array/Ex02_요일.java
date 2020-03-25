package b_array;

import java.util.Calendar;

public class Ex02_요일 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	
		//new 쓰지 않고 얻어오는 함수
		//내가 만들지 않아서 new 사용안함
		
		int y= cal.get(Calendar.YEAR);
		int m= cal.get(Calendar.MONTH)+1;
		int d= cal.get(Calendar.DATE);
		System.out.println(y+"년"+m+"월"+d+"일");

		int h= cal.get(Calendar.HOUR)+12;
		int m1= cal.get(Calendar.MINUTE);
		int s= cal.get(Calendar.SECOND);
		System.out.println(h+"시"+m1+"분"+s+"초");
		
		//요일 : 일요일(1) ~ 토요일(7)
		
		String day[]= {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일" ,"토요일"};
		
		System.out.println(day[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		
	}

}
