package e_event;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TestC extends JFrame{
//멤버변수선언
	JButton jb;
	TextField tf;
	TestC()
	{//객체생성 
		jb = new JButton("버튼");
		tf = new TextField(40);
				
	}
	
	void Display()
	{//화면 출력
		setLayout(new FlowLayout());
		add(jb);
		add(tf);
		
		setSize(500,500);
		setLocation(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void eventProc()
	{
		//(1)이벤트 핸들러
		//(2)이벤트 핸들러 객체 생성
		//(3)이벤트 연결
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {	//jvm이 사용자가 입력할때 불러오는 함수
				//Object evt = e.getSource();
					String msg = jb.getText();
					JOptionPane.showMessageDialog(null,msg + "이벤트 발생");
				
			}
			
		});
		tf.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {	//jvm이 사용자가 입력할때 불러오는 함수
				//Object evt = e.getSource();
					String msg = tf.getText();
					JOptionPane.showMessageDialog(null,msg + "을출력하셨습니다");
				
			}
			
		});

	}
	
	//class MyEvent implements ActionListener
	
	public static void main(String[] args) {
		TestC test = new TestC();
		test.Display();
		test.eventProc();
	}

}
