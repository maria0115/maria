package d_cal;

import java.awt.*;
import java.util.*;
import java.lang.*;

import javax.swing.*;;

public class ABCtest extends JFrame{
	// 1. 멤버변수 선언
	
	// 2. 객체 생성
	JTextArea ta;
	JTextField tf;
	JButton b[]=new JButton[26];
	public ABCtest()
	{
		super("계산기");
		ta = new JTextArea();
		tf = new JTextField();
//		
		int i=0;
		for(char c = 'A'; c<='Z';c++)
		{
			
			b[i] = new JButton(String.valueOf(c));
			i++;
			//System.out.println(b[i]);
		}
		
	}
	


	//3. 화면 구성 및 출력하기
	public void display()
	{
		setLayout(new BorderLayout());
		JPanel jp = new JPanel(new GridLayout(2,13));

		for(int i =0; i<26;i++)
		{
			jp.add(b[i]);
			
		}
		
		add(tf, BorderLayout.NORTH);
		add(jp, BorderLayout.CENTER);
		
		
		setLocation(200, 200);
		setSize(700,560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		ABCtest t = new ABCtest();
		t.display();
	}

}
