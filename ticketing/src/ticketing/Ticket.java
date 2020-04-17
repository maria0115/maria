package ticketing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import vo.Consert_vo;

public class Ticket extends JFrame{

	JLabel l = new JLabel("티켓 출력");
	JButton b_put,b_modify,b_delete; //티켓 출력버튼
	JTextField tf_name, tf_tel, tf_seat, tf_date, tf_count, tf_conname ;
	JLabel ll_name = new JLabel("Name");		
	JLabel ll_id   = new JLabel("ID");
	JLabel ll_tel  = new JLabel("Tel");
	JLabel ll_sex  = new JLabel("Sex");
	JLabel ll_age  = new JLabel("Age");
	JLabel ll_home = new JLabel("Home");
	
	public Ticket()
	{
		super("티켓 출력창");
		
		Display();

	}

	void Display()
	{
		tf_name		= new JTextField(15);
		tf_tel		= new JTextField(15);
		tf_seat		= new JTextField(15);
		tf_date		= new JTextField(15);
		tf_count	= new JTextField(15);
		tf_conname	= new JTextField(15);
		JLabel ll_name = new JLabel("Name");		
		JLabel ll_tel  = new JLabel("Tel");
		JLabel ll_seat   = new JLabel("Seat");
		JLabel ll_date  = new JLabel("Date");
		JLabel ll_count  = new JLabel("Count");
		JLabel ll_conname = new JLabel("ConsertName");

		
		b_put = new JButton("티켓 출력");
		b_modify = new JButton("티켓 수정");
		b_delete = new JButton("티켓 취소");
		setLayout(new BorderLayout());
		JPanel p_center	 = new JPanel( new GridLayout(6,2));
		p_center.add( ll_name);
		p_center.add( tf_name );
		p_center.add( ll_tel);
		p_center.add( tf_tel );
		p_center.add( ll_seat);
		p_center.add( tf_seat );
		p_center.add( ll_date);
		p_center.add( tf_date );
		p_center.add( ll_count);
		p_center.add( tf_count );
		p_center.add( ll_conname);
		p_center.add( tf_conname );
		
		add(l, BorderLayout.NORTH);
		add(p_center, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.add(b_modify);
		panel.add(b_delete);
		panel.add(b_put);
		add(panel, BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
		setLocation(20, 20);
	}


}
