package a_sample;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.*;

// is-a 방식

public class Test2 extends JFrame{
	//멤버변수 선언
	//"남자" 라디오 버튼 / "여자" 라디오 버튼
	//"성인" 라디오 버튼 / "미성년" 라디오 버튼
	
	JRadioButton jrbman, jrbwoman, jrbadult;
	JRadioButton jrbkid = new JRadioButton("미성년",true);	//정해져있는건 여기서 미리 해줘도 상관 무
	
	public Test2()
	{
		//super(); 상속받으면 자동으로 뜸
		super("나의 창");	//내가 부모의 기본생성자 말고 다른 생성자 함수 부르고 싶다면 내가 직접쓰기
		
		// 객체 생성
		jrbman = new JRadioButton("남자",true);
		jrbwoman= new JRadioButton("여자");
		jrbadult= new JRadioButton("성인");
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(jrbman);
		group.add(jrbwoman);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(jrbadult);
		group1.add(jrbkid);
		
		
		//붙이기
		setLayout(new FlowLayout());
		// 버튼 띄우기
		add(jrbman);
		add(jrbwoman);
		add(jrbadult);
		add(jrbkid);
		
		
		
			
		//화면 출력
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Test2 t = new Test2();

	}

}
