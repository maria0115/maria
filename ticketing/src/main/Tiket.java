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

public class Tiket extends JPanel implements ActionListener{

	JButton []jb = new JButton [2];
	JFrame jf;
	Sitmain sm = new Sitmain();
	
	
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
		
		jb[0].addActionListener(new ActionListener() {
	        // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
	        public void actionPerformed(ActionEvent e) {
	            new GeneralReservation();
	        }
	        
	    });
		
		add(jp, BorderLayout.CENTER);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
//		JButton ev = (JButton)e.getSource();
//		
//		
//		
//		for(int i=0; i<2 ; i++) {
//			
//			if(ev == jb[0]) {
//			
//				new Window(sm);
//				
//				
//			}else if(ev == jb[1]) {
//				String number = (String)JOptionPane.showInputDialog(this, "회원번호를 입력해주세요", "회원정보확인", JOptionPane.PLAIN_MESSAGE, null,null,null);
//				System.out.println(number);
//			}
//			
//		}
//		
	}
	
	public void eventProc() {
		
		for(int i=0; i<jb.length ; i++) {

			jb[i].addActionListener(this);
		}
		
		
		
	}
	
	

}
