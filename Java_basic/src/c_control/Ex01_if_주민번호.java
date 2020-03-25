package c_control;

import java.util.Calendar;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		String zu ="970115-24";
		char sung = zu.charAt(7); //몇번째 문자하나
		// sung 변수의 값이 1이면 남자 출력 2면 여자출력
		
		if(sung=='1' | sung=='3'| sung=='9')	//까먹지 말고 문자''
		{
			System.out.println("남자");
		}else if(sung == '2' | sung=='4'| sung=='0')
		{
			System.out.println("여자");
		}
		// 나이구하기
		String age = zu.substring(0,2); //start 번째부터 end번째 앞까지
		//age = "80"
		
		//문자열을 정수로 변환
		int age2=Integer.parseInt(age);
		//age2 = 80;
		
		int nai=0;
		
		//올해 년도 구하기
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		
		if(sung=='1'| sung=='2')
		{
		nai=year-(1900+age2)+1;		//2020을 
		System.out.println(nai);}
		
		else if(sung=='3'| sung=='4')
		{
			nai=year-(2000+age2)+1;
			System.out.println(nai);}
		else if(sung=='0'| sung=='9')
		{
			nai=year-(1800+age2)+1;
			System.out.println(nai);}
		
		
		//switch 주민번호
		char city = zu.charAt(8); //'1
		String home="";
		
		switch(city)	//switch 문은 반드시 break;써주기
		{
		default : home="한국인"; break;
		case '0':home = "서울"; break;
		case '1':home="인천";break;
		case '2':home="경기";break;
		case '9':home="제주";break;
		
		}
		
		System.out.println("출신지: "+home);
		
		
		
		

	}

}
