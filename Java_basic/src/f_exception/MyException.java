package f_exception;

public class MyException extends Exception {//Exception을 상속받겠다

	public String getMessage() {
		return "맨날 실수하는 예외: 배열범위 잘 봐라";
		
	}
}
