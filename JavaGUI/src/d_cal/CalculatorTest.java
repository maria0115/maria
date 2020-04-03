package d_cal;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;;

public class CalculatorTest extends JFrame implements ActionListener{
	// 1. 멤버변수 선언



	// 2. 객체 생성
	JTextArea ta;
	JTextField tf;
	String op;
	int prev;
	//JButton b1,b2, b3, b4, b5, b6,b7,b8,b9,
	JButton b10, b11, b12,b13,b14,b15,b16;
	JButton b[]=new JButton[10];
	public CalculatorTest()
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
		b16 = new JButton("C");

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
		add(b16, BorderLayout.SOUTH);


		setLocation(200, 200);
		setSize(700,560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		CalculatorTest t = new CalculatorTest();
		t.display();
		t.evenProc();

	}

	public void evenProc()
	{
		for(int i= 0 ;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
		b10.addActionListener(this);
		
		//b[0].addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		for(int i =0 ; i< b.length;i++)
		{
			//숫자가 눌렸을때
			if(evt == b[i])
			{
				String su=tf.getText();

				su += b[i].getText();

				tf.setText(su);

			}
		}
		/*
		 * b10 = new JButton("+");
		//b11 = new JButton("0");
		b12 = new JButton("-");
		b13 = new JButton("=");
		b14 = new JButton("*");
		b15 = new JButton("/");
		 */
		// 연산자가 눌렸을때

		if(evt == b10)
		{
			prev =  Integer.parseInt(tf.getText());	//이전값변수에 출력된 값 입력
			tf.setText(null); //필드에 값 없애기
			//tf.setText(b10.getText());
			op= evt.getText();	// op에 연산자 넣어주기
		}
		else if(evt == b12)
		{
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op= evt.getText();
		}
		else if(evt == b14)
		{
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op= evt.getText();
		}
		else if(evt == b15)
		{
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op= evt.getText();
		}
		// '='버튼이 눌렸을때
		if(evt == b13)
		{

			switch(op)	//연산자
			{
			case "+" : 
				int first = Integer.parseInt(tf.getText()); //방금 입력한 값
				int result = prev + first;

				tf.setText(String.valueOf(result));
				break;
			case "-" :
				int second = Integer.parseInt(tf.getText());
				int result1 = prev - second;
				tf.setText(String.valueOf(result1));break;
			case "*" : 
				int third = Integer.parseInt(tf.getText());
				int result2 = prev * third;
				tf.setText(String.valueOf(result2));break;
			case "/" : 
				int four = Integer.parseInt(tf.getText());
				int result3 = prev / four;
				tf.setText(String.valueOf(result3));break;
			}
		}
		if(evt==b16)
		{
			prev =0;
			tf.setText(null);
		}

	}

}
