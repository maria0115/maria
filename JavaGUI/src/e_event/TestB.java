package e_event;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//(1)이벤트 핸들러
public class TestB extends JFrame implements ActionListener{
//멤버변수선언
	JButton jb;
	TextField tf;
	
	public TestB()
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
	
	public void actionPerformed(ActionEvent e) {
		
			Object evt = e.getSource();
			if(evt == jb)
			{
				String msg = jb.getText();
				JOptionPane.showMessageDialog(null,msg + "이벤트 발생");
			}else if(evt == tf)
			{
				String msg = tf.getText();
				JOptionPane.showMessageDialog(null, msg+"를 입력하셨습니다");
			}
	}
	void eventProc()
	{
		//(3)이벤트 연결
		jb.addActionListener(this);	//본인자신객체연결
		tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		////(2)이벤트 핸들러 객체 생성
		TestB test = new TestB();
		test.Display();
		test.eventProc();
	}

	
	

}
