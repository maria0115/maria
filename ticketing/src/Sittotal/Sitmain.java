package Sittotal;

import javax.swing.*;
import javafx.scene.layout.Border;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Calendar;

public class Sitmain extends JFrame{
		SitA a;
		SitB b;		
		
		public Sitmain()
		{
			super("좌석선택");
			a=new SitA();
			b=new SitB();
			
			JTabbedPane panel = new JTabbedPane();
			
			panel.add("A구역",a);
			panel.add("B구역",b);
			
			add(panel);
			setSize(1900,800);
			setVisible(true);
			setLocation(20, 20);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
	public static void main(String[] args)  {
		
		Sitmain me = new Sitmain();
		//SitA sita = new SitA();

	}
	

}
