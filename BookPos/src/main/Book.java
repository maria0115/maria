package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import posview.Join;
import posview.Pos;
import posview.customer;

public class Book extends JPanel implements ActionListener{

	JButton []jb = new JButton[3];
	JFrame jf;
	Pos po ;

	public Book() {
		setLayout(); 
		eventProc();

	}
 
	public void setLayout() { //화면설정 
		
		setLayout(new GridLayout(1,3));
		
		for(int i=0 ; i<jb.length ; i++) {
			
			jb[i] = new JButton(new ImageIcon("src/posview/img/"+i+".png"));
			jb[i].setRolloverIcon(new ImageIcon("src/posview/img1/"+i+".png"));
			jb[i].setBackground(Color.white);
			add(jb[i], BorderLayout.CENTER);
			
		}
		
	}
	public void eventProc() {
		 
		for(int i=0 ; i<jb.length ; i++) {
			jb[i].addActionListener(this);
		} 
		
			
	}

	public void actionPerformed(ActionEvent e) {
		JButton ev = (JButton)e.getSource();
		
			if(ev == jb[0]) { //비회원
				new Join();
			}else if(ev == jb[1]) { //회원
				new customer();
				
			}else if(ev==jb[2]) { //관리자
				new Pos();
			}
		

	}	

}
