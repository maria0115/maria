package c_info;
import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.*;



public class Infotest extends JFrame{
	
	//1. 멤버변수 선언
	JTextArea ta;
	JTextField  tfname, tfid, tftel, tfsex, tfage, tfhome;
	JButton bAdd,bshow, bsearch, bdelete, bexit, bcancle;
	
	Infotest()
	{	
		//2. 객체생성
		ta = new JTextArea();
		tfname = new JTextField(10);
		tfid = new JTextField(10);
		tftel = new JTextField(10);
		tfsex = new JTextField(10);
		tfage = new JTextField(10);
		tfhome = new JTextField(10);
		bAdd = new JButton("Add",new ImageIcon("src/c_info/imgs/10.jpg"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setPressedIcon(new ImageIcon("src/c_info/imgs/5.jpg"));
		bAdd.setRolloverIcon(new ImageIcon("src/c_info/imgs/6.jpg"));
		bAdd.setToolTipText("안녕 여러분 지민이에요 귀염뽀짝 망개입니당 여러분 사랑해요 내맘알죠? 망개망개망개떡><");
		bAdd.setMnemonic('i');//alt + i
		bcancle = new JButton("cancle",new ImageIcon("src/c_info/imgs/5.jpg"));
		bdelete = new JButton("delete",new ImageIcon("src/c_info/imgs/6.jpg"));
		bexit = new JButton("exit",new ImageIcon("src/c_info/imgs/7.jpg"));
		bsearch = new JButton("search",new ImageIcon("src/c_info/imgs/8.jpg"));
		bshow = new JButton("show",new ImageIcon("src/c_info/imgs/9.jpg"));
	}
	
	void display()
	{
		//3.화면 구성및 출력
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel(new GridLayout(6,2));

		p.add(new JLabel("나이",new ImageIcon("src/c_info/imgs/10.jpg"),JLabel.CENTER));	
		p.add(tfage);
		p.add(new JLabel("집",new ImageIcon("src/c_info/imgs/9.jpg"),JLabel.CENTER));		
		p.add(tfhome);
		p.add(new JLabel("아이디",new ImageIcon("src/c_info/imgs/8.jpg"),JLabel.CENTER));		
		p.add(tfid);
		p.add(new JLabel("이름",new ImageIcon("src/c_info/imgs/7.jpg"),JLabel.CENTER));		
		p.add(tfname);
		p.add(new JLabel("성별",new ImageIcon("src/c_info/imgs/6.jpg"),JLabel.CENTER));		
		p.add(tfsex);
		p.add(new JLabel("전번",new ImageIcon("src/c_info/imgs/5.jpg"),JLabel.CENTER));
		p.add(tftel);
		add(p, BorderLayout.WEST);
		JPanel p1 = new JPanel(new GridLayout(1,6));
		p1.add(bAdd);
		
		p1.add(bcancle);
		p1.add(bdelete);
		p1.add(bexit);
		p1.add(bsearch);
		p1.add(bshow);
		add(p1, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
		
		setLocation(200, 200);
		setSize(700,560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Infotest t = new Infotest();
		t.display();

	}

}
