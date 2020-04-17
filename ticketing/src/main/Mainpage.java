package main;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Sittotal.SitA;
import Sittotal.SitB;
import Sittotal.Sitmain;
import ticketing.GeneralReservation;
import vo.Consert_vo;

public class Mainpage  extends JFrame {
	
	Tiket tiket;
	

	
	public Mainpage(){
		//객체생성
		JTabbedPane pane = new JTabbedPane();
		tiket =  new Tiket();
		
		
		pane.add("예매",tiket);
		
		add(pane);
	
		//화면출력
		setLocation(200, 200);
		setSize(700,700 );
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	
	public static void main(String[] args) {
	
		new Mainpage();
		System.out.println(new Consert_vo().toString());

	}

}
