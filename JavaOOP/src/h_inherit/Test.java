package h_inherit;

/*
 * 
 * overloading : 동일한 함수명으로 인자의 자료형과 갯수 다른 함수들
 * 
 * overriding : 상속관계에서 인자와 반환값까지 동일한 함수들
 */

public class Test {

	public static void main(String[] args) {

		//1. 각각의 클래스 생성
		
//		Umma u= new Umma();
//		u.gene();
//		u.job();
//		
		
		//d는 Umma와 Ddal class를 동시에 가지고 있는 메모리
		
//		Ddal d =new Ddal();
//		d.gene();
//		d.study();
//		
//		d.job();
		
		//2. 부모 변수에 자식 객체 생성
		
//		Umma dal = new Ddal();	//메모리가 엄마와 딸까지의 영역에 엄마의 변수만 참조하고 싶음, 문제 안됨
//		
//		//dal.study(); //엄마 클래스만 접근할수있음
//		dal.job();
//		dal.gene();	//엄마클래스에서 끌어와야 하는데 딸꺼 가지고옴
		//상속관계에서 오버라이딩은 자식거 가지고옴
		
		//3. 객체임을 확인
//		Ddal d = new Ddal();
//		if(d instanceof Ddal)
//		{
//			System.out.println("딸 객체");
//		}
//		if(d instanceof Umma)
//		{
//			System.out.println("부모 객체");//나오는 이유 이미 메모리에 있단것
//		}
		
		//4.형변환
		// (casting) : 기본형 / 상속관계의 클래스
		// 
		
//		Umma u= new Umma();
//		
//		Ddal d = (Ddal)u;	//존재하지도 않은 메모리(딸부분 까지) 건들임
//		
		Ddal d = new Ddal();
		
		Umma u = (Umma)d;	// up-casting
		
		Ddal e = (Ddal)u;	// down-casting
		//이미 메모리 생성돼있기때문에 문제 없음
		
		
		
		
		
		
		
		
		
		
		
	}

}
