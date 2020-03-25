package b_useful_class;

public class StringStringbuffer {		//이전에 디폴트로 자바가 만들어놨던 이름으로 클래스를 지으면 충돌 일어남

	public static void main(String[] args) {
		//0.기본형
		int a =10;		//memory는 stack에 잡힘 (4byte)
		a+=5;
		System.out.println(a);
		//1.String : 참조형	//클래스이기때문에 무조건 참조형
		
		String s = new String ("안녕");	//String은 무조건 new 붙여야함
		//s는 stack에 잡힘 (4byte) - new 사용시
		//s는 heap에 잡힘 (4byte) - new 미사용시 - stack이 heap의 번지수를 가리킴 
		//String s = "안녕";	//마치 기본형인것처럼 쓸수 있게끔 특권을 줌(많이 쓰기 때문에)
		s += "하세요"; 	//원래 연산은 안되지만 연산가능하도록 기본형처럼 사용
		// 새롭게 "안녕하세요"를 heap에 만든후 stack에는 heap 번지수를 가리킴
		// new 미사용시 "안녕"을 지정해준 heap에 stack번지수를 끊어줌 - 쓰레기됨
		//가비지 콜렉터는 쓰레기를 자동으로 수거
		
		//2. StringBuffer
		StringBuffer sb = new StringBuffer("행복한");
		//StringBuffer sb2 = "행복한";	//String만 기본형처럼 사용가능 new 무조건 사용해야함
		//sb = sb+"목요일";
		sb.append(" 목요일");		//sb = sb+"목요일";와 같음
		// heap 에 "행복한" 뒤에 쓰레기 번지수를 만들지 않고 "목요일"이 붙음
		
		
		System.out.println(sb);
		
		

	}

}
