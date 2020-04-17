package Sittotal;

import javax.swing.*;
import javafx.scene.layout.Border;
import ticketing.GeneralReservation;
import vo.Consert_vo;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Sitmain extends JFrame{
		SitA a;
		SitB b;
		GeneralReservation gr;
		
		public Sitmain()
		{
		}

		public Sitmain(GeneralReservation gr) {
			super("좌석선택");
			this.gr = gr;
			a=new SitA(this, gr);
			b=new SitB(this, gr);
			
			JTabbedPane panel = new JTabbedPane();
			
			panel.add("A구역",a);
			panel.add("B구역",b);
			
			add(panel);
			
			setSize(1900,800);
			setVisible(true);
			setLocation(20, 20);
		}


		

}
