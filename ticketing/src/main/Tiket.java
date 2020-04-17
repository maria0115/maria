package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Sittotal.Sitmain;
import ticketing.GeneralReservation;
import ticketing.Ticket;

public class Tiket extends JPanel implements ActionListener{

	JButton []jb = new JButton [2];
	JFrame jf;
	Sitmain sm;
	Mainpage mp;
	GeneralReservation g;
	Ticket t;

	public Tiket() {

		setLayout();
		eventProc();

	}

	public void setLayout() {

		JPanel jp = new JPanel(new GridLayout(1, 2));


		for(int i=0 ; i<2 ; i++) {
			jb[i] = new JButton(new ImageIcon("src/tiketing/tiketimg/"+i+".png"));
			jb[i].setBackground(Color.white);
			jb[i].setRolloverIcon(new ImageIcon("src/tiketing/tiketimg1/"+i+".png"));
		}

		for(int i=0 ; i<jb.length ; i++) {
			jp.add(jb[i]);
		}


		add(jp, BorderLayout.CENTER);

	}
	public void eventProc() {

		for(int i=0; i<jb.length ; i++) {

			jb[i].addActionListener(this);
		}		
	}

	public void actionPerformed(ActionEvent e) {
		JButton ev = (JButton)e.getSource();


			if(ev == jb[0]) 
			{
				g = new GeneralReservation();

			}else if(ev == jb[1]) 
			{
				String number = JOptionPane.showInputDialog("회원번호를 입력해주세요");
				//System.out.println(number);
				//"선예매한사람중 이 회원번호인 사람이 맞다면"
				if(number.equals("1234"))
				{
					t = new Ticket();
				}
			}					
		

	}	

}
