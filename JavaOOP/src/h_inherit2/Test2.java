package h_inherit2;

//class Sample extends Math()	//Math가 final이어서 객체 생성만 가능
//{				//부모클래스의 값을 변경할 수 있기 때문
//	}

/*
 * is-a : MyFrame2 is a Frame
 * 
 * MyFrame2는 Frame이다
 * 
 */

import java.awt.*;

class MyFrame2 extends Frame	//부모가 하나뿐이어야함
{
	 MyFrame2()
	{		 
		//super();	//생성자 함수에 자동으로 들어오는 함수
		 //그래서 Frame이 먼저 들어옴
		 super("나의 두번째 화면");
		setSize(500,300);
		setVisible(true);
		
	}
	}

public class Test2 {

	public static void main(String[] args) {
		new MyFrame2();
		

	}

}
