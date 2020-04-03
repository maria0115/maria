package z_sample;

import javax.swing.*;

import java.lang.*;

import java.awt.*;


public class Login extends JFrame{
	//JFrame jf;
	JTextField ta;
	JTextField ta1;
	JButton jb;
	JPanel jp;

	public Login()
	{
		super("로그인창");
		ta = new JTextField();
		ta1 = new JTextField();
		jb = new JButton("로그인");
		

	}
	public void Display()
	{	
		setLayout(new BorderLayout());
		JLabel jl = new JLabel("아이디");
		JLabel jl2 = new JLabel("비밀번호");

		jp = new JPanel(new GridLayout(2,2));

		jp.add(jl);
		jp.add(ta);
		jp.add(jl2);
		jp.add(ta1);
		add(jp,BorderLayout.CENTER);
		add(jb, BorderLayout.EAST);


		setSize(500, 500);
		setVisible(true);
		//setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		//객체생성
		Login lo  =  new Login();
		lo.Display();


	}

}
