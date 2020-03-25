package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
			readArray();
		} catch (Exception e) {			
			e.printStackTrace();
			//System.out.println("예외 잡았다");
		}
		System.out.println("프로그램 정상종료");
	}

	static void readArray() throws Exception	//myexception을 알고 던지기
	{
		String []msg = new String[] {"행복하자","끝내자","맛난거드셔"};
		try {
		for(int i=0; i<=msg.length;i++)
		{
			System.out.println(msg[i]);
		}
		}catch(Exception ex)
		{
			//System.out.println("코로나 종식날을 기다리는 함수 예외"+ex.toString());
			throw new MyException(); //내가 만든 예외를 처리해주는 구문
		}
	}
}
