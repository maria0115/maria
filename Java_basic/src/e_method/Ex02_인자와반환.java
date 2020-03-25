package e_method;

public class Ex02_인자와반환 {

	public static void main(String[] args) {
		// 데이터 입력
		int a=10 ,b=20;
		
		add(a,b);	//인자 메소드에 함수 보냄
	}
	
	static void add(int x, int y)	//인자를 받기위해 새로운 함수 생성, 변수명은 관계없으나 헷갈려서 보내는애랑 받는애의 이름을 같게함
	{
		int sum=0;
		sum=x+y;
		System.out.println("입력받은 데이터의 합"+sum);
	}

}
