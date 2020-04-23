package posview;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class PosMain extends JFrame {


	public PosMain(){
		
		JTabbedPane pane = new JTabbedPane();
		pane.add("POS",new Pos());
		add(pane);
		
		//객체생성
//		JTabbedPane pane = new JTabbedPane();
//		pane.add("간식 & 음료",??????);
//		add(pane);
	
		//화면출력
		setLocation(500, 500);
		setSize(700,700 );
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new PosMain();
		
	}

}
