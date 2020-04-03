package i_abstract;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 화면가정 - 여기서 그림을 그린다 가정
		Sharp s = method();		
		s.nulbi();
	}
	static Sharp method(){
		Scanner in = new Scanner(System.in);
		System.out.println("님이 원하는 도형은? 1.사각 2.원 3.삼각");
		int sel = in.nextInt();

		Sharp s = null;
		switch(sel){
		case 1 : s = new Rect(); break;
		case 2 : s = new Circle(); break;
		case 3 : s = new Tri(); break;
		}
		//s.draw();
	
		return s;
	}
	//		[ 추가 ] 밑변이나 높이 등의 값을 각각 입력 받아 넓이 구하기
}

abstract class Sharp{	//부모클래스
	public abstract void draw();
	public abstract void nulbi();
	
	
}
class Rect extends Sharp{
	int rect,rect1,nulbi;
	public void draw(){
		System.out.println("사각형");
	}
	public void rectangel(){
		System.out.println("사각형은 점 4개의 도형입니다.");
	}
	public void nulbi()
	{
		System.out.println("사각형의 높이와 길이를 입력하세요");
		Scanner in = new Scanner(System.in);
		rect=in.nextInt();
		rect1=in.nextInt();
		nulbi=rect*rect1;
		System.out.println("사각형의 넓이는 "+nulbi);
	}

}
class Circle  extends Sharp{
	double circle,nulbi;
	public void draw(){
		System.out.println("원");
	}
	public void nulbi()
	{
		System.out.println("원의 반지름을 입력하세요");
		Scanner in = new Scanner(System.in);
		circle = in.nextInt();
		nulbi= circle*3.14;
		System.out.println("원의 넓이는 "+nulbi);
	}
	
}
	class Tri  extends Sharp{
	int tri,tri2,nulbi;
	public void draw(){
		System.out.println("삼각형");
	
	}
	public void nulbi()
	{
		System.out.println("삼각형의 높이와 밑변을 입력하세요");
		Scanner in = new Scanner(System.in);
		tri = in.nextInt();
		tri2=in.nextInt();
		nulbi=(tri*tri2)/2;
		System.out.println("삼각형의 넓이는 "+nulbi);
	}
	
} 
 
