package d_cal;

import java.awt.*;

import javax.swing.*;;

public class CalculatorTest2 extends JFrame{
	// 1. 멤버변수 선언

	
	
	// 2. 객체 생성
	JTextArea ta;
	JTextField tf;
	//JButton b1,b2, b3, b4, b5, b6,b7,b8,b9,
	JButton b10, b11, b12,b13,b14,b15;
	JButton b[]=new JButton[10];
	public CalculatorTest2()
	{
		super("계산기");
		ta = new JTextArea();
		tf = new JTextField();
//		b1 = new JButton("1");
//		b2 = new JButton("2");
//		b3 = new JButton("3");
//		b4 = new JButton("4");
//		b5 = new JButton("5");
//		b6 = new JButton("6");
//		b7 = new JButton("7");
//		b8 = new JButton("8");
//		b9 = new JButton("9");
		
		for(int i =0 ; i<10;i++)
		{
			b[i] = new JButton(String.valueOf(i));
		}
		b10 = new JButton("+");
		//b11 = new JButton("0");
		b12 = new JButton("-");
		b13 = new JButton("=");
		b14 = new JButton("*");
		b15 = new JButton("/");
		
	}
	
	//3. 화면 구성 및 출력하기
	public void display()
	{
		setLayout(new BorderLayout());
		JPanel jp = new JPanel(new GridLayout(5,3));
//		jp.add(b1);
//		jp.add(b2);
//		jp.add(b3);
//		jp.add(b4);
//		jp.add(b5);
//		jp.add(b6);
//		jp.add(b7);
//		jp.add(b8);
//		jp.add(b9);
		
		for(int i =1; i<10;i++)
		{
			jp.add(b[i]);
		}
		
		jp.add(b10);
		jp.add(b[0]);
		jp.add(b12);
		jp.add(b13);
		jp.add(b14);
		jp.add(b15);
		
		add(tf, BorderLayout.NORTH);
		add(jp, BorderLayout.CENTER);
		
		
		setLocation(200, 200);
		setSize(700,560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		CalculatorTest2 t = new CalculatorTest2();
		t.display();
	}

}
