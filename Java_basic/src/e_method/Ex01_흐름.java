package e_method;

public class Ex01_흐름 {

	static void method()	//java main이 static이기 때문에 static이 아닌 함수는 부를수 없음
	{
		System.out.println("method시작했당");
	}
	public static void main(String[] args) {	//jvm이 main부터 찾고 시작
		System.out.println("메인함수 시작");
		method();

		System.out.println("main 함수 끝");
	}
	
	

}
/*
 * 
 * 메소드 명명 규칙
 * 		1. 문자+숫자+_+$ 조합
 * 		2. 길이 제한없음
 * 		3. 첫글자에 숫자만 아니면 됨
 * 		4. 대소문자 구별
 * 		5. 예약어(keyword)는 안됨
 * 
 * 		권장사항
 * 			- 클래스명의 첫글자는 대문자 시작
 * 			- 변수와 메소드명의 소문자로 시작
 * 			- 라벨명은 전부 대문자로
 * 			- 패키지명은 전부 소문자로
 * */
