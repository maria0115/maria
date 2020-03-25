package a_datatype;

import java.util.Scanner;

public class Exam {

	//완벽 정리
	//main 친 후 ctlr+space 치면 main 생성
	//드래그 후 ctlr+i = 줄맞춤
	public static void main(String[] args) {
		// 나이와 키를 입력받아서 출력
		
		int age=0;
		double tall=0;
		String name;
		
		//1.입력받을 가상통로 생성
		Scanner put=new Scanner(System.in);	
		// Scanner만 치고 ctlr+space 입력하면 import까지 생성
		// 스캐너의 변수를 생성한다 스캐너의 용도는 시스템의 입력

		//나이
		System.out.println("나이를 입력하시오");
		age = put.nextInt(); // 2. 변수에 입력받은 값을 저장
 
		//키
		System.out.println("키를 입력하시오");
		tall = put.nextDouble(); // 3. 입력받을 변수에다 통로에 있는 값을 넘겨라(같은 형식으로)
		// next후의 형식은 저장할 변수와 같아야함
		
		//이름
		System.out.println("이름은 뭐야");
//		name = put.next(); 
		put.nextLine();	//의미없이 해주는 이유는 키를 입력한 후 엔터를 치면 nextLine이 인식해서 이름입력을 못하기 때문
		name = put.nextLine();// space까지 입력받을 수 있음
		
		System.out.println("이름은\t"+name);
		System.out.println("나이는?\t"+age);
		System.out.println("키는?\t"+tall);


	}

}
