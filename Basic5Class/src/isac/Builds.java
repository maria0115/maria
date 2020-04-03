package isac;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
import javax.swing.event.*;

public class Builds extends JPanel{

	JTextField tf;
	JLabel b;
	JTextArea ta;
	int result;
	String result2;

	Mainisac isa;
	public Builds(Mainisac isa)
	{
		this.isa=isa;
		//Mainisac isac = new Mainisac();
		Builds1();
		getResult();
		
		
	}
	
	
	public void setResult2(String result2) {
		this.result2 = result2;
		ta.setText(result2);
	}


	public void setResult(int result) {
		this.result = result;
		System.out.println(">>>>>>>>>>>>>"+result);
		tf.setText(Integer.toString(result));
	}


	public int getResult() {
		return result;
	}


	void Builds1()
	{
		//this.=isa.total1;
		//tf = new JTextField(Integer.toString(total),40);
		tf = new JTextField(Integer.toString(result));
		ta = new JTextArea();
		b = new JLabel("이삭토스트 라벨");
		setLayout(new BorderLayout());
		add(ta,BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		add(b, BorderLayout.NORTH);
	}
	
}
