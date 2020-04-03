package g_tabpane;

import javax.swing.*;
import java.awt.*;

public class VideoShop extends JFrame{

	VideoAdmin va;
	RentAdmin ra;
	CustomerAdmin ca;
	
	VideoShop()
	{
		va = new VideoAdmin();
		ra = new RentAdmin();
		ca = new CustomerAdmin();
		
		JTabbedPane pane = new JTabbedPane();
		
		pane.add("비디오 관리",va);
		pane.add("대여관리",ra);
		pane.add("고객관리",ca);
		add(pane);
		
		setSize(800,800);
		setVisible(true);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new VideoShop();
	}

}
