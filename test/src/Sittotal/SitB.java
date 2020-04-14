package Sittotal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SitB extends JPanel implements ActionListener{
	
	JButton [] jbs1 = new JButton[300]; //좌석을 위한 버튼
	JLabel jl1;
	int stnum [] = new int [] {};
	String sitname = "A구역";
	
	public SitB() {
		
		setLayout();
		
	}
	
	public void setLayout() {
		
		// A구역
		setLayout(new BorderLayout());
		JPanel jp = new JPanel(new GridLayout(10, 30));
		jl1 = new JLabel("B구역");
		jl1.setFont(jl1.getFont().deriveFont(30.0f));

		for (int i = 0; i < jbs1.length; i++) {
			jbs1[i] = new JButton();
			jbs1[i].setBackground(Color.gray);
		}

		for (int i = 0; i < jbs1.length; i++) {
			jp.add(jbs1[i]);
		}

		add(jl1, BorderLayout.NORTH);
		add(jp, FlowLayout.CENTER);
		
	}
	
	void eventProc() {
		for(int i=0; i<jbs1.length ; i++) {
			jbs1[i].addActionListener(this);
		}
		
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton ev = (JButton)e.getSource();
		
		for(int i=0 ; i<jbs1.length ; i++) {
	
			
			
			}
			
		}
		
	

}


