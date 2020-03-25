package e_method;

public class Ex02_인자와반환2 {

	public static void main(String[] args) {
	
		int sum = add();	//저장하는 함수지정
		System.out.println(sum);
		//출력
	}
	
	static int add()	//보내려는 함수의 형을 써줘야함
	{
		//데이터 입력
		int a=10, b=20;
		//계산
		int sum=a+b;
		return sum;
	}

}
//return	: 프로그램 흐름을 반환
			//단하나의 변수를 반환할수있음