package e_static;

/*
	단 하나로 공유 : static
	
	-static을 붙이면 메모리에 먼저 올라감
	-객체 명이 아닌 클래스 명이 접근 가능 
	-객체 생성을 하지 않아도 실행가능
	
	method 에 static을 붙이는 이유는 클래스에 접근하기위해서 

 */
public class Main {

	public static void main(String[] args) {
		
//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();

		System.out.println("총 갯수: "+Book.getCount());
		
	}

}
