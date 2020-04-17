package ticketing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

import Sittotal.SitA;
import Sittotal.Sitmain;
import javafx.scene.layout.Border;
import vo.Consert_vo;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Calendar;

public class GeneralReservation extends JFrame implements ActionListener{

	Sitmain sm;
	Ticket t;
	
	
	
	JTextArea ta;
	JLabel l_name = new JLabel("이름");
	JLabel l_tel = new JLabel("전화번호");
	JLabel l_consert = new JLabel("공연명");
	JLabel l_consu = new JLabel("매수");
	JLabel l_info = new JLabel("예매정보창");
	JTextField  tf_name = new JTextField(10);
	JTextField tf_tel = new JTextField(10);
	JTextField tf_su;
	JButton b_reservation = new JButton("예매");
	JButton b_seat = new JButton("좌석 선택");
	JButton b_plus = new JButton("+");
	JButton b_minus = new JButton("-");
	JList list;
	String[] name = { "Musical", "Consert", "Music"};
	String result_conname;
	Consert_vo cv = new Consert_vo();
	

	public String getResult_conname() {
		return result_conname;
	}

	public void setResult_conname(String result_conname) {
		this.result_conname = "이름 : "+cv.getName()+"\n"+"전화번호 : "+cv.getTel()+"\n"+"매수 : "+
				cv.getCount()+"\n"+"좌석 : "+result_conname;

		//System.out.println(result_conname+cv.getName()+cv.getTel()+cv.getCount());
	}

	public GeneralReservation()
	{		
		setLocation(200, 200);
		setSize(700,300);
		setVisible(true);
		Display();
		eventProc();
		setTa(ta);
	}

	public void Display()
	{	
		setLayout(new BorderLayout());
		tf_su = new JTextField("1");
		ta = new JTextArea("하아",50,30);
		list = new JList(name);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane jp = new JScrollPane(list);
		//( 이름, 전화번호, 예매 )왼쪽 패널
		JPanel pl = new JPanel(new GridLayout(4,1));
		JPanel pname = new JPanel(new FlowLayout());
		pname.setBackground(Color.white);
		//이름칸
		pname.add(l_name);
		pname.add(tf_name);
		pl.add(pname);
		//번호칸
		JPanel ptel = new JPanel(new FlowLayout());
		ptel.setBackground(Color.white);
		ptel.add(l_tel);
		ptel.add(tf_tel);
		pl.add(ptel);

		//공연명, 매수
		JPanel panel1 = new JPanel(new FlowLayout());
		panel1.setBackground(Color.white);
		panel1.add(l_consert);
		panel1.add(list);
		panel1.add(l_consu);
		panel1.add(b_plus);
		panel1.add(tf_su);
		panel1.add(b_minus);
		
		pl.add(panel1);
		
		//좌석선택, 예매버튼
		JPanel panel2 = new JPanel(new GridLayout(2,1));
		
		panel2.add(b_seat);
		panel2.add(b_reservation);

		pl.add(panel2);

		add(pl, BorderLayout.CENTER);	
		//( 정보창 )오른쪽 패널
		JPanel pinfo = new JPanel(new BorderLayout());
		pinfo.add(l_info, BorderLayout.NORTH);
		pinfo.add(ta, BorderLayout.CENTER);
		pinfo.setBackground(Color.white);
		add(pinfo,BorderLayout.EAST);
	}

	public JTextArea getTa() {
		return ta;
	}

	public void setTa(JTextArea ta) {
		this.ta = ta;
	}
	

	public void eventProc() {
		b_seat.addActionListener(this);	
		b_reservation.addActionListener(this);
		b_plus.addActionListener(this);
		b_minus.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton ev = (JButton)e.getSource();
		//JList ev1 = (JList)e.getSource();
		if(ev == b_seat)
		{			
				sm = new Sitmain(this);
				
				String name = tf_name.getText();
				String tel = tf_tel.getText();
				int count = Integer.parseInt(tf_su.getText());				
				cv.setName(name);
				cv.setTel(tel);
				cv.setCount(count);
		}
		else if(ev == b_reservation)
		{			
			t = new Ticket();

			
		}else if(ev == b_plus)
		{			
			int i = Integer.parseInt(tf_su.getText());
			i++;
			tf_su.setText(Integer.toString(i));
			
		}else if(ev == b_minus)
		{
			int i = Integer.parseInt(tf_su.getText());
			i--;
			tf_su.setText(Integer.toString(i));
		}
		
	}
	public void valueChanged(ListSelectionEvent e) {
		
		int seleccon = list.getSelectedIndex();
		for(int i =0; i<name.length;i++)
		{
			if (seleccon == i)
			{
				Consert_vo cv = new Consert_vo();
				cv.setConname(name[i]);
				
				
			}
				
			}
				
		}




		}


