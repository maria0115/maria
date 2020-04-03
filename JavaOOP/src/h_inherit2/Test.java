package h_inherit2;

/*
 * has-a : MyFrame1 has a Frame관계
 * 
 * MyFrame1은 Frame을 가지고 잇다
 * 
 */

import java.awt.*;
class MyFrame1
{
	Frame f;
	MyFrame1()//생성자 함수
	{
		f = new Frame("나의 첫 화면");
		f.setSize(500, 300);
		f.setVisible(true);
	}
	}

public class Test {
	public static void main(String[] args) {
		new MyFrame1();	//변수쓸일없으면 안써도 됨
	}
}

