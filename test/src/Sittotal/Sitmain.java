package Sittotal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Sitmain extends JFrame{
	

	SitA sita;
	SitB sitb;
	
	public Sitmain() {
		
		JTabbedPane pane = new JTabbedPane();
		sita = new SitA();
		sitb = new SitB();
		
		pane.add("A구역",sita);
		pane.add("B구역",sitb);
		
		add(pane);
		
		
		//화면출력
		setLocation(200, 200);
		setSize(700,700 );
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		new Sitmain();
		
	}
	
}
